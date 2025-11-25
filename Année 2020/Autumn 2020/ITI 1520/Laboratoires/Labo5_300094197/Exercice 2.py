#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exo 2

def statistiques(x):
    ''' (list) -> list
    Retourne une liste avec la moyenne, chiffreMax et chiffreMin'''

    m = 0    #variables compteurs
    max1 = 0
    min1 = 0
    l2=[]
    for i in x:    #effectue une boucle
        m = m + i
        a = m/len(x)  # calcul la moyenne
        if max1 < i:
            max1 = i  #Le chiffre max
        if min1 < i:
            min1 = min(x)  #Le chiffre min
    l2.append(a)
    l2.append(min1)
    l2.append(max1)  #ajouter des éléments à la 2e listes
    return l2   #retourne la liste

ch = input('valeur: ')
l1 = list(eval(ch))   #Converti en liste ch

#print(statistiques(l1))

###10,5,9,7,11,6,2,8
###[7.25, 2, 11]
