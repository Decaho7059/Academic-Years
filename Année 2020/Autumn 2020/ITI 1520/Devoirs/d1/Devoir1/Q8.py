#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def numMonnaies(p):
    "Retournes le nombres de pièces à rendre"

    n_25 = (p*100)//25                  #permet de savoir combien il y a de 25c
    n_10 = ((p*100)%25)//10             #prend le reste du 1er calcul pour trouver le nbr de 10c
    n_5  = (((p*100)%25)%10)//5         #prend le reste du 2e calcul pour trouver le nbr de 5c
    n_1  = ((((p*100)%25)%10)%5)//1     #prend le reste du 3e calcul pour trouver le nbr de 1c

    print(int(n_25),"pièces de 25 cents, ",int(n_10),"pièces de 10 cents, ",int(n_5),"pièces de 5 cents, ",int(n_1),"pièces de 1 cent")
    return int(n_25 + n_10 + n_5 + n_1) # affiche le nombre total de pièces rendu
    
