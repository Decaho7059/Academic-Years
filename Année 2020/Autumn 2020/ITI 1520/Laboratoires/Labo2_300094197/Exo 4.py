#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def calculeSurface():

    import math
    coté1 = int(input("Valeur du coté1:"))
    coté2 = int(input("Valeur du coté2:"))
    coté3 = int(input("Valeur du coté3:"))

    p = coté1 + coté2 + coté3  #Formule périmètre
    s = math.sqrt(p*(p-2*coté1)*(p-2*coté2)*(p-2*coté3))/4  #Formule surface

    print("Le périmètre du triangle est:",p,". Et la surface du triangle est:",round(s,3))

calculeSurface()  # Affiche resultat
