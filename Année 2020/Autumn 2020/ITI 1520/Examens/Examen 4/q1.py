'''
Je comprends l'importance de l'intégrité professionnelle dans mes études et ma future carrière en génie,
informatique ou autre. Je certifie par la présente que j'ai fait et ferai tout le travail pour cet examen
entièrement par moi-même, sans assistance extérieure ni utilisation de sources d'information non autorisées.
De plus, je ne fournirai aucune assistance aux autres.
'''

# AJOUTEZ VOTRE NOM ET NUMERO D'ETUDIANT ICI
# pour confirmer que vous etes d'accord avec la declaration ci-dessus et avec les regles decrites dans TEST 2
# NOM:
# NUMERO D'ETUDIANT:

#########################
# QUESTION 1
#########################
# Compeletez dans les classes suivantes dans les endroit indiquees
# Voir deux exemples d’exécution du programme principal dans les
# fichiers exemple_run1.txt et exemple_run2.txt
from typing import List


class Livre:
    ''' Un livre a un titre et un auteur'''
    titre: str
    auteur: str

    def __init__(self, titre, auteur):
        '''
        (str,str)-> None
        constructeur
        '''
        self.titre = titre
        self.auteur = auteur

    def __repr__(self):
        '''
        (None)->str
        retourne une representation de l'objet: titre et auteur

        En anglais: return a string that describes the object by title and author
        '''

        # VOTRE CODE ICI
        return f'Titre: {self.titre} Auteur: {self.auteur}'

    def __eq__(self, autre):
        '''
        (Livre)->bool
        self == autre si le titre et auteur sont les memes
        Retourne True si les deux objets ont le meme titre et auteur

        En anglais: return True if the two objects have teh same title and author
        '''
        # VOTRE CODE ICI
        return self.titre.lower() == autre.titre.lower() and self.auteur.lower() == autre.auteur.lower()


class Personne:
    '''Une Personne a un nom, un prenom, un numero de carte de membre
    au club de lecture, et une liste des livres lu
    '''
    nom: str
    prenom: str
    cardNo: int
    listLivres: List[Livre]

    def __init__(self, nom, prenom, nr):
        '''(str,str,int)->None
        initialise les attributs de la classe Personne
        la liste de livre est initialise a la liste vide
        '''
        self.nom = nom
        self.prenom = prenom
        self.cardNo = nr
        self.listLivres = []

    def __repr__(self):
        '''(None)->str
        retourne une representation de l'objet: nom, prenom et numero de carte

        En anglais: return a string that describes the object by last name, first name
        and card number'''

        # VOTRE CODE ICI
        return f'Nom: {self.nom} Prenom: {self.prenom} CardNo: {self.cardNo}'

    def __eq__(self, autre):
        '''(Personne)->bool
        self == autre si le nom, le prenom, et le numero de carte sont les memes
        Retourne True si les deux objets ont le meme nom, prenom, et numero de carte

        En anglais: return True if the two objects have the same last name, first name and card number
        '''

        # VOTRE CODE ICI
        return self.nom.lower() == autre.nom.lower() and self.prenom.lower() == autre.prenom.lower()

    def ajouteLivre(self):
        '''
        (None)-> bool
        ajoute un livre a la liste des lives lu par la personne.
        Lit du clavier le titre et l'auteur d'un livre et cree un object de type Livre.
        Ajoute l'objet a la liste s'il n'y a pas deja un livre avec le meme titre et
        auteur dans la liste (utilisez __eq__ pour tester ca).
        Retourne True si le livre a ete ajoute et False sinon.

        En anglais: Add a book to the list of books read by the person. The title and
        author are read from the keyboard. If another book with the same title and author
        exists in the list, it shoud not add it. Returns True if the book was added and False if not.
        '''

        # VOTRE CODE ICI
        titre = input('Entrez le titre: ')
        auteur = input('Entrez l\'auteur: ')

        livre = Livre(titre=titre, auteur=auteur)

        if len(list(filter(lambda x: x.__eq__(livre), self.listLivres))) > 0:
            print('Ce livre existe deja dans cette liste')
        else:
            self.listLivres.append(livre)

    def afficheLivresLu(self):
        '''
        (None)-> None
        Affiche tous les livres lu par la personne, un livre sur chaque ligne

        En anglais: prints the books read by the person, one per line
        '''

        # VOTRE CODE ICI
        livre_lu = str()
        for livre in self.listLivres:
            livre_lu += livre.__repr__() + '\n'

        print(self.__repr__() + f' a lu\n{livre_lu}')


