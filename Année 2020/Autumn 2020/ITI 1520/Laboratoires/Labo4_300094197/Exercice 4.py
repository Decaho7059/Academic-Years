#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exercice4

choix = int(input("Entrer un nombre positif: "))  #entrer du clavier
def calculeFact(choix):
    '''(int)->int
    Calcule le factoriel du nombre'''

    
    i = 1  #valeur initial du compteur
    s = 1  #valeur initial du calcul
    #1ere condition
    while choix < 0:   #redemande d'entrée u clavier tant que le nombre entrée est négatif
        choix = int(input("SVP, veuillez entrer un nombre positif:"))

    #2e condition
    while i <=choix:  #boucle pour calculer le factorel du nbr entrée
        s = i * s   #Calcul le factoriel formule
        i += 1  #compteur
    print(s)  #affiche le res final

#calculeFact(choix)
