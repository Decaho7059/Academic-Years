//Q6

public class WhileTest {
    public static void main(String[] args){

        int nombre = 123_489;
        int somme=0;
        while (nombre>0){
            somme = somme + (nombre %10);
            nombre /= 10;
            //System.out.print(somme);
        }
        System.out.print(somme);
    }
}
