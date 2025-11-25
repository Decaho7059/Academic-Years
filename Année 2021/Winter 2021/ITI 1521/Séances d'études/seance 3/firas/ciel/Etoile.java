package ciel;

public class Etoile {
    static public int age = 1000;
    private int poids = 100;
    int distance = 30000;
    final protected String nom = "etoile";

    private void modifyDistance(){
        this.poids = 0;
    }

    // etoile1.age? 1000
    // etoile2.age = 500
    // etoile1.age? 500
}
