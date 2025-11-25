#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def coder(s):
    '''(str)->str
    Retourne une nouvelle chaine de caractère codée'''

    s1 =''
    for i in range (0,len(s)-1,2): #boucle s'effectuant à chaque 2 index
        s1 = s1 + s[i+1]+s[i]       # Ajout des caractères dans la nouvelle liste 
    if len(s)%2 !=0:                #condition au cas ou len de s est impaire
        s1 = s1 + s[len(s)-1]       # Ajout de la lettre restante a le nouvelle liste
    return(s1)                      #Retourne la nouvelle liste final
