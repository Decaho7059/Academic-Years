#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exercice 4
#Version avec count
def compte(s,c):
    ''' (str,str)->int
    affiche le nombre d'occurence d'un caractère'''

    a = s.count(c)  #compte le nombre de caractère
    return a #Retourne le resultat

#Version sans count
##def compte(s,c):
##    ''' (str)->int
##    affiche le nombre d'occurence d'un caractère'''
##
##    a = 0   #compteur
##    for i in s:
##        if i == c:  #condition à respecter
##            a = a + 1 # actualise le compteur au fur et a mesure
##    return a retourne le total
            
s = input('Entrer votre chaîne de caractère: ')
print(compte(s, 'a'))
