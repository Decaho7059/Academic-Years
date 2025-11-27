/*
 * Nom : Gbegbe Decaho Jacques
 *
 * N# étudiant : 300094197
 *
 * Ce programme affiche une suite de nombres premiers
 * inférieur ou égal au nombre entrer au clavier
 */

import java.lang.Thread;

class NbrePremiers extends Thread
{
    private String name;
    private int Value;

    public NbrePremiers(String name, int Value) // constructeur
    {
        this.name = name;
        this.Value = Value;
    }
    public void run()  // classe de vérification pour les nombres premiers
    {
        //Pour afficher le resultat
        String result = " ";

        //Nombre premiers à partir de 2
        for(int index = 2; index <= this.Value; index++)
        {
            boolean NbreP = true;
            //Vérifier si les nombres sont des nombres premiers
            for(int number =  2; number < index; number++)
            {
                if( index  % number == 0 )
                {
                    NbreP =  false; //Si le nombre n'est pas un nombre prem
                    break;
                }
            }
            //Ajouter le resultat à la sortie
            if(NbreP)
            {
                result = result + index + " ";
            }
        }

        System.out.printf("Les nombres suivants sont les nombres premiers <= a %d : \n", this.Value);
        System.out.printf(">>>> %s\n", result);

    }
}
