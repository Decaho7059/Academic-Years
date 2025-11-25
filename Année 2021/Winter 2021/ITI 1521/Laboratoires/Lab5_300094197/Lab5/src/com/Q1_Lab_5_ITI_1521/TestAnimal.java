package com.Q1_Lab_5_ITI_1521;

public class TestAnimal {
    /**
     * Méthode main pour l'affichage et le test des programmes
     * @param args
     */
    public static void main(String[] args){
        Animal[] animals = new Animal[6];
        animals[0] = new Animal("Bof");
        animals[1] = new Animal();
        animals[2] = new Dog("Lassie");
        animals[3] = new Cat("Puffy");
        animals[4] = new Dog();
        animals[5] = new Cat();
        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i].getType());
        }
    }
}
