#Comments
#Student name : Decaho Gbegbe
#Student number : 300094197

def celsius_en_fahrenheit():
    "Trancforme la temperature de celsuis en fahrenheit"
    temp_celsius = int(input("Quel est la temp en celsius:"))
    temp_fahrenheit = 9.0 / 5.0 * temp_celsius + 32  #formule de conversion
    print("La température en fahrenheit est:",temp_fahrenheit)  #affiche le resultat
celsius_en_fahrenheit()  #appel de fonction
    
#temp_celsius = 100
#temp_fahrenheit = celsius_en_fahrenheit(temp_celsius)
#print(temp_fahrenheit,"fahrenheit est",temp_celsius,"Celsius.")
