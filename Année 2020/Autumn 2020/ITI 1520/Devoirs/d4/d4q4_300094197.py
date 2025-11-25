# COPYRIGHT 2020, Vida Dujmovic and Diana Inkpen. All rights reserved.
# Any unauthorised distribution will constitute an infringement of copyright.

#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def is_valid_file_name():
    '''()->str or None'''
    file_name = None
    try:
        file_name=input("Entrez le nom du fichier: ").strip()
        f=open(file_name)
        f.close()
    except FileNotFoundError:
        print("Il n'y a pas aucun fichier avec ce nom. Essayez encore une fois.")
        file_name=None
    return file_name 

def get_file_name():
    file_name=None
    while file_name==None:
        file_name=is_valid_file_name()
    return file_name

def clean_word(word):
    '''(str)->str
    Retourne une nouvelle chaine de caracteres a partir de la chaine word, 
    en minuscule, sans les caracteres specieux et sans les chiffres

    La chaine retournee ne doit pas contenir:
    ! . ? : , ' " - _ \ ( ) [ ] { } % 0 1 2 3 4 5 6 7 8 9 \t \n

    >>> clean_word("co-operation.")
    'cooperation'
    >>> clean_word("1982")
    ''
    >>> clean_word("born_y1982_m08\n")
    'bornym'
    >>> clean_word("SEO : 5 outils gratuits pour trouver des mots-cles pertinents")
    'seo   outils gratuits pour trouver des motscles pertinents'
    '''

    for i in word:# permet de supprimer tous les caractères énoncés
        if ('!' <= i <= '?') or ('{' <= i <= '}') or (i == '\n') or (i == '\t') or ('[' <= i <= '_'):
            word = word.replace(i,'') #remplace l'élément par un vide nul
            word=word.lower() # reecrit word en minuscule
    return word #retourne le resultat


def test_letters(w1, w2):
    '''(str,str, list of str)->bool
    La fonction retourne True si les mots w1 et w2 ont exactement les memes
    lettres, et False sinon

    >>> test_letters("mais", "amis")
    True
    >>> test_letters("lapin", "pinla")
    True
    >>> test_letters("lapin", "alpin")
    True
    >>> test_letters("alin", "alpin")
    False
    '''
    res = False  #condition initiale
    if len(w1)==len(w2):  #verifie si w1 et w2 ont mm longueur
        for i in range(len(w1)-1):
            for j in range(len(w2)-1):
                if i == j:  #verifie si w1 et w2 possèdent les mm éléments 
                    res = True  #condition de reussite
        return res
    else:
        return res

    
def create_clean_sorted_nodupicates_list(s):
    '''(str)->list of str
    Pour la chaine s qui represente le texte, la fonction retourne une liste avec ces exigences:
    - les mot ne contient pas des caracteres specieux our des chiffres)
    - il n'y a pas de mots qui se repetent dans la liste
    - la liste est triee en ordre alphabetique (vous pouvez utilser s.sort() ou sorted())

    La fonction doit applelez la fonction clean_word.

    Vous pouvez utiliser s.split() pour obtenir une liste coupee par des espaces.
    
    >>> create_clean_sorted_nodupicates_list("Consultez notre site de web pour tout savoir de l'actualite internationale, nationale et regionale.")
    ['consultez', 'de', 'et', 'internationale', 'lactualite', 'nationale', 'notre', 'pour', 'regionale', 'savoir', 'site', 'tout', 'web']

    '''
    a = clean_word(s)  #appel de la foncction clean_word() pour supprimer les spéciaux
    q = a.split()   # transforme la nouvelle chaine en liste coupée
    s1 = [] #liste vide 
    for i in q:
        if i not in  s1:  # vérifie si i existe déjà dans la chaine vide
            s1.append(i)  # ajoute l'index si i n'existe pas à l'intérieur
            s1.sort()  # tri la nouvelle liste 
    return s1 #retourne le resultat

def word_anagrams(word, wordbook):
    '''(str, list of str) -> list of str
    - word est une chaine de caractere qui represente un mot
    - wordbook est une liste des mots (sans des mots repetes)

    La fonction retourne une liste des anagrammes de mot word dans la liste wordbook

    >>> word_anagrams("liste", wordbook)
    ['lites']
    >>> word_anagrams("lapin", wordbook)
    ['alpin', 'plain']
    >>> word_anagrams("elephant", wordbook)
    []
    '''
    res1=[]  #liste vide 1
    res2 = []  #liste vide 2
    for i in wordbook:  
        if len(word)==len(i) and sorted(word)==sorted(i): #vérifie si word a un anagram dans wordbook
            res1.append(i)  #ajoute l'anagramme et word dans la liste vide
    for i in res1:
        if i != word:
           res2.append(i) #permet de supprimer word de la liste des anagrammes
    return res2 #retourne cette nouvelle liste 
        

def count_anagrams(l, wordbook):
    '''(list of str, list of str) -> list of int

    - l est une liste des mots (sans des mots repetes)
    - wordbook est une liste des mots (sans des mots repetes)

    La fonction retourne une liste des entiers ou l'entier de index i represente
    le nombre des anagrammes dans la liste wordbook pour le mot de index i dans liste l.
    
    Quand un mot dans la liste l est le meme que le mot dans la liste wordbook, on ne le compte pas.

    >>> count_anagrams(["liste","amis", "lapin", "anee", "race", "oreilles"], wordbook)
    [1, 4, 2, 0, 5, 2]
    '''
    s = [] #liste vide
    b=0 #longueur initiale
    for i in l:
        b = word_anagrams(i,wordbook) #appel la fonction word_anagramme 
        longueur = len(b) 
        s.append(longueur) #ajoute les longueur des anagrammes de chaques l
    return s #affiche la nouvelle liste


