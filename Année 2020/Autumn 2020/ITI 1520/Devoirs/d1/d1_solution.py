# Nom: Diana Inkoen 
# Numero etudiant:  123456
# Course: IT1 1520 
# Devoir 1
# Annee 2020
import math

# Q1
def aireDuTriangle(base, hauteur):
     ''' (float,float)->float
     Retourne l'aire d'un triangle a partir de la base et la hauteur
     Precondition: base et hauteur son des nombre reel pas negatives
     '''
     return base*hauteur/2

# Q2
def aireDuTrianglePrint():
     '''()->None
      Prend la valeur de la base et de la hauteur du clavier.
      Affiche un message avec l'aire du triangle d'un base et hauteur donnes
      Precondition: base et hauteur sont de nombre reel non-negatives
     '''
     base = float(input("SVP entrez la valeur de la base: "))
     hauteur = float(input("SVP entrez la valeur de la hauteur: "))
     print("Un triangle de base", base,"et hauteur", hauteur, "a l'aire", aireDuTriangle(base,hauteur))

# Q3
def loEnKilos(livres, onces):
  '''prend livres et onces et retourne la valeur en kilogrammes
    (float,float)->float
  '''
  kilos = (livres * 16 + onces) * 0.02835
  return kilos

# Q4
def bibformat(auteur,titre,ville,maisonEdition,annee):
     '''(str,str,str,str,str or int)->str
     retourne une chaine de caracteres en format:
     auteur (annee). titre. ville: maisonEdition
     '''
     s=auteur+" ("+str(annee)+"). "+titre+". "+ville+": "+maisonEdition
     return s

# Q5
def bibformatPrint():
     '''()->None
     affiche l'information pour un livre
     '''
     a = input("SVP entez l'auteur: ")
     t = input("SVP entez le tire: ")
     v = input("SVP entez la ville: ")
     m = input("SVP entez la maison d'edition: ")
     annee = input("SVP entez l'annee de publication: ")
     s = bibformat(a,t,v,m,annee)
     print(s)

# Q6
def funct(p):
     '''(int)->float
     p>=10, equation: r^2-p+10=0
     r^2 = p-10
     r = sqrt(p-10)
     '''
     r = math.sqrt(p-10)
     print("La solution est", r)
     return r

# Q7
def magique(n):
   '''
   (int) -> boolean
   La fonction retourne True si n est un nombre magique, et False sinon.
   n est magique si deux chiffres consécutifs sont égaux à 3,
   ou si le dernier chiffre se divise par 4.
   Precondition: n est un entier postiif de 3 chiffres.
   '''
   d3=n%10
   d2=n//10 % 10
   d1 = n//100 
   #print(d1,d2,d3)
   return  (d1==d2 and d1==3) or (d2==d3 and d2==3) or d3%4==0

# Q8
def numMonnaies(dollars):
  '''
  (float) -> int
  prend le montant en dollars et retourne le nombre minimal de monnaies que le cassier peut rendre"
  '''
  cents=int(dollars*100) # transfome dollars en centimes
  
  quarters=cents//25 
  cents=cents%25
  #le restant en centimes apres les quarters sont deduits
    
  dimes=cents//10
  cents=cents%10
   
  nickels=cents//5
  pennies=cents%5

  print(quarters,"pieces de 25 cents,", dimes, "pieces de 10 cents,", nickels, "pieces de 5 cents,", pennies, "pieces de 1 cent")
  
  min_num = quarters + dimes + nickels + pennies
  return min_num

#dollars =  float(input("Entrez le montant en dollars: "))
#print("Le nombre minimal de monnaies que le cassier peut rendre est:",numMonnaies(dollars))




