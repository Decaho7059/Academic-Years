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

def modifierMat(matrice):
    '''(ensemble of list)-> emsemble of list
    Retourne une matrice avec toutes les valeurs paires par
    leurs racine carrée'''
    import math
    matrice1 = []
    ligne = 0
    while ligne < len(matrice):
        col = 0
        while col < len(matrice[ligne]):
            if matrice[ligne][col] % 2 ==0: #verifie si l'index est un multiple de 2
                matrice[ligne][col] = math.sqrt(matrice[ligne][col]) #remplace cet indice par sa racine
            col+=1
        ligne+=1
    return matrice1.append(matrice) #retourne la matrice modifier
                
matrice = cree_matrice()
modifierMat(matrice)
print(matrice)
