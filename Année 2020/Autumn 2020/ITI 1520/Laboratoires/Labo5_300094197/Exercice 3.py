#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197


#Exo 3

def distance(x):
    ''' (list) -> int
    Calcul la distance parcourue par une balle'''

    import math
    b = -1
    v = int(input("Entrer la vitesse en metre: "))  #entrer du clavier soit v=100
    for i in x:
        a = (i*math.pi)/180  # calcul theta
        g = 9.8
        distance = (2*v**2*math.cos(a)*math.sin(a))/g  #formule de la distance
        b +=1
        print("La distance ",b,"est: ",distance) #affiche le resultat
    return ""

ch = input("Entrer des chiffres séparés par des virgules: ")
l1 = list(eval(ch))

#print(distance(l1))
#0,10,20,30,40,50,60,70,80,90
