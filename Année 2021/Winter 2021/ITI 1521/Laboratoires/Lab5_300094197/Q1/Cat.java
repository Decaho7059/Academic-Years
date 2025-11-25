package com.Q1_Lab_5_ITI_1521;

public class Cat extends Mammal{

    /**
     * Classe fille par défaut "Cat"  qui modifie la val de setNbMonthPregnacy valeur en Mammal
     *
     * et affiche un message en avec cette valeur
     */
    public Cat(){
        super();
        setNbMonthPregnacy(2);
        if (getName() == null) {
            System.out.println("I am a cat and just born after " + getNbMonthPregnacy() + " months of pregnacy. I don't have a name yet");
        }
    }
    /**
     * Constructeurs de la classe fille "Cat" de Mammal par héritage
     * et Classe fille par défaut
     */
    public Cat(String name){
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
            return super.getType()+". I am a cat ";}
        else{
            return  super.getType()+"I am a cat";
        }

    }


}
