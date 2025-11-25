#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

n = int(input("Entrer un entier: "))

#1ere condition
if n%2==0 and n%3==0:
    print(n, "est divisible par 2 et par 3")

#2e condition
if n%2!=0 or n%3!=0:
    if n%2==0 and n%3!=0:
        print(n, "est divisible par 2 pas par 3")
    elif n%2!=0 and n%3==0:
        print(n, "est divisible par 3 pas par 2")

#3e condition
if n%2 !=0 and n%3!=0:
    print(n, "n'est pas divisible par 2 et par 3")
