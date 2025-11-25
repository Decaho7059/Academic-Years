#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def magique(n):
    '''retourne True/False si 2 chiffres consécutifs de n sont égaux'''

    c1 = n//100   # permet de selectionner le 1er chiffre
    c2 =(n//10)%10   # permet de selectionner le 2e chiffre
    c3= n % 10   #permet de selectionner le 3e chiffre
    
    return (c1==3 and c2==3) or (c2==3 and c3==3) or (c3%4==0)  #Fais les comparaisons et affiche le bool


