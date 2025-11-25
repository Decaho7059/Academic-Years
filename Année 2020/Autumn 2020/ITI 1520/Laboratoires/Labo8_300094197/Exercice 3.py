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

def produit_matrices(M,N):
    '''(List de list de int, List de list de int)->List de list de int
    Retourne une nouvelle matrice qui est le produit de deux matrices'''

    ligne = 0
    produit = []
    while ligne < len(M): #parcourir la ligne M
        colonne = 0
        produit.append([])       
        while colonne < len(N[0]): #parcourir les colonnes de N
            b = 0
            A = 0
            while b < len(M[0]): #parcourir les colonnes de M
                A = A + M[ligne][b] * N[b][colonne] #additionne le produit de la ligne de la 1ere matrice a l'index 
                b+=1                                # i avec la colonne de la 2e liste au index j
            produit[ligne].append(A) #actualiser la nouvelle liste
            colonne+=1
        ligne+=1
    return produit

M = cree_matrice()
N = cree_matrice()
print(produit_matrices(M,N))
