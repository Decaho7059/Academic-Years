#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exo 1

def calculM(x):
    '''(list) -> float
    Retourne la moyenne d'une liste de nombre'''

    m = 0        #variable compteur
    for i in x:  # effectue une boucle sur toute la liste
        m = m + i  # donne une noouvelle valeur à s
    return m/len(x)  # effectue le calcul pour la moyenne
ch = input('valeur: ')
l1 = list(eval(ch))   # COnverti en liste toute chaîne de caractère
#print(l1)
print('La moyenne est: ', calculM(l1)) #affiche le resultat
