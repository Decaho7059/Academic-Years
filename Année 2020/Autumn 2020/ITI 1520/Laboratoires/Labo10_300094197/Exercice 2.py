#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

class Voiture:
    def __init__(self, marque='Ford', couleur='rouge', pilote='personne', vitesse=0):
        '''(Voiture)->None'''
        self.marque = marque
        self.couleur = couleur
        self.pilote = pilote
        self.vitesse = vitesse

    def choix_conducteur(self, pilote): 
        '''(str)->str
        Permet de changer le pilote'''
        
        self.pilote = pilote #nouvelle valeur de pilote
        return self.pilote

    
    def accelerer(self,taux,duree):
        '''(int,int)->int
        Calcul la vitesse de la voiture s'il y a un conducteur'''
        
        if self.pilote == 'personne':  #condition pour aucun pilote
            print("Cette voiture n'a pas de conducteur !")
        else:
            self.vitesse = taux * duree #calcul de vitesse
            return self.vitesse

    def affiche_tout(self):
        '''(Voiture)->None'''
        print("{} {} pilotée par {}, vitesse = {} m/s.".format(self.marque, self.couleur, self.pilote, self.vitesse))#affichage de la phrase final

    def __repr__(self):
        return (str(self.marque)+str(self.couleur)+"pilotée par"+str(self.pilote)+", vitesse ="+str(self.vitesse)+"m/s.")#affichage de la phrase final

    def __eq__(self,t2):
        return self.marque == t2.marque and self.couleur == t2.couleur and self.pilote == t2.pilote and self.vitesse == t2.vitesse #verifie si deux variables sont égales

            


##a1 = Voiture('Peugeot','bleu')
##a2 = Voiture(couleur = 'verte')
##a3 = Voiture('Mercedes')
##
##a1.choix_conducteur('Roméo')
##a2.choix_conducteur('Juliette')
##
##a1.accelerer(1.7, 10)
##a2.accelerer(1.8,12)
##a3.accelerer(1.9, 11)
##
##a1.affiche_tout()
##a2.affiche_tout()
##a3.affiche_tout()
##
##a1 == a2
##a3 == a1
