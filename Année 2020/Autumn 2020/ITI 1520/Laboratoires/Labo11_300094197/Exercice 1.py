#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def verif_elem(A,l):
    '''(list,int)->bool
    Verifie si tous les éléments de A sont entre 0 et 9
    '''

    if 0< (A[l-2] and A[l-1]) <=9:  #verif si le dernier est plus grand que le precedent
        if (l==2): #condition initiale de passage
            p = True
        else:
            p = verif_elem(A, l-1)  #appel recursif de la fonction
    else:
        p = False
    return p #resultat "bool"

#A = [3,11,9,5,9]
#print(verif_elem(A,len(A)))
#False
