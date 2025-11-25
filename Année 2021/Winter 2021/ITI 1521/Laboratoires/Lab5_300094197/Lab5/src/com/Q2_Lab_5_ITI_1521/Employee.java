package com.Q2_Lab_5_ITI_1521;

public class Employee {
    /**
     * attribut de type String de classe
     */
    private String name;

    /**
     * Constructeur qui prend en paramètre le nom
     * et l'innitialise
     *
     * @param name
     */
    public Employee(String name){
        this.name = name;
    }
    /**
     * constructeur par defaut
     */
    public Employee(){}

    /**
     * accesseur à l'attribut nom
     * @return
     */
    String getName(){ return name;}

    /**
     * Calcul le salaire de l'employee
     *
     * @return double
     */
    double getSalary(){
        return -1;
    }

    void setSalary(){
        System.out.println(getName()+" has an unspecified pay ");
    }

    /**
     * fait une description de l'employee
     *
     * Nom et salaire
     * @param name
     */
    void toString(String name){
        System.out.println(getName()+ " has an unspecified pay");
    }

}
