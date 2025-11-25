#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197
print("Bienvenue à Dow's Lake")
temp = float(input("Quelle température fait-il?: ")) #entrée du clavier

#attribuer un chiffre a activité
if temp >= 80.0:
    activité = 1   
    
if temp<=60.0 and temp<80.0:
    activité = 2
    
if temp<=40.0 and temp<60.0:
    activité = 3
    
if temp<40.0:
    activité = 4
    
#attribuer l'acivité si la condition est remplie    
if activité ==1:    
        print("Natation")
elif activité ==2:
        print("Soccer")
elif activité ==3:
        print("Volleyball")
elif activité ==4:
        print("Ski")
