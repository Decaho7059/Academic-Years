#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#f = a*x**2 + b*x +c

#Entrer du clavier
a = float(input("Entrer la valeur de a: "))
b = float(input("Entrer la valeur de b: "))
c = float(input("Entrer la valeur de c: "))

#Formules pour les racines
R = b**2- 4*a*c

#1ere condition
if R < 0:
    print("Le discriminant est ",round(R,2), "pas de racines réelles")

#2e condition
elif R == 0:
    x1 = x2 = -b/(2*a)
    print("Il y a une solution double: ",x1)

#3e condition
elif R > 0:
    x1 = (-b+math.sqrt(R))/ 2*a
    x2 = (-b-math.sqrt(R))/ 2*a
    print("Il y a deux solutions: ")
    print(x1)
    print(x2)


# pour a=1.23456789, b =2.4691356, c=1.23456789
# La solution ne donne pas la bonne valeur car b**2 < 4*a*c
# la racine d'un nombre négatif donne erreur
# pour ça la reponse est incorrecte
