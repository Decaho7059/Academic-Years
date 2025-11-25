#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def espaces(s):
    '''(str)->str
    Retourne une nouvelle liste avec des espaces insérés'''

    for i in range (0, len(s)):
        nS=s.replace('',' ')  #remplace le vide par des espaces
        nS=nS.strip()  # supprime les espaces du debut et de la fin
    return nS  #Retourne la nouvelle liste


#print(espaces('important'))
