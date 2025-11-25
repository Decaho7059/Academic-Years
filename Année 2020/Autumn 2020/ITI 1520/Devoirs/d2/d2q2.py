#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

# Question2

print("Ce logiciel va effectuez un test avec 10 questions. ")

def effectuezTest():
    '''(int)->int'''
    cpt=0
    i=0
    
    choix=int(input("SVP choisisser l'operation 0) soustraction 1) exponentiation (0 ou 1):"))

#1ere condition
    if choix == 0:
       print("SVP donnez les reponses aux soustractions suivantes:")
       while i<10:
           import random
           n1 = random.randint(0,9)
           n2 = random.randint(0,9)
           print(n1,"-",n2,"=")
           reponse = int(input(""))  #entrer du clavier
           i= i+1
           if n1-n2==reponse:    
               cpt= cpt + 1
           else:
               print("Incorrect-la reponse est",n1-n2)
       if cpt>=6:
           print(cpt,"reponses correctes.")
           print("Felicitation !")
       else:
           print(cpt,"reponses correctes.")
           print("Demandez a votre enseignant(e) de vous aider")

# 2e conditions           
    elif choix == 1:
       while i<10:
           import random
           n1 = random.randint(0,9)
           n2 = random.randint(0,9)
           print(n1,"**",n2,"=")
           reponse = int(input(""))
           i= i+1
           if n1**n2 == reponse:
               cpt = cpt + 1
           else:
               print("Incorrect-la reponse est",n1**n2)
       if cpt>=6:
           print(cpt,"reponses correctes.")
           print("Felicitation !")
       else:
           print(cpt,"reponses correctes.")
           print("Demandez a votre enseignant(e) de vous aider")
    elif choix!=0 and choix!=1:
        print(-1, "reponses incorrectes","\n","Opération incorrecte ")
        return -1
effectuezTest()