def k_anagram(l, anagcount, k):
    '''(list of str, list of int, int) -> list of str

    - l est une liste des mots (sans de repetitions)
    - anagcount est une liste des entiers ou l'entier de index i dans la liste represente
    le nombre des anagrammes dans la liste wordbook pour le mot des index i dans la liste l.

    La fonction retournes tous les mots de la liste l qui ont exactement k anagrammes
    (dans la liste wordbook donnee dans le parametre anagcount)

    >>> k_anagram(["liste","amis", "lapin", "anee", "race", "oreilles"],[1, 4, 2, 0, 5, 2],2)
    ['lapin', 'oreilles']

    '''
    
    s = []
    anagcount = []
    n = 0
    for i in l:
        n = len(word_anagrams(i, wordbook))
        anagcount.append(n)
        if n == k:
            s.append(i)
    return s
   

def max_anagram(l, anagcount):
    '''(list of str, list of int) -> list of str
    - l est une liste des mots (pas des repetitions)
    - anagcount est une liste des entiers ou l'entier de index i dans la liste represente
    le nombre des anagrammes dans liste wordbook pour le mot de index i dans la liste l.

    La fonction retournes tous les mots de l avec le nombre maximal des anagrammes
    (dans la liste wordbook donnee dans le parametre anagcount)
    
    >>> max_anagram(["liste","amis", "lapin", "anee", "race", "oreilles"],[1, 4, 2, 0, 5, 2])
    ['race']
    '''

    s=[] #liste vide
    for var in range(0,len(l)):
        if max(anagcount)== anagcount[var]:  # vérifie si le la valeur max de anagcount a la même adresse que anagram parcouru par var dans la liste l
            s.append(l[var])  #ajoute l'indice de la var de la liste l 
    return s


def zero_anagram(l, anagcount):
    '''(list of str, list of int) -> list of str
    - l est une liste des mots (pas des repetitions)
    - anagcount est une liste des entiers ou l'entier de index i integer dans la liste
    represente le nombre des anagrammes dans wordbook pour le mot de index i en l.

    La fonction retournes tous les mots de l sans des anagrammes
    (dans la liste wordbook donnee dans le parametre anagcount)
    
    >>> zero_anagram(["liste","amis", "lapin", "anee", "race", "oreilles"],[1, 4, 2, 0, 5, 2])
    ['anee']
    '''
    
    s=[]# liste vide 
    for var in range(0,len(l)):
        if min(anagcount)== anagcount[var] == 0:#vérifie si le la valeur min de anagcount a la même adresse que anagram parcouru par var dans la liste l
            s.append(l[var]) #ajoute l'indice de la var de la liste l
    return s
            
    
##############################
# main
##############################
wordbook=open("french_noaccents.txt").read().lower().split()
list(set(wordbook)).sort()

print("Est-ce que vous voulez:")
print("1. Analyser les anagrammes d'un texte donne dans un fichier?")
print("2. Aide pour le jeu de Scrabble?")
print("Entrez un caractere different de 1 ou 2 pour arreter: ")
choice=input()

if choice=='1':
    file_name=get_file_name()
    rawtx = open(file_name).read()
    l=create_clean_sorted_nodupicates_list(rawtx)
    anagcount = count_anagrams(l,wordbook)
    maximum_anagrams = max_anagram(l, anagcount)
    print("\nParmis les mots dans le fichier, les mots suivantes ont le plus grand nombre des anagrammes:")
    print(maximum_anagrams)
    print("\nvoici leurs anagrams: ")
    for i in range (0,len(maximum_anagrams)):
        word1 = maximum_anagrams[i]
        print("Les anagrames de ",word1,"sont: ",word_anagrams(word1,wordbook))
    print("\nVoici les mots (mot) dans le fichiers qui n'ont pas des anagrammes: ")
    print(k_anagram(l, anagcount, 0))
    n = int(input("\nSi vous etes interese s'il y a un mot dans le fichier qui a exactement k anagrammes\nEntrez un entier k:"))
    print("Voici le mot dans le fichier avec exactement 4 anagrammes")
    print(k_anagram(l, anagcount, n))


elif choice=='2':
    choix = str(input("Entrez les letteres que vous avez, sans des espaces: "))
    aide = int(input("Est-ce que vous voulez d'aide a former un mot avec\n1. toutes ces lettres\n2. toutes sauf une des ces lettres?\n"))
    if aide == 1:
        s = []
        if choix in wordbook:
            s=word_anagrams(choix,wordbook)
            s.append(choix) #ajoute les anagrams dans la liste vide
        print("Voici les mots avec exactement ces lettres:")
        print(s)
    elif aide == 2:
        print("Les lettres que vous avez donne sont: ",choix)
        print("Si on elimine une des ces lettres.")
        for i in range (len(choix)):
            s = str(choix[:i] + choix[i+1:]) #crée une liste sans l'indice i de la chaine
            print("Sans la lettre en position",i+1,"on a les lettres",s)
            if len(word_anagrams(s,wordbook)) != 0:  # Vérifie que la liste n'est pas vide
                print("Voici les mots avec exactement ces lettres:",s)
                print(word_anagrams(s,wordbook))
            else:
                print("Il n'y a aucun mot avec ces lettres.",s)     
                      
else:
    print("Au revoir!")


