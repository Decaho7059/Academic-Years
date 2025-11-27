/*
 * Nom : Gbegbe Decaho Jacques
 *
 * N# étudiant : 300094197
 */
import java.util.Scanner;  // input au clavier
public class Exercice1
{
    public static void main(String[] args)
    {
        //Valeur entrer du clavier
        int Value;

        if(args.length == 0 || args.length > 1)
        {
            // Entrer une valeur du clavier
            Scanner sc = new Scanner(System.in);
            System.out.printf("Entrez une valeure entière de 1 ou plus : ");
            Value = sc.nextInt();
            sc.close();

        }
        else Value = Integer.parseInt(args[0]); //Recupérer le 1er argument

        Thread  NbrePreThread = new NbrePremiers("Nombre Premier Thread", Value);


        NbrePreThread.start();

        try{
           //S'assure que le thread est fini et il termine le programme
            NbrePreThread.join();

        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}