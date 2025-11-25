#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197



def bibformat(auteur, titre, ville, maisonEdition, annee):
    '''Retoune une chaine de caractère'''

    #auteur = "Antoine de Saint Exupery"  #attribuer des valeurs aux variables(en str)
    #titre = "Le petit prince"
    #ville = "Paris"
    #maisonEdition = "Jeunesse"
    #annee = "1943"
    return str(titre) +" ("+str(annee)+"). "+str(auteur)+". "+str(ville)+": "+str(maisonEdition)  #afficher la chaîne dans un ordre spécial

