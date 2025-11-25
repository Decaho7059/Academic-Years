package com.Q1_Lab_5_ITI_1521;

public class Mammal extends Animal{
    /**
     * attribut de type int
     */
    protected int nbMonthPregnacy;

    /**
     * Constructeurs de la classe fille  de Animal par héritage
     * et Classe fille par défaut
     */
    public Mammal(){}
    public Mammal(String name){
        super(name);

    }

    /**
     * vérifie si le nom est null ou non
     * @return un String
     */
    String getType(){
        if (getName() == null){
            return super.getType()+". I am a Mammal" ;}
        else{
            return super.getType()+". I am a Mammal. ";
        }
    }
    /**
     * accesseur retourne la valeur de nbMonthPregnacy
     */
    int getNbMonthPregnacy(){ return nbMonthPregnacy;}

    /**
     * modificateur qui initialise name avec une nouvelle val à nbMonthPregnacy
     * @param b
     */
    void setNbMonthPregnacy(int b){ this.nbMonthPregnacy = b;}
}
