#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

#Exercice 1
def somme_diviseurs_impaires(n):
    '''(int)-> int
    Retourne la somme de tous les diviseurs'''

    # condition pour n positif
    if n > 0:
        diviseur = 0
        for i in range(1, n+1, 2):   # prend entier des entiers impaires a partir de 1 a n
            if n%i == 0 :
                diviseur = diviseur + i  #ajoute les val des diviseurs
            #i +=2
        return diviseur
    #condition pour n nul
    if n == 0:
        return None
    #condition pour n négatif
    if n<0:
        diviseur = 0
        for i in range(1, -n+1):
            if -n%i==0:
                diviseur = diviseur + i
            i +=2   #ne prend que les chiffres impaires
        return diviseur  #retourne la somme des diviseurs

#Exercice 2
def somme_de_serie():
    ''' ()->float
    Retourne la somme d'une série'''

    s = 1000
    n = int(input("SVP entrez un entier pas negatif: "))  #entrer du clavier
    while n < 0:
        n = int(input("SVP entrez un entier pas negatif: "))
        continue
    if n ==0:
        return 1000.0
    
    if n > 0:
        for i in range (1, n+1): #Fait une boucle de 0 a n+1
            s = s + (1 /(i*i))   #Calcul la somme de la serie
        return s  #Retourne la somme

#Exercice 3
def somme_liste_div2(l):
    '''(list)->int
    Retourne la somme des divisibles par 2'''

    a = 0
    for i in l:   #Applique une boucle
        if i%2 == 0:  #condition à respecter
            a = a+i   #calcul la somme
    return a #retourne la somme

#Exercice 4
def countMembers(s):
    '''(str)->int
    Retourne le nombre de caractère extraordinaire'''

    a = 0
    for i in s:
        #ensemble de conditions a respecter (utilisation des adresses mémoires)
        if (ord('e')<=ord(i)<=ord('j')) or (ord('F')<=ord(i)<=ord('X')) or (ord('2')<=ord(i)<=ord('6')) or ord(i)==ord('!') or ord(i)== ord(',') or ord(i)== ord('\\'):
            a = a+1
    return a #retourne la somme des extraordinaire

#Exercice 5

def nombre(s):
    '''(str)->int
    Retourne un nombre sans coupures(caractère)'''

    s = s.replace(" ", "")
    if s.isdigit():  # verifie si s est un entier
        return int(s) #retourne cet entier
    if s == "": #si s est vide
        return 0
    for i in s:
        if s.isdigit and "-" in s: 
            return int(s) #retourne le resultat


#Exercice 6

def alienNumbers(s):
    '''(str)->int
    Retourne la valeur representé par la chaîne de caractère'''

    b = 0
    for i in s:
        if s!=[]:
            T,y,o,a,N,U = s.count('T'),s.count('y'),s.count('!'),s.count('a'),s.count('N'),s.count('U')  #compte le nombre de fois que les caractères apparaissent
            b = T*1024 + y*598 + o*121 + a*42 + N*6 + U*1 #Calcul la valeur du nombre
        return b   #retourne le nombre finale
    if s == "":   # condition pour s vide
        return 0

#Exercice 7

def alienNumbers2(s):
    '''(str)->int
    Retourne la valeur représentée par la chaîne'''

    a,b,c,d,e,f=0,0,0,0,0,0  #variable compteur
    for i in s:
        if i == 'T':
            a = a + 1024  #compte la valeur de T
        if i == 'y':
            b = b + 598   #compte la valeur de y
        if i == '!':
            c = c + 121   #compte la valeur de !
        if i == 'a':
            d = d + 42    #compte la valeur de a
        if i == 'N':
            e = e + 6     #compte la valeur de N
        if i == 'U':
            f = f + 1     #compte la valeur de f
    return a+b+c+d+e+f  #calcul la somme
    for i in s:
        if s =="":     #condition pour s vide
            return 0

#Exercice 8

def encrypt(s):
    '''(str)->str
    Retourne une verssion chiffrée de s'''
    
    p = []  # liste vide
    i = 0  #compteur
    while i < len(s)//2:  #boucle (tant que i est < la moitié)
        p.append(s[-1-i])  #ajoute le dernier indice de la chaine a p
        p.append(s[i])     #ajoute le premier élément de p
        i +=1  #compteur
    if len(s)%2!=0: #condition pour len(s) impaire
        p.append(s[len(s)//2])  #ajoute l'indice restant de la division de la chaine
    a = "".join(p)
    return a  #Retourne la liste sous forme de string
    


#Exercice 9

def weaveop(s):
    '''(str)->str
    Retourne une chaîne de caractère '''

    paire = []  #liste vide qui va recevoir les variables
    for p in range (len(s)):  #boucle
        paire.append(s[p])  # ajout de l'indice p dans la liste vide
        if p + 1 == len(s):  # la liste s'arrête à l'avant dernière indice
            break
        if s[p].isalpha() and s[p+1].isalpha(): #verifie si indice 1 et le suivant sont identique
            if s[p].islower():  
                paire.append('p')  #ajoute un p en minuscule si précédé par une minuscule
            elif s[p+1].isupper(): 
                paire.append('P')   # ajoute un P en majuscule si précédé par une majuscule
            if s[p].islower():
                paire.append('o') #ajoute un 'o' minuscule si précédé d'une minuscule
            elif s[p].isupper():
                paire.append('0')# ajouter un 'O' majuscule si précédé par une majuscule
    return "".join(paire) #transforme la liste en chaîne de caractère


#Exercice 10

def squarefree(s):
    '''(str)->bool
    Retourne un booleen si la chaîne est un squarefree'''

    i = 0 # variables initiales
    j = 1
    while i <= len(s) - 1: # boucle ou i parcours s
        if i + j > len(s) - 1:  #premiere condition()
            i +=1  # fais evoluer i dans s
            j = 1
        elif s[i] == s[i+j]:  # condition d'égalité entre l'indice et son suivant
            if s[i:i+j] == s[i+j:i+j+j]: # si une suite d'indice est egale alors s n'est pas un squarefree
                return False #resultat 
            else:
                i +=1  #cas contraire  i continue d'évolue dans s
                j = 1
        else:
            j +=1 #Si l'égalité n'est pas respecté j augmente
    return True #resultat initial
