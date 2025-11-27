/*
 * Nom : Gbegbe Decaho Jacques
 *
 * N# étudiant : 300094197
 *
 *Ce programme calcule la suite de fibonacci et l'affecte à un constructeur
 */
import java.util.concurrent.BlockingQueue;
import java.lang.Thread;

class fibonacci extends Thread
{
    private String name;
    private BlockingQueue<Integer> queue;
    private int compteur;

    public fibonacci(String name, BlockingQueue<Integer> queue, int compteur) // constructeur
    {
        // Nom de la thread
        this.name = name;
        // File pour un partage de données entre thread
        this.queue = queue;
        // Valeur de l'entrée au clavier
        this.compteur = compteur;
    }

    public void run()
    {
        // thread enfant
        int cpt1 = 0;
        int cpt2 = 1;

        try{
            // Suite de fibonacci algorithm
            for (int i = 0; i < this.compteur; i++)
            {
                // Ajouter l'arg à la file
                this.queue.put(cpt1);
                // fibonacci
                int result = cpt1 + cpt2;
                cpt1 = cpt2;
                cpt2 = result;
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

