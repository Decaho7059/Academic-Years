#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

# question1
def atlantic(sn):
    '''(str)->(str)
    Retourne une chaines de caractères '''

    if len(sn)>=9:
        return "nouveau"
    elif len(sn)<9:
        return "vieux"

#question2
def southern(n):
    '''(int)->(str)
    Affiche un message'''

    if n == 1:
        livres = float(input("Entrer le poids en livres: "))
        onces = float(input("Entrer le poids en onces: "))
        kilogrammes =(livres *16 + onces) * 0.02835
        print(livres,"livres et",onces,"onces","est (approx.)",kilogrammes,"kilogrammes")
        
    elif n == 2:
        nom = str(input("Quel est ton nom? "))
        num_Etudiant = input("Quel est ton numéro d'étudiant? ")
        print(nom,"ton numero d'etudiant est ", atlantic(num_Etudiant))


#question3

def pacific(g1,g2,g3):
     '''(float)-> bool
     Retourne un True ou False'''
     
     return (g1>=50 and g2>=50 and g3>=80) or (g2>=50 and g3>=50 and g1>=80) or (g3>=50 and g1>=50 and g2>=80)


#question4

def arctic(n):
    '''(int)->bool'''

    n1 = n//1000
    n2 = n//100%10
    n3 = n%100//10
    n4 = n%10
    
    

    return (n1==n4 and n2 == n3)# or (n3 == n4)
    
