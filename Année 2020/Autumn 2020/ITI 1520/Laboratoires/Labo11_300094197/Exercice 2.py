#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def liste_recursive(l,n):
    '''(liste,int)->list
    Retourne une nouvelle liste avec des valeurs de 0 à n
    '''
    if n != 0 : #s'effectue tant que la valeur n'est pas nul
        liste_recursive(l,n-1)  #appel recursif
        l.append(n-1) #ajout du chiffre précédent n
l = []
n = int(input("Entrer un chiffre: "))
liste_recursive(l,n)
print(l)
