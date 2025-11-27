import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Exercice2
{
    public static void main(String[] args)
    {

        //Valeur entrer au clavier
        int compteur;

        if(args.length == 0 || args.length > 1)
        {
            // Entrer d'une valeur au clavier
            Scanner sc = new Scanner(System.in);
            System.out.print("Entrer une seule valeure réelle pour le calcul : ");
            compteur = sc.nextInt();
            sc.close();

        }
        else compteur = Integer.parseInt(args[0]); // recupérer la valeur entrer au clavier

        // File de partage de donnée entre thread
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(compteur);


        //Thread pour la classe fibonacci
        fibonacci fibonacci = new fibonacci("Child Fibonacci", queue, compteur);
        fibonacci.start();
        try
        {
            fibonacci.join(); // attendre que la thread enfant se termine
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.printf("Resultat de la suite de fibonacci pour le nombre %d est :\n ", compteur );

        //vider la file
        while(queue.peek() != null)
        {
            System.out.printf("%d ", queue.poll());
        }
    }
}