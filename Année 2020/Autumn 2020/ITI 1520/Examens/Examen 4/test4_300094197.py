"""
Je comprends l'importance de l'intégrité professionnelle dans mes études et ma future carrière en génie,
informatique ou autre. Je certifie par la présente que j'ai fait et ferai tout le travail pour cet examen
entièrement par moi-même, sans assistance extérieure ni utilisation de sources d'information non autorisées.
De plus, je ne fournirai aucune assistance aux autres.
"""


# AJOUTEZ VOTRE NOM ET NUMERO D'ETUDIANT ICI
# pour confirmer que vous etes d'accord avec la declaration ci-dessus et avec les regles decrites dans TEST 2
# NOM: Gbegbe
# NUMERO D'ETUDIANT: Decaho Jacques

#########################
# QUESTION 1
#########################
# Compeletez dans les classes suivantes dans les endroit indiquees
# Voir deux exemples d’exécution du programme principal dans les
# fichiers exemple_run1.txt et exemple_run2.txt


class Livre:
    """Un livre a un titre et un auteur"""

    def __init__(self, titre, auteur):
        """
        (str,str)-> None
        constructeur
        """
        self.titre = titre
        self.auteur = auteur

    def __repr__(self):
        """
        (None)->str
        retourne une representation de l'objet: titre et auteur

        En anglais: return a string that describes the object by title and author
        """

        return Livre.__repr__(self) + "Titre:" + self.titre + " Auteur:" + self.auteur

    def __eq__(self, autre):
        """
        (Livre)->bool
        self == autre si le titre et auteur sont les memes
        Retourne True si les deux objets ont le meme titre et auteur

        En anglais: return True if the two objects have teh same title and author
        """
        return self.auteur == autre.auteur and self.titre == autre.titre


class Personne:
    """Une Personne a un nom, un prenom, un numero de carte de membre
    au club de lecture, et une liste des livres lu
    """

    def __init__(self, nom, prenom, nr):
        """(str,str,int)->None
        initialise les attributs de la classe Personne
        la liste de livre est initialise a la liste vide
        """
        self.nom = nom
        self.prenom = prenom
        self.cardNo = nr
        self.listLivres = []

    def __repr__(self):
        """(None)->str
        retourne une representation de l'objet: nom, prenom et numero de carte

        En anglais: return a string that describes the object by last name, first name
        and card number"""

        return (
                "Nom:"
                + self.nom
                + " Prenom:"
                + self.prenom
                + " Numero d'etudiant:"
                + str(self.cardNo)
        )

    def __eq__(self, autre):
        """(Personne)->bool
        self == autre si le nom, le prenom, et le numero de carte sont les memes
        Retourne True si les deux objets ont le meme nom, prenom, et numero de carte

        En anglais: return True if the two objects have the same last name, first name and card number
        """

        return (
                self.nom == autre.nom and self.prenom == autre.prenom
        )  # and self.identifiant==autre.identifiant

    def ajouteLivre(self):
        """
        (None)-> bool
        ajoute un livre a la liste des lives lu par la personne.
        Lit du clavier le titre et l'auteur d'un livre et cree un object de type Livre.
        Ajoute l'objet a la liste s'il n'y a pas deja un livre avec le meme titre et
        auteur dans la liste (utilisez __eq__ pour tester ca).
        Retourne True si le livre a ete ajoute et False sinon.

        En anglais: Add a book to the list of books read by the person. The title and
        author are read from the keyboard. If another book with the same title and author
        exists in the list, it shoud not add it. Returns True if the book was added and False if not.
        """
        titre = input("Entrez le titre: ")
        auteur = input("Entrez l'auteur: ")
        livre = Livre(titre, auteur)
        Existe = False
        for i in self.listLivres:
            if livre.__eq__(i) and livre.titre == i.titre and livre.auteur == i.auteur:
                Existe = True
        if Existe == False:
            self.listLivres.append(livre)
            print("Livre ajoute avec succes")
        else:
            print("Livre existe déjà")
        return not Existe

    def afficheLivresLu(self):
        """
        (None)-> None
        Affiche tous les livres lu par la personne, un livre sur chaque ligne

        En anglais: prints the books read by the person, one per line
        """

        return (
                Livre.__repr__(self)
                + "\n"
                + "Titre: "
                + self.titre
                + "Auteur: "
                + self.auteur
        )


class ClubLecture:
    """represente une classe club de lecture avec une liste des Personnes inscrites"""

    def __init__(self):
        """(None)->None
        initialise la classe
        la liste de personnes est initialise a la liste vide
        """
        self.listMembres = []

    def ajoutePersonne(self):
        """
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
        """
        nom = input("Entrez le nom: ")
        prenom = input("Entrez le prenom: ")
        nr = int(input("Entrez votre numero de carte: "))
        dec = Personne(nom, prenom, nr)
        Existe = False
        for i in self.listMembres:
            if (
                    dec.__eq__(i) and dec.nom == i.nom and dec.prenom == i.prenom
            ):  # and dec.nr==i.nr:
                Existe = True
        if Existe == False:
            self.listMembres.append(dec)
            print("membre ajoute avec succes")
        else:
            print("Cette personne est deja membre au club.")
        return not Existe

    def livreLePlusPopulaire(self):
        """
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
        """

        livre_counts = {}  # Dictionnaire pour compter le nombre de lecteurs par livre

        for membre in self.listMembres:
            for livre in membre.listLivres:
                cle = livre.titre + "/" + livre.auteur  # Clé unique pour chaque livre
                if cle in livre_counts:
                    livre_counts[cle] += 1
            else:
                livre_counts[cle] = 1

        if not livre_counts:
            print("Aucun livre n'a été lu par les membres.")
            return

        # Trouver le livre avec le plus de lecteurs
        livre_populaire = max(livre_counts, key=livre_counts.get)
        titre, auteur = livre_populaire.split("/")  # Extraire titre et auteur

        print(
            f"Le livre le plus populaire est : '{titre}' de {auteur}, lu par {livre_counts[livre_populaire]} membres."
        )


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


#########################
# QUESTION 2
#########################
def sommeLRec(l, n):
    """(list, int) -> number
    La fonction prend une liste et sa taille comme parametres
    et retourne la somme des elements avec de valeurs paire.
    La focntion doit etre recursive (sinon la note sera zero pour la fonction).
    Exemples:
    >>> l=[1,2,5,6,4]
    >>> sommeLRec(l, len(l))
    12
    >>> l=[1,3]
    >>> sommeLRec(l, len(l))
    0
    >>> l=[]
    >>> sommeLRec(l, len(l))
    0
    >>> l=[2,4,8]
    >>> sommeLRec(l, len(l))
    14

    Les memes commentaires en anglais si quelqun a besoin:
    The function takes a list and its lenghts as parameters
    and returns the sum of the elements of even values.
    The fonction should be recursive (or the number of points will be zero)
    """

    if n == 0:  # verifie si n est nul
        return 0
    if n == 1:  # Verifie si n est paire
        if (L[n - 1] % 2) == 0:
            return L[n - 1]  # retourne le resultat
        else:
            return 0
    else:
        if (L[n - 1] % 2) == 0:  # tant que la taille de la liste est > 1
            return L[n - 1] + sommeLRec(L, n - 1)  # fait l'opération
        else:
            return sommeLRec(L, n - 1)  # continu a chercher les paires


#########################
# QUESTION 3
#########################
def draw_stars_rec(n):
    """(int)->None
    Preconditions: n est un entier positive impaire
    La fonction imprime un dessin comme decrit dans la Question 3
    avec n etoiles dans la premiere ligne et dans la derniere ligne,
    n-2 etoiles dans la ligne prochaine, etc.
    La fonction doit etre recursive (sinon zero points)

    Les memes commentaires en anglais si quelqun a besoin:
    This fonction draws a pattern of stars. n is a positive integer of odd value.
    For example, if n is 9, it prints 9 stars on the first line, followed by 7,5,3,1,3,5,7,9 stars
    The function should be recursive (or the number of points will be zero)
    """

    if n == 1:
        print(n * "*")  # affiche n

    else:
        if n > 0:
            print(n * "*")  # affiche n etoiles decroissant
            draw_stars_rec(n - 2)  # appel recursif
            print(n * "*")  # affiche n etoiles croissant
