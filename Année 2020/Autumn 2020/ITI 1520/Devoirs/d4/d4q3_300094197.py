#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def sequenceMax(s):
    '''(list)->int
    Retourne le nombre de la plus longue séquence d'éléments consécutifs égaux'''

    c1 = 0  #compteur initial
    c2 = 0
    
    if len(s)-1 <= 1:  # condition d'une liste vide ou avec 1 seul index
        return 1
    elif len(s)-1 > 1: #condition d'une liste avec plus que 1 éléments
        for i in range(0,len(s)-1): #liste parcouru par l'index
            a = i  #indice de la sous-liste
            while (a<len(s)-1) and s[i]==s[a]: #S'exécute tant que les éléments consécutifs sont égaux
                c1 +=1 #compteur ajoute 1 à chaque égalité
                a+=1
                if a >=len(s)-1 and s[i]==s[a]: #Condition pour que la boucle s'arrête au derner index
                    c1+=1
            if c2<c1:  # permet à c1 de compter le nombre d'égalités consécutifs sur toute la liste sans les associés
                c2 = c1 #donne à c2 la valeur trouver paar le compteur c1
            c1 = 0 # réinitialise le compteur à 0 pour continuer la boucle
        return c2 #retourne la valeur final trouver
       
ch = input("Veuillez entrer une liste des valeurs séparées par des espaces: ").strip().split()
a=[]
for item in ch:
    a.append(float(item))
print(sequenceMax(a))

