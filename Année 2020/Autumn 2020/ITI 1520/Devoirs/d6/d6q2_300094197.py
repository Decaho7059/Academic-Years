#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#a) triangle
def triangle(n):
    '''(int)->str
    Affiche un dessin composé d'étoiles'''
    if n < 0:  #verifie si n negatif
        return None
    else:
        triangle(n - 1) #appel recursif
        print('*' * n) #affiche le triangle

#triangle(5)

#b) prodListePos_rec

def prodListePos_rec(l,n):
    '''(liste, int)->int
    Retourne le produit des éléments positifs'''
    if n == 1:
        return l[n-1]#retourne l si sa longueur est 1
    else:
        if l[n-1] > 0: #cherche les éléments positifs
            return l[n-1] * prodListePos_rec(l, n - 1) #Fais l'opération avec l'Appel recursif
        else:
            return prodListePos_rec(l, n - 1) #s'il n'y a pas de chiffre négatif continue de chercher jusqu'à stop

#l = [1, -2, 5, 0, 6, -5]
#print(prodListePos_rec(l, len(l)))

#c) palindrome

def palindrome(n):
    '''(str)->bool
    Retourne True si n est un palindrome'''
    l = len(n)
    if l < 2:  #verifie si la longueur est 1
        return True
    if n[0] != n[-1]:  #cherche de 0->n-1 et de n-1 ->0 si les éléments son pareil
        return False
    return palindrome(n[1:-1])#appel recursif de la fonction

#print(palindrome("abcba"))
