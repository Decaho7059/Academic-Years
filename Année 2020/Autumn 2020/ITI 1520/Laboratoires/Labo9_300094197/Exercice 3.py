###Comments
###Student name : Decaho Gbegbe
###Student number : 300094197

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
    return matrice  #Cree une matrice

def compte_v(M,v):
    '''(List de list)->int
    Retourne le nombre d'occurences de v dans la matrice'''

    Npas = 0
    cpt = 0  #Valeur initial
    for i in range(len(M)): #parcourir les lignes
        for j in range(len(M[i])): #parcourir les colonnes
            if M[i][j] == v:
                cpt +=1
            Npas += 1
    print('Nombres de pas',Npas)
    return cpt  #nombre total d'occurrence
M = cree_matrice()
v = int(input('Quel est votre entier ?: '))
print(compte_v(M,v))
