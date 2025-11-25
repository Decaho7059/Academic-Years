package com.Q2_Lab_5_ITI_1521;

public class Contract extends Employee{
    /**
     * attributs de type double
     */
    private double nbHours, hourRate, percentHourSup;
    static double dueHour = 40.0;

    /**
     * constructeur qui prend que le nom de l'employee
     * @param name le nom
     */
    public Contract(String name){
        super(name);
    }

    /**
     * constructeur qui prend toutes les informations liés a l'emplyés
     * et les initialise.
     *
     * @param name name
     * @param nbHours nombre d'heure de travail
     * @param hourRate tarif horaire
     * @param percentHourSup pourcentage des heures supplémentaires
     * @param dueHour nombre d'heure normal attendu
     */
    public Contract(String name, double nbHours, double hourRate, double percentHourSup, double dueHour){
        super(name);
        this.hourRate = hourRate;
        this.nbHours = nbHours;
        this.percentHourSup = percentHourSup;
    }

    /**
     * modificateur pour entrer et modifier toutes les infos brutes nécéssaire
     * au calcul des salaires
     *
     * @param a nombre d'heures de travail
     * @param b tarif horaire
     * @param c pourcentage des heures supplémentaires
     */
    void setSalaryInfo(double a,double b, double c){
        this.hourRate = a;
        this.nbHours = b;
        this.percentHourSup = c;
    }

    /**
     * accesseur au tarif horaire
     *
     * @return la valeur de hourRate
     */
    double getHourRate(){ return hourRate; }

    /**
     * accesseur au nombre d'heures de travail
     *
     * @return nbHours
     */
    double getNbHours(){ return nbHours;}

    /**
     * accesseur au pourcentage des heures supplémentaires
     *
     * @return percentHourSup
     */
    double getPercentHourSup(){ return percentHourSup;}

    /**
     * Calcul du salaire d'un employee
     *
     * @return salalire
     */
    double getSalary(){
        return (getHourRate() * getNbHours()) + ((getHourRate() * getNbHours())* getPercentHourSup()/100);
    }

    /**
     * Affiche le nom de l'employee et le montant de son salaire
     *
     * @param name name
     * @param nbHours nombre d'heure de travail
     * @param hourRate tarif horaire
     * @param percentHourSup pourcentage des heures supplémentaires
     * @param dueHour nombre d'heure normal attendu
     */
    void toString(String name, double nbHours, double hourRate, double percentHourSup, double dueHour){
        System.out.println("Employee "+ getName());
        System.out.println("Nombre d'heures travailler"+getNbHours());
        System.out.println("Tarif horaire "+ getHourRate());
        System.out.println("Pourcentage d'heure travailler "+ getPercentHourSup());
    }

}
