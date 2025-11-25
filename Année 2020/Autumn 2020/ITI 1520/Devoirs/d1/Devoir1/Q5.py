#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def bibformatPrint():
    "affiche une chaine de caractère donner"

    a = str(input("SVP entrez l'auteur:"))
    t = str(input("SVP entrez le titre:"))
    v = str(input("SVP entrez la ville:"))
    m = str(input("SVP entrez la maison d'edition:"))
    y = str(input("SVP entrez l'annee de publication:"))

    print(a +" ("+y+"). "+t+". "+v+": "+m)
