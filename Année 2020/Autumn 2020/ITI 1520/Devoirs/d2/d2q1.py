#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197


chaines = str(input("Entrez les votes (oui, non, ou abstention) séparés par des espaces, et à la fin appuyez enter: \n"))

def vote_pourcentage(chaines):

# Compte les entrées

    nbr_oui = chaines.count("oui")  
    nbr_non = chaines.count("non")
    nbr_abs = chaines.count("abstention")

    nbr_total = nbr_oui + nbr_non   # Total des oui et  non

    if nbr_total == nbr_oui:   # 1e condition
        return "unanimité"
    
    elif nbr_oui >= nbr_total *2/3:    # 2e condition
        return "majorité claire"

    elif nbr_oui >= nbr_total *1/2:   # 3e condition
        return "majorité simple"
    else:
        return "la motion ne passe pas"
            

print(vote_pourcentage(chaines)) # appeler la fonction
