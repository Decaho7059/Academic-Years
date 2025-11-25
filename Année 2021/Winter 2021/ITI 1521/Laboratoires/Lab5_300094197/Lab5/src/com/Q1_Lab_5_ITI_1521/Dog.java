package com.Q1_Lab_5_ITI_1521;

public class Dog extends Mammal {
    /**
     * Classe fille par défaut  qui modifie la val de setNbMonthPregnacy valeur en Mammal
     *
     * et affiche un message en avec cette valeur
     */
    public Dog(){
        super();
        setNbMonthPregnacy(3);
        if (getName() == null) {
            System.out.println("I am a dog and just born after " + getNbMonthPregnacy() + " months of pregnacy. I don't have a name yet");
        }
    }

    /**
     * Constructeurs de la classe fille  de Mammal par héritage
     * et Classe fille par défaut
     */
    public Dog(String name){
        super(name);
    }

    /**
     * vérifie si le nom est null ou non
     *
     *
     * @return un String concatener au getType() de sa classe mère
     */
    String getType() {
        if (getName() == null){
            return super.getType()+". I am a dog ";}
        else{
            return  super.getType()+"I am a dog";
        }

    }
}
