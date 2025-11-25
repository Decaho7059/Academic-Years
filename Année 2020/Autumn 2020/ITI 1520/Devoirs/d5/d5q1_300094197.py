#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

import math
q = {"bureau":9, "chaise":25, "imprimante":46, "scanneur":17}
p = {"bureau":75.9, "chaise":50.9, "imprimante":32.5, "scanneur":28.0}

#a)
def calculPrix(article, quantite):
    '''(str,int)->float
    Retourne le prix en fonction de la quantité choisie'''
    
    prix = 0
    for i in p:
        if article == i:
            prix = p[article]*quantite #calcul le prix
    return prix

#b)
def calculTotal(article1,quantite1,article2,quantite2,article3,quantite3):
    '''(str,int,str,int,str,int)->float
    Retourne le prix total de la commande '''

    return calculPrix(article1,quantite1) + calculPrix(article2,quantite2) + calculPrix(article3,quantite3)

#c)
def validerCommande(article1, quantite1, article2, quantite2, article3, quantite3):
    '''(str,int,str,int,str,int)->bool
    Retourne True si les quantités sont correctes'''

    res = False
    for i in q:
        if (article1 in q) and (article2 in q) and (article3 in q):
            if (0<=quantite1 <= q[article1]) and (0<=quantite2 <= q[article2]) and (0<=quantite3 <= q[article3]):  #Verifie si les elements sont correctes
                res = True
        else:
            return res
    return res

#d)
#main


article1 = input("Entrez le premier article: ")
quantite1=int(input("Entrez la quantité de votre 1ere article: "))
article2 = input("Entrez le deuxième article: ")
quantite2=int(input("Entrez la quantité de votre 2eme article: "))
article3 = input("Entrez le troisième article: ")
quantite3= int(input("Entrez la quantité de votre 3eme article: "))

#q.random_order()
    
if validerCommande(article1, quantite1, article2, quantite2, article3, quantite3) == False:
    print("\nVotre commande est annulée. SVP, vérifier les articles ou les quantités.")
    print("\nLes quantités disponibles après l'achat sont: ")
    print(q)
else:
    print("\nLe prix total de votre commande est : ",calculTotal(article1, quantite1, article2, quantite2, article3, quantite3),"$. Merci et à la prochaine.")
    q[article1], q[article2], q[article3] = q[article1]-quantite1, q[article2]-quantite2, q[article3]-quantite3
    print("\nLes quantités disponibles après l'achat sont: ")
    print(q)
