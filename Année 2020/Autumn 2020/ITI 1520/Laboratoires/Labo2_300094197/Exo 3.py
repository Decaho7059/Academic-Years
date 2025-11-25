#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def calcul():

    devoirMoyenne = int(input("Donnez votre moyenne de devoir:"))
    partiel = int(input("Donnez votre note de partiel:"))
    examen = int(input("Donnez votre note d'exam:"))

    note = devoirMoyenne*25/100 + partiel*25/100 + examen*50/100  #méthode de calcul
    print(note)  #resultat
calcul() #appel de fonction
