package com.Q1_Lab_5_ITI_1521;

public class Animal {
    /**
     * attribut de type String
     */
    private String name;

    /**
     * Constructeurs de la classe mère initialise name
     * et Classe Animal par défaut
     */
    public Animal(){}
    public Animal(String name){
        this.name = name;
    }

    /**
     * vérifie si le nom est null ou non
     * @return un String
     */
    String getType(){
        if (getName()==null){
            return "I am a animal ";
        }
        else{
            return "I am a animal and my name is "+ name ;
        }
    }

    /**
     * accesseur retourne la valeur de name
     */
    String getName(){ return name;}

    /**
     * modificateur qui initialise name avec une nouvelle val à name
     * @param a
     */
    void setName(String a){this.name = a;}
}