class ClubLecture():
    '''represente une classe club de lecture avec une liste des Personnes inscrites'''
    listMembres: List[Personne]

    def __init__(self):
        '''(None)->None
        initialise la classe
        la liste de personnes est initialise a la liste vide
        '''
        self.listMembres = []

    def ajoutePersonne(self):
        '''
        (None)-> bool
        Ajoute un membre au club de lecture.
        Lit du clavier le nom, prenom, et numero de carte de membre.
        Cree un object de type Personne.
        Ajoute l'objet a la liste s'il n'y a pas deja une personne avec le meme nom,
        prenom, et nuemro de carte dans la liste (utilisez __eq__ pour tester ca).
        Retourne True si le livre a ete ajoute et False sinon.

        En anglais: Add a person to the list of club members.
        The last name, first name and card number are read from the keyboard. If another person
        with the same last name, first name and card number exists in the list, it shoud not add it.
        Returns True if the person was added and False if not.
        '''

        # VOTRE CODE ICI
        nom = input('Entrez votre nom: ')
        prenom = input('Entrez votre prenom: ')
        cardNo = int(input('Entrez votre numero de carte: '))

        personne = Personne(nom, prenom, cardNo)

        if len(list(filter(lambda x: x.__eq__(personne), self.listMembres))) > 0:
            print('Cette personne est deja membre du club.')
        else:
            self.listMembres.append(personne)

    def livreLePlusPopulaire(self):
        '''
        (None)-> None
        Cette fonction est plus diffcile a ecrire. C'est bon resoudre Questions 2 et 3 et revenir.

        La fonction trouve le livre qui a ete lu par le plus grand nombre des membres au club.
        S'il y a plusieurs livres avec le meme nombre des lecteurs, choisissez le premier livre.
        Affichez le titre et l'auteur de ce livre dans quel format vous preferez.
        Vous avez besoin d'une structure de donnee pour compter le nombre des lecteurs de
        chaque livre, par exemple un dictionnaire avec des cled titre+"/"+auteur

        En anglais: This function is more difficult to implement. You can solve questions 2
        and 3 first.
        The function looks for the book that was read by te highest number of club members and
        prints its title and author in any format you prefer.
        If there are several books with the same number of readers, print the first book.
        You may need a data structure to count how many persons read each book, for example a dictionary.
        '''

        # VOTRE CODE ICI
        liste_des_livres_par_p = []
        ls = []
        for p in self.listMembres:
            liste_des_livres_par_p.extend(p.listLivres)

        for livre in liste_des_livres_par_p:
            ls.append(tuple((liste_des_livres_par_p.count(livre), livre.__repr__())))

        liste_ordonner = set(ls)
        livre_le_plu_lu = max(liste_ordonner)
        print(f'Le Livre le plus populaire est {livre_le_plu_lu[1]}')


# programme principal
c = ClubLecture()
print("On ajoute des membres au club")
# ajoute 3 membres et affiche le club
c.ajoutePersonne()
c.ajoutePersonne()
c.ajoutePersonne()
for v in c.listMembres:
    print(v)

print("Ajoutez des livres pour chaque membre")
for v in c.listMembres:
    print(v)
    encore = "oui"
    while encore == "oui":
        v.ajouteLivre()
        encore = input("Encore un livre? (oui/non) ")

for v in c.listMembres:
    v.afficheLivresLu()

c.livreLePlusPopulaire()
