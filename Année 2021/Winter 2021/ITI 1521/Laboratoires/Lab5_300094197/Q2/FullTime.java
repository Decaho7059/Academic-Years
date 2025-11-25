package com.Q2_Lab_5_ITI_1521;

public class FullTime extends Employee{
    /**
     * attributs
     */
    private double pay, turnover, percentTurnover;

    /**
     * Constructeur vide de la classe fille
     * fait appel aux instances de la
     * classe mère
     *
     * @param name name
     */
    public FullTime(String name){
        super(name);
    }

    /**
     * Constructeur de classe fille qui initialise tous les
     * attributs de sa classe et celle dont il a hérité
     *
     * @param name: name
     * @param pay: pour la somme fixé payée aux employés
     * @param turnover: pour le chiffre d'affaires du mois
     * @param percentTurnover: pourcentage du chiffre d'affaires pour le calcul du salaire
     */
    public FullTime(String name, double pay, double turnover, double percentTurnover){
        super(name);
        this.pay = pay;
        this.turnover = turnover;
        this.percentTurnover = percentTurnover;
    }

    /**
     * Modifier ou entrer les information brutes sur le
     * prix fixe et les chiffre d'affaire
     * @param a pay
     * @param b turnover
     */
    void setSalaryInfo(double a, double b){
        this.pay = a;
        this.turnover = b;
    }

    /**
     * modificateur pour le chiffre d'affaire uniquement
     * @param turnover turnover
     */
    void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    /**
     * modificateur pour le prix fixe uniquement
     * @param pay pay
     */
    void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * methode de calcul du salaire
     * @return double salaire
     */
    double getSalary(){
        return (this.pay * this.turnover)+(this.percentTurnover *(this.pay * this.turnover) );
    }

    /**
     *  Affiche le nom de l'employee et le montant de son salaire
     *
     * @param a pay
     * @param b turnover
     * @param c percentTurnover
     */
    void toSring(double a, double b, double c){
        System.out.println("Employee "+ getName());
        System.out.println("somme fixé payée aux employés"+this.pay);
        System.out.println("chiffre d'affaires du mois "+ this.turnover);
        System.out.println("pourcentage du chiffre d'affaires"+ this.percentTurnover);
    }

}
