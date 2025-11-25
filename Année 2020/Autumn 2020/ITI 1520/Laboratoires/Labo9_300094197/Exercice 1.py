#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

import random

def cherche(l3,n):
    ''' (list,int)->(int,bool)
    Retourne un bool et le nombre de pas effectuer pour le trouver'''

    Npas = 0 #valleur initial du cpt
    for i in l3:
        if n == i: # si n est dans la liste
            print('Nombres de pas', Npas)
            return True
            break
##        elif n not in l3: #si n n'est pas dans la liste
##            Npas = 100#valeur max prédéfinie
##            print('Nombres de pas', Npas)
##            return False
##            break 
        Npas +=1
    print('Nombres de pas',Npas)
    return False
        
l3 = []
N = 100
for i in range(N):
    v = random.randrange(1,N+1)
    l3.append(v)
print(l3)
print(cherche(l3,78))
