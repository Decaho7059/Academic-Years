#Comments:
#Student name : Decaho Gbegbe
#Student number : 300094197

def somme_de_trois(x):
    """(tuple)->bool
    Retourne true si la somme de 3 éléments consécutive est 0"""

    res = False
    somme = 0
    i = 0
    for i in range(0,len(x)-2): #pour eviter un out of range
        somme = somme + x[i] + x[i+1] + x[i+2] #additionne les chiffres consécutifs
        if somme == 0:
            res = True
        i+=1
        somme =0 #réinitialiser la somme
    return res

#l = (1,2,-3,4,-1,3) #True
#l = (-1,1,8,2,-2,1,0) #False
#print(somme_de_trois(l))
        
