from typing import List


class Personne:
    '''represente une classe Personne'''

    nom: str
    prenom: str
    identifiant: int

    def __init__(self, nom, prenom, identifiant):
        '''(str,str, int)->None
        initialise les attributs de la classe Personne'''
        # A completer
        self.nom = nom
        self.prenom = prenom
        self.identifiant = identifiant

    def __repr__(self) -> str:
        '''(Personne)->str
        retourne une representation de l'objet'''
        # A completer
        return 'name:' + self.nom + '\n' + 'prenom:' + self.prenom + '\n' + 'identifiant:' + str(self.identifiant)

    def __eq__(self, autre) -> bool:
        '''(Personne, Personne)->bool
        self == autre si le nom et le prenom sont les memes'''
        # A completer
        return self.nom == autre.nom and self.prenom == autre.prenom


class Etudiant(Personne):
    '''represente une classe Etudiant'''
    # solde est un attribut de la classe Etudiant
    # cours est une liste de cours (une liste de chaine de caracteres)
    solde: float
    cours: List[str]

    # methodes
    def __init__(self, nom, prenom, identifiant, solde, cours):
        super().__init__(nom, prenom, identifiant)
        self.cours = cours
        self.solde = solde

    def __repr__(self) -> str:
        super(Etudiant, self).__repr__()
        return '{' + super(Etudiant, self).__repr__() + '\n' + 'solde:' + str(self.solde) + '\n' + 'cours:' + str(
            len(self.cours)) + '}'

    def ajouterCours(self, cour) -> bool:
        if self.solde == 0:
            self.cours.append(cour)
            print(f'le {cour} a ete ajouter avec succes')
            return True
        else:
            print(f'votre Solde {self.solde} est insuffisant pour ajouter ce cours')
            return False


# A completer


class Employe(Personne):
    '''represente un employe'''
    # tauxHoraire est un attribut de la classe Employe
    tauxHoraire: float

    # methodes
    def __init__(self, nom, prenom, identifiant, tauxHoraire):
        super().__init__(nom, prenom, identifiant)
        self.tauxHoraire = tauxHoraire

    def __repr__(self):
        return ' {' + super(Employe, self).__repr__() + '\n' + 'taux Horaire:' + str(
            self.tauxHoraire) + '}'

    def calculerSalaire(self, nbr: int):
        return nbr * self.tauxHoraire


# A completer


class Gestion:
    listEtudiant = []
    listEmploye = []

    def ajouterEtudiant(self) -> bool:
        ''' none -> bool
    ajouter des etudiants dans une liste d'etudiant'''
        # A completer
        nom = input("Donner le nom de l'etudiant ")
        prenom = input("Donner le prenom de l'etudiant ")
        identifiant = int(input("Donner l'identifiant de l'etudiant "))
        solde = float(input("Donner le solde de l'etudiant "))
        etd = Etudiant(nom=nom, prenom=prenom, identifiant=identifiant, cours=[], solde=solde)
        while True:
            print('-----------------------------')
            print('Voulez vous ajouter un cours? ')
            res = input('Oui/Non ')

            if res == 'Oui' or res == 'oui':
                cour = input('Donnez le nom du cour a ajouter ')
                etd.ajouterCours(cour)
            else:
                break

        if len(list(filter(lambda x: etd.__eq__(x), Gestion.listEtudiant))) > 0:
            print("l'etudiant existe deja")
            return False
        else:
            Gestion.listEtudiant.append(etd)
            print("l'etudiant a été ajouter avec succes")
            return True

    def ajouterEmploye(self) -> bool:
        ''' none -> bool
    ajouter des etudiants dans une liste d'etudiant'''
        # A completer
        nom = input("Donner le nom de l'employe ")
        prenom = input("Donner le prenom de l'employe ")
        identifiant = int(input("Donner l'identifiant de l'employe "))
        tauxHoraire = float(input("Donner le taux horaire de l'employe "))
        emp = Employe(nom=nom, prenom=prenom, identifiant=identifiant, tauxHoraire=tauxHoraire)

        if len(list(filter(lambda x: emp.__eq__(x), Gestion.listEmploye))) > 0:
            print("l'employe existe deja")
            return False
        else:
            Gestion.listEmploye.append(emp)
            print("l'employe a été ajouter avec succes")
            return True

    def SoldeNonPaye(self) -> int:
        ''' none -> int
    retourner le nombre des etudiants qui ont un solde non paye'''
        # A completer
        return len(list(filter(lambda x: x.solde != 0, Gestion.listEtudiant)))

    def salaireInd(self, employe, heures) -> float:
        '''(str) -> float
    retourne le salaire d'un employe'''
        # A completer
        if len(list(filter(lambda x: employe.__eq__(x), Gestion.listEmploye))) == 0:
            return 0.00
        else:
            if isinstance(employe, Employe):
                sal = employe.calculerSalaire(heures)
                return sal


# program principal
g = Gestion()
print("Ajoutez des etudiants.")
# Ajouter des etudiants
g.ajouterEtudiant()
g.ajouterEtudiant()

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

# Afficher toute la Gestion
print("Toute la gestion: ")
print(Gestion.listEtudiant)
print(Gestion.listEmploye)
