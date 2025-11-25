#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def loEnKilos(livre, onces):
    ''' converti en kilogramme le poids donné en livre et onces'''

    kg_lb = livre * 0.4536   # formule de conversion de livre en kg
    kg_oz = onces * 0.02835   #formule de conversion de onces en kg
    lo_en_kilo = kg_lb + kg_oz  #addition des resltats
    return round(lo_en_kilo,6) #resultat arrondi a 6 chiffres
