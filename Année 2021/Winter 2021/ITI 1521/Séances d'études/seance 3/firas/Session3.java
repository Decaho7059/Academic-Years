import animal.Chien;
import animal.Poisson;
import ciel.Etoile;

public class Session3 {

    public static void main(String[] args) {
//        Etoile etoile1 = new Etoile();

//        System.out.println(etoile1.age);
//        System.out.println(etoile1.poids);
//        System.out.println(etoile1.distance);
//        System.out.println(etoile1.nom);

//        Chien chien = new Chien();
//        chien.faireDuSon();
//
//        Poisson poisson= new Poisson();
//        poisson.faireDuSon();

        Shiritori shiritori = new Shiritori();
        System.out.println(shiritori.play("hello"));
        System.out.println(shiritori.play("gla"));
        System.out.println(shiritori.play("ola"));
        System.out.println(shiritori.play("alo"));
        System.out.println(shiritori.play("ola"));


    }
}
