//Q7

public class DoWhileTest {
    public static void main (String[] args){

        int nombre = 123_489;
        int somme = 0;

        do {
            somme += nombre%10;
            nombre/=10;
        }
        while (nombre != 0 || nombre <0);
        System.out.println(somme);

    }
}
