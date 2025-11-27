from flask import Flask, render_template, request
import random

app = Flask(__name__)

def lire_questions(fichier):
    with open(fichier, "r", encoding="utf-8") as f:
        lignes = f.readlines()

    questions = []
    question = {}
    for ligne in lignes:
        ligne = ligne.strip()

        if not ligne:
            continue  # Ignore les lignes vides

        # Si on rencontre la réponse correcte
        if ligne.startswith("Réponse :"):
            question["reponse"] = ligne.split("Réponse :")[1].strip()
            if "texte" in question and "choix" in question:
                questions.append(question)
            question = {}

        # Si on rencontre une nouvelle question
        elif question == {}:
            question = {"texte": ligne, "choix": []}

        # Si on rencontre un choix de réponse
        else:
            question["choix"].append(ligne)

    return questions

@app.route("/", methods=["GET", "POST"])
def quiz():
    questions = lire_questions("test.txt")  # Charger les questions
    random.shuffle(questions)

    if request.method == "POST":
        reponses = request.form.getlist("reponse")
        score = sum(1 for i, question in enumerate(questions) if reponses[i] == question["reponse"])
        return render_template("result.html", score=score, total=len(questions))

    return render_template("quiz.html", questions=questions)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
