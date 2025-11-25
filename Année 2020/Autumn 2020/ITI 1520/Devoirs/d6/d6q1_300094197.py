#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

class Personne:
    '''represente une classe Personne'''
    def __init__(self, nom, prenom, identifiant):
        '''(str,str, int)->None
        initialise les attributs de la classe Personne'''
        self.nom = nom
        self.prenom = prenom
        self.identifiant = identifiant

    def __repr__(self):
        '''(Personne)->str
        retourne une representation de l'objet'''
        return 'Nom:{}, Prenom:{}, Identifiant:{}'.format(self.nom,self.prenom,self.identifiant)
            
    def __eq__(self, autre):
        '''(Personne, Personne)->bool
        self == autre si le nom et le prenom sont les memes'''
        if (self.nom==autre.nom) and (self.prenom==autre.prenom):
            return True
        return False

class Etudiant(Personne):
    '''represente une classe Etudiant'''
     # solde est un attribut de la classe Etudiant
     # cours est une liste de cours (une liste de chaine de caracteres)
     # methodes
    def __init__(self ,nom, prenom, identifiant ,solde, liste_cours):
        '''(str,str,int,int,list)->None
        initialise les attributs de l'objet'''
        Personne().__init__(nom,prenom,identifiant)
        self.solde = solde
        self.liste_cours = liste_cours

    def ajouterCours(self,cours):
        '''(liste)->liste
        Ajoute le noms des cours dans la liste'''
        if self.solde ==0:
            self.liste_cours.append(cours)
            return True 
        return False

    def _repr_(self):
        '''(Etudiant)->None
        Retourne une représentation de l'objet'''
        Etudiant(Personne,self).__repr__()
        return 'Nom:{}, Prenom:{}, Identifiant:{}, solde:{}, liste de cours:{}'.format(self.nom,self.prenom,self.identifiant,self.solde,self.liste_cours)
        

class Employe(Personne):
    '''represente un employe'''
    # tauxHoraire est un attribut de la classe Employe
    # methodes
    def __init__(self, nom, prenom, identifiant, tauxHoraire):
        '''(str,str,int,float)->None
        Initialise les attributs de la classe Etudiant'''
        Personne().__init__(nom,prenom,identifiant)
        self.tauxH = tauxHoraire

    def _repr_(self):
        '''(Employe)->None
        Retourne une représentation de l'objet'''
        return 'Nom:{}, Prenom:{}, Identifiant:{}, taux Horaire:{}'.format(self.nom,self.prenom,self.identifiant,self.tauxH)

    def calculerSalaire(self,nbre_heure):
        '''(int)->int
        Retourne le salaire de l'employé'''
        return self.tauxH * nbre_heure
    
class Gestion:
 listEtudiant = []
 listEmploye = []
 @property
 def ajouterEtudiant(self):
    ''' none -> bool
    ajouter des etudiants dans une liste d'etudiant'''
    nom = str(input("Entrez le nom: "))
    prenom = str(input("Entrez le prenom: "))
    identifiant = int(input("Entrez votre identifiant: "))
    solde = float(input("Entrez le solde: "))
    liste_cours = str(input("Entrez une liste de cours separe par des virgules: "))
    etudiant = Etudiant(nom=nom, prenom=prenom, identifiant=identifiant,solde=solde,liste_cours=liste_cours)

    g.listEtudiant.append(etudiant)
    choix = str(input("Veux-tu ajouter un autre cours?:")).lower()

    if choix == 'oui':
        cours = str(input("Entrez le cours a ajouter: "))
        if solde !=0:
            print("Vous devez payer votre solde avant d'ajouter un cours.")
        else:
            etudiant.self.liste_cours.ajouterCours(cours)

    if choix == 'non':
        print("Vouz avez choisi de ne pas ajouter aucun cours.")

    print("Etudiant ajoute avec succes.")

    #Gestion.listEtudiant.append(etudiant)
    if etudiant not in g.listEtudiant:
        g.listEtudiant.append(etudiant)
        print("Etudiant ajoute avec succes.")
        return True
    else:
        #print("Etudiant existe déjà")
        return False
    

 def ajouterEmploye(self):
    ''' none -> bool
    ajouter des etudiants dans une liste d'etudiant'''
    nom = str(input("Entrez le nom: "))
    prenom = str(input("Entrez le prenom: "))
    identifiant = int(input("Entrez votre identifiant: "))
    tauxHoraire = float(input("Entrez le taux horaire: "))

    employe = Employe(nom=nom, prenom=prenom, identifiant=identifiant, tauxHoraire=tauxHoraire)
    g.listEmploye.append(employe)
    

    if employe not in g.listEmploye:
        g.listEmploye.append(employe)
        #print("Employe ajoute avec succes.")
        return True
    else:
        #print("Employe ajoute avec succes.")
        return False
    print("Employe ajoute avec succes.")

     
 def SoldeNonPaye(self):
    ''' none -> int
    retourner le nombre des etudiants qui ont un solde non paye'''
    
    return len(list(filter(lambda autre: autre.solde != 0, Gestion.listEtudiant)))


 def salaireInd(self, employe, heures):
    '''(str) -> float
    retourne le salaire d'un employe'''
    if len(list(filter(lambda x: employe.__eq__(x), Gestion.listEmploye))) == 0:
        return 0.00
    else:
        if isinstance(employe, Employe):
            solde = employe.calculerSalaire(heures)
            return solde            

#program principal
g = Gestion()
print("Ajoutez des etudiants.")
# Ajouter des etudiants
g.ajouterEtudiant
g.ajouterEtudiant

# Ajouter des employes
print("Ajouter des employes.")
g.ajouterEmploye()
g.ajouterEmploye()

# Afficher le nombre des employes et des etudiants
print("il y a: ", len(Gestion.listEtudiant), " etudiants.")
print("il y a: ", len(Gestion.listEmploye), " employes.")
# Afficher le nombre des etudiants qui ont un solde a payer
print("il y a ", g.SoldeNonPaye(), "etudiants qui n'ont pas paye leur solde.")
# Afficher les salaires de tous les employes
for e in Gestion.listEmploye:
    heure = int(input("Entrez le nombre des heures pour employe " + e.prenom + " " + e.nom + " "))
    print('Le salaire de:', e.nom, e.prenom, 'est:', g.salaireInd(e, heure), '$.')

#Afficher toute la Gestion
print("Toute la gestion: ")
print(Gestion.listEtudiant)
print(Gestion.listEmploye)
