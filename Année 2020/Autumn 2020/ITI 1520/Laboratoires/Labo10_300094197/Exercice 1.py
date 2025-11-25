#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

class Temps:
    def __init__(self,hh=12,mm=0,s=0):
        '''(Temps)->None'''
        
        self.heure = hh    #valeurs initial
        self.minute = mm
        self.seconde = s
        self.setTemps(hh,mm,s) #appel de la fonction qui actualise les valeurs des var

    def setTemps(self, hh=12, mm=0, s=0):
        '''(Temps)->None'''
        
        if (hh > 24) :
            hh = 0 + (hh%24)  #change la valeur de l'heure qd h>24
            
        if mm >= 60:  #conditions et changement quand les minutes > 60
            mm = 0 + (mm%60)
            hh += (mm // 60)

        if s >=60:  #conditions et changement quand les secondes > 60
            mm += (s // 60)
            s = 0 + (s%60)
            
        self.heure = hh %24  #nouvelles valeurs de hh, mm et s
        self.minute = mm
        self.seconde = s

    def estAvant(self, t2):
        '''(Temps, Temps)->bool
        Retoune True si le temps initiale est avant celui de t2'''
        if (self.heure < t2.heure) or (self.minute < t2.minute) or (self.seconde < t2.seconde): #verifie si t2 est supérieur à self
            return True
        elif self.heure == t2.heure: #condition pour autres
            return False
        else:
            return False

    def durée(self,t2):
        '''(Temps, Temps)->Temps'''

        t3 = Temps(0,0,0)
        if self.estAvant(t2): #vérifie si t2 est supérieur à self et fait la différence entre leurs heures
            if t2.heure > self.heure:
                t3.heure = t2.heure - self.heure
            if t2.minute > self.minute:
                t3.minute = t2.minute - self.minute
            if t2.seconde > self.seconde:
                t3.seconde = t2.seconde - self.seconde

        elif t2.estAvant(self): #vérifie si self est supérieur à t2 et fait la différence entre leurs heures
            if t2.heure < self.heure:
                t3.heure = self.heure - t2.heure
            if t2.minute < self.minute:
                t3.minute = self.minute - t2.minute
            if t2.seconde < self.seconde:
                t3.seconde = self.seconde - t2.seconde
        else:
            pass
        return t3
        



    def __repr__(self):
        return'{0}:{1}:{2}'.format(self.heure, self.minute, self.seconde)  #affiche le temps dans un format spécifique

    


##temps1 = Temps()
##temps1.setTemps(25,10,63)
##print( temps1)
    
##t1 = Temps(10,11,1)
##t2 = Temps(11,5)
##t1.estAvant(t2)

##t1 = Temps(12,45,2)
##t2 = Temps(12,50,0)
#t1.durée(t2)
