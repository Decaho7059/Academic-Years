#Comments:
#Student name : Decaho Gbegbe
#Student number : 300094197

def move_zeros_v1(x):
    """(list)->list
    Retourne une nouvelle liste avec un ordre de chiffre
    différent"""

    tmp = []
    tmp1 = []
    for i in x:
        if i != 0 and 0 in x:
            tmp.append(i)
            tmp1=tmp[0:]+[0]*x.count(0)
    return tmp1

#l1 = [1,0,3,0,0,5,7]
#print(move_zeros_v1(l1))


def move_zeros_v2(x):
    """(list)->list
    Retourne une nouvelle liste avec un ordre de chiffre
    différent"""
    tmp = [0]*len(x) #creer une liste de mm longueur que x avec que des 0
    tmp_i=0
    for i in range (len(x)):
        if x[i]!=0:
            tmp[tmp_i]=x[i] ##cree une liste sans 0 en tmp
            tmp_i += 1
    for i in range(len(x)):
        x[i]=tmp[i]  #creer une nouvelle copie de x en tmp(en ajoutant les 0)

#x = [1, 0, 3, 0, 0, 5, 7]
#z=move_zeros_v2(x)
#print(x, z)
        

def move_zeros_v3(liste):
    """(list)->list
    Deplace les éléments de la liste initiale sans utiliser des
    listes temporaires"""

    i = 0
    b = len(liste)-1
    while i<b:
        if liste[i] == 0 and liste[b]!=0: #vérifie que les 2 listes ne sont pas égales
            liste[i]=liste[b]
            liste[b]=0 #reinitialisé la liste avec la longueur de x à 0
            i+=1
            b = b-1
        elif liste[i]==0 and liste[b]==0:
            b = b-1
        else:
            i +=1
    
##x = [1, 0, 3, 0, 0, 5, 7]
##t=move_zeros_v3(x)
##print(x,t)
