#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def histo_d(x):
    """(str)->dict
    Retourne un histogramme sous la forme d'un dictionnaire"""
    dico = {} 
    for i in x:
        dico[i]=dico.get(i,0)+1 #ajouter les vals de la chaine au dictionnaire
    return dico

a = "les saucisses et saucissons secs sont dans le saloir"
d = histo_d(a)
dico_triees = list(d.items()) #transformer le dict en list
dico_triees.sort() #trier la nouvelle liste
print(dico_triees)
