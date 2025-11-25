#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

class CompteBancaire():

    def __init__(self, nom='Dupont', solde=1000):
        '''(CompteBancaire)->None'''
        self.nom = nom  #valeur initial
        self.solde = solde

    def depot(self,somme):
        '''(int)->int
        Ajoute un montant au solde'''
        self.solde += somme #ajoute la somme au solde
        return self.solde

    def retrait(self,somme):
        '''(int)->int
        Retire une certaine somme du solde'''
        self.solde -=somme #retire la somme du solde
        return self.solde

    def affiche(self):
        '''(CompteBancaire)->None'''
        print("Le solde du compte bancaire de {} est de {} dollars.".format(self.nom, self.solde)) #affiche le message final

    def __repr__(self):
        return ("Le solde du compte bancaire de "+str(self.nom)+" est de "+str(self.solde)+" dollars.") #affiche le message final

class CompteEpargne(CompteBancaire):  #class découlant de CompteBancaire
    def __init__(self, nom, solde, interet=0.3):
        '''(CompteEpargne)->None'''
        self.interet = interet #valeur initial
        self.nom = nom
        self.solde = solde

    def changeTaux(self, valeur):
        '''(int)->int
        Permet de modifier le taux d'interet à volonté'''
        self.interet = valeur
        return self.interet #change la valeur du taux d'interet

    def capitalisation(self,nombreMois):
        '''(int)->int
        Affiche le solde total atteint après capitalisation'''
        for i in range (nombreMois): #boucle s'executant jusqu'au mois final
            self.solde+= (self.interet/100)*self.solde  #calcul de taux de capitalisation final

        print("Capitalisation sur {} mois au taux mensuel de {} %.".format(nombreMois, self.interet)) #affiche le message final



    

##compte1 = CompteBancaire('Duchmol', 800)
##compte1.depot(350)
##compte1.retrait(200)
##compte1.affiche()
##
##compte2 = CompteBancaire()
##compte2.depot(25)
##compte2.affiche()
##
##c1 = CompteEpargne('Duvivier', 600)
##c1.depot(350)
##c1.capitalisation(12)
##c1.affiche()
##
##c1.changeTaux(.5)
##c1.capitalisation(12)
##c1.affiche()
