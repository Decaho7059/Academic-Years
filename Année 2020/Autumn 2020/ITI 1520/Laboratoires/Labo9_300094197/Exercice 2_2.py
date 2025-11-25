###Comments
###Student name : Decaho Gbegbe
###Student number : 300094197

import random

def compte(l3,v):
    '''(list,int)->int
    Retourne le nombre d'occurrences de v dans la liste'''
    cpt = 0
    Npas = 0  #valeurs initial
    for i in l3:
        if i == v:
            cpt+=1
        Npas+=1
    print('Nombres de pas',Npas)
    return cpt #le nombre total de v

N = 100
l3 = []
for i in range(N):
    v = random.randrange(1,N+1)
    l3.append(v)
print(l3)
print(compte(l3,6))
