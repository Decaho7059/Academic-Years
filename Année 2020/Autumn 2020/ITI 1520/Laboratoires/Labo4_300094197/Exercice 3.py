#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def devine():
    '''()->int
    Deviner le chiffre'''

    import random
    n1 = random.randint(1,10) #genere un chiffre random
    reponses = int(input("Devine le chiffre!! :")) #Entrer du clavier
    cpt = 1  #valeur initial du compteur

    # Boucle    
    while reponses != n1:   #Fais une boucle pour les différentes conditions
    #1ere sous condition
        if reponses > n1: #condition pour tant que la reponse est plus grande
            print("haut")
            reponses = int(input("Devine le chiffre!! :")) # redemande d'entrée une valeur
    #2e sous condition        
        elif reponses < n1: #condition pour tant que la reponse est plus petite
            print("bas")
            reponses = int(input("Devine le chiffre!! :"))  #redemande d'entrée une valeur
        cpt +=1 #compte le nombre de tentative
    # autre condition
    if reponses == n1:
        a = print("\n" "Félicitation!" "\n" "Réussi en ",cpt, "essais")
        return a  #retourne le message et le nombre d'éssais

devine()
