def sommeLRec(L,n):

    if n == 0:  #verifie si n est nul
        return 0
    if (n == 1) :  #Verifie si n est paire
        if (L[n-1]%2)==0:
            return L[n-1]  #retourne le resultat
        else:
            return 0
    else:
        if (L[n-1]%2)== 0: #tant que la taille de la liste est > 1 
            return L[n-1] + sommeLRec(L, n-1)  #fait l'opération
        else:
            return sommeLRec(L, n-1) #continu a chercher les paires
            


L=[1,2,5,6,4]
#L = [1,3]
#L= []
#L=[2,4,8]
n = len(L)
print(sommeLRec(L,n))
