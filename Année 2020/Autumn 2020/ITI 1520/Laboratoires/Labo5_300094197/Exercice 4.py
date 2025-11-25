#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exo 4

def écart_type(x):
    '''(list) -> float
    Calcul l'écart type des nombres d'une liste'''

    import math

    b = 0   # variables compteurs
    y = 0
    for i in x:   #effectue une boucle
        b = b + i
    a = b/len(x)  #moyenne de la liste
    for i in x:
        y = math.pow(i-a,2)+y  #calcul le carré du numérateur
        s = math.sqrt( y / (len(x)-1) )  #formule de l'écart-type
    print("L'écart-type est: "+str(round(s,2)))  #retourne le resultat
    return ""

ch = input("Entrer des valeurs séparés par des virgules: ")
l1 = list(eval(ch))
print(l1)
#print(écart_type(l1))

#[65, 60, 70, 84, 93]
#L'écart-type est: 13.72
