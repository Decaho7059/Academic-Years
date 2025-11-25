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

def somme_matrices(m,n):
    '''(List de list de int, List de list de int)->Liste de liste de int
    Retourne une nouvelle matrice qui est la somme de deux autres entrés du clavier'''

    ligne = 0
    somme = []
    while ligne < len(m):
        colonne = 0
        somme.append([]) #ajouter dans la liste vide des index nul
        while colonne < len(m[ligne]):
            somme[ligne].append(m[ligne][colonne] + n[ligne][colonne])#ajouter aux index vides les valeurs de la somme des 2 matrices
            colonne+=1
        ligne+=1
    return somme

m = cree_matrice()
n = cree_matrice()
print(somme_matrices(m,n))
