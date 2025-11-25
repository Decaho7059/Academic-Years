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

def cherche_m(M,v):
    '''(List de list,int)->bool
    Retourner True si n est dans la matrice M et le nombre de
    pas effectuer pour le savoir'''

    Npas = 1 #valeur initial
    for i in range(len(M)): #parcourir les lignes
        for j in range(len(M[i])):  #parcourir les colones
            if M[i][j]== v: #verifier egalités
                print('Nombres de pas', Npas)
                return True
                break
            Npas+=1
    print('Nombres de pas',Npas) #nombres de pas total
    return False

M = cree_matrice()
v = int(input('Quel est votre entier ?:'))
print(cherche_m(M,v))
