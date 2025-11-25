###Comments
###Student name : Decaho Gbegbe
###Student number : 300094197

def recherche_binaire(L,v):
    '''(list,int)-> bool
    Retourne True si v est dans la liste tout en faisant
    le minimum de pas possible'''

    NPas = 0
    trouve = False
    i = 0
    j = len(L) - 1 
    while i != j + 1:
        NPas += 1
        m = (i + j) // 2  # pour trouver le milieu
        if L[m] == v:   # si on a trouve, retourne la position
            trouve = True
            break
        elif L[m] < v:  # fouille a la droite 
            i = m + 1
        else:           # fouille a la gauche
            j = m - 1
    print ("Nombre de pas", NPas)    #retourner le nombres total de pas
    return trouve

