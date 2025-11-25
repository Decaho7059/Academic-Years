#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def cree_matrice():
    print("Entrez les nombres avec des espaces entre les colonnes.")
    print("Une rangee par ligne, et une ligne vide a la fin.")
    matrice = []
    while True:
        ligne = input()
        if not ligne: break
        valeurs = ligne.split()
        rangee = [int(val) for val in valeurs]
        matrice.append(rangee)
    return matrice #cree une matrice

def transpose(m):
    '''(List de list de int)->List de list de int
    Affiche une matrice transposer à partir d'une autre'''

    colonne = 0
    matrice_T = []
    while colonne < len(m[0]):
        ligne = 0
        matrice_T.append([])# cree une liste avec des index vide
        while ligne < len(m):
            matrice_T[colonne].append((m[ligne][colonne]))#ajouter a chaque index vide
            ligne+=1                                    #  l'entier correspondant a la matrice implémenter
        colonne+=1
    return matrice_T #retourner la matrice final

m = cree_matrice()
A=transpose(m)
print(A)
