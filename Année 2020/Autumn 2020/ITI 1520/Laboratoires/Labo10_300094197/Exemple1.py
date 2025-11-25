#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

class Temps:
    def __init__(self, hh=12, mm=0, s=0):
        '''(Temps)->None'''
        self.heure = hh
        self.minutes = mm
        self.secondes = s
        

    def affiche_hh(self):
        print("{0}:{1}:{2}".format(self.heure, self.minutes, self.secondes))
        
        
    def __repr__(self):
        return(str(self.heure)+':'+str(self.minutes) +':'+str(self.secondes))
        

    def __eq__(self, autre):
        '''(Temps)->Bool'''
        return self.heure == autre.heure and self.minutes == autre.minutes and self.seconde == autre.secoonde
    
##temps1 = Temps(17,45)
##temps1.affiche_hh()
##temps1.__repr__()
