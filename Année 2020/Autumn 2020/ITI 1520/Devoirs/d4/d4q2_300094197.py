#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def sequenceDesDeux(s):
    '''(list)->bool
    Retourne True si il y a 2 nombres consécutifs égaux'''

    for i in range(0,len(s)-1):  
        if s[i] == s[i+1]: #verifie s'il y a 2 nombres identiques consécutifs
            return True #resultat sous condition
    return False  #resultat par défaut
            
    
ch = input("Veuillez entrer une liste de valeurs séparées par des espaces: ").strip().split()
l1=[]
for item in ch:
    l1.append(float(item)) #ajoute les entrées modifiées dans le chaine vide 
print(sequenceDesDeux(l1))  #execute le programme avec les variables globales
