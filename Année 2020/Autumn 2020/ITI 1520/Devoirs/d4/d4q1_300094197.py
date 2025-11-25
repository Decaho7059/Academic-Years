#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def nombreDivisibles(s,n):
    '''(list,int)->int
    Retourne le nombre d'éléments divisibles par n
    Precondition: n doit être un entier positif
    '''
    cpt = 0  # compteur
    for i in s:
        if i%n==0:     #verifie si i est divisible par n
            cpt = cpt + 1
    return cpt   #total compteur
s = input("Veuillez entrer une liste des entiers par des espaces: ").strip().split() #transforme une entrée en str 
a = []  # liste vide
for item in s:
    a.append(int(item))  # ajoute les entrées modifiées dans la new chaine
n = int(input("Veuillez entrer un entier positif: ")) #diviseurs
print("Le nombre des éléments diviibles par ",n,"est",nombreDivisibles(a,n)) #affiche le resultat final
