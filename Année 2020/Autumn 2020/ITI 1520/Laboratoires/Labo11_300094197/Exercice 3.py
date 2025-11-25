#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def pgcd(x, y):
    '''(int,int)->int
    Retourne le plus grand diviseur commun de 2 nombres
    '''

    if (x%y == 0): #verifie si les deux sont des multiples
        Divis = y  #si oui, prend val de y pour meilleur approxmation
    else:
        Divis = pgcd(y, x%y)  #appel recursif 
    return Divis

#print(pgcd(1234,4321))
#print(pgcd(8192,192))
#print(pgcd(12,18))
