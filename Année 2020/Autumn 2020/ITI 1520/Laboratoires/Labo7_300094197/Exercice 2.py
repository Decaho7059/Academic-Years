#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def histo_n(x):
    """(tuple)->dict
    Retourne un dictionnaire qui est un histo pour count combien de fois
    chaque nombre arrive dans le tuple"""

    nombres = {}
    for i in x:
        nombres[i]=nombres.get(i,0)+1 # ajouter les val du tuple au dict
    return nombres

t = (1,2,-3,3,4,-3,3,3)
d = histo_n(t)
nombres_triees = list(d.items()) #transformer le tuple en liste
nombres_triees.sort() #trier la nouvelle liste
print(dict(nombres_triees)) #changer la liste en dict
   
