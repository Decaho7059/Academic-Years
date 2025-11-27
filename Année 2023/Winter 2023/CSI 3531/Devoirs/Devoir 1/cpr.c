/*------------------------------------------------------------
Fichier: cpr.c

Nom: Gbegbe Decaho Jacques Françis
Numero d'etudiant:300094197

Description: Ce programme contient le code pour la creation
             d'un processus enfant et y attacher un tuyau.
	     L'enfant envoyera des messages par le tuyau
	     qui seront ensuite envoyes a la sortie standard.

Explication du processus zombie
(point 5 de "A completer" dans le devoir):
Un processus zombie est un processus qui s'est terminé mais qui
est toujours visible dans la table des processus
(c'est à dire qui a conservé son identifiant de processus)

	(s.v.p. completez cette partie);

-------------------------------------------------------------*/
#include <stdio.h>
#include <sys/select.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

/* Prototype */
void creerEnfantEtLire(int );

/*-------------------------------------------------------------
Function: main
Arguments:
	int ac	- nombre d'arguments de la commande
	char **av - tableau de pointeurs aux arguments de commande
Description:
	Extrait le nombre de processus a creer de la ligne de
	commande. Si une erreur a lieu, le processus termine.
	Appel creerEnfantEtLire pour creer un enfant, et lire
	les donnees de l'enfant.
-------------------------------------------------------------*/

int main(int ac, char **av)
{
    int numeroProcessus;

    if(ac == 2)
    {
       if(sscanf(av[1],"%d",&numeroProcessus) == 1)
       {
           creerEnfantEtLire(numeroProcessus);
       }
       else fprintf(stderr,"Ne peut pas traduire argument\n");
    }
    else fprintf(stderr,"Arguments pas valide\n");
    return(0);
}

/*-------------------------------------------------------------
Function: creerEnfantEtLire
Arguments:
	int prcNum - le numero de processus
Description:
	Cree l'enfant, en y passant prcNum-1. Utilise prcNum
	comme identificateur de ce processus. Aussi, lit les
	messages du bout de lecture du tuyau et l'envoie a
	la sortie standard (df 1). Lorsqu'aucune donnee peut
	etre lue du tuyau, termine.
-------------------------------------------------------------*/

void creerEnfantEtLire(int prcNum)
{

    /* S.V.P. completez cette fonction selon les
       instructions du devoirs. */

    int i = 0;
    printf("processus %d commence \n", prcNum);
    fflush (stdout);  // renvoie un indicateur en cas d'erreur et renvoi 0 s'il n'y en a pas

     //cas d'erreur ou prcNum est <0
    if (prcNum < 1)
    {
        printf("Erreur: valeur entrer est incorrect veuillez réessayer avec prcNum>= 1 ");
    }

    //cas ou prcNum est 1
    if (prcNum == 1)
    {
        sleep(5);  // le processus doit attendre 5s
    }

    //cas ou prcNum est positif et + que 1
    if (prcNum > 1)
    {
       int fd[2]; // (0)= read(0, buf, 4) et (1) = write(0, buf, 4)
       pipe(fd);  // créé un tuyau de taille df
       int pid = fork();// fork();  // création de l'enfant

       // cas d'erreur
       if (pid == -1)
        {
            printf ("création de l'enfant à échouer.\n");
            close(1);
        }
       // Cas enfant est null
        if (pid == 0)
         {
            close(fd[0]);

            dup2(fd[1], 1); // stdout maintenant écris dans le tuyau

            char nombre_de_lettre[32];  // preparer une liste d'arguments
            sprintf(nombre_de_lettre, "%d", prcNum-1);

            char*args[] = {"cpr", nombre_de_lettre, NULL};
            execvp(args[0], args);
         }

       //cas Action d'un parent
       else
        {
            close(fd[1]);
            fflush(stdout);  // renvoie un indicateur en cas d'erreur et renvoi 0 s'il n'y en a pas

            char readB[128];
            while((i = read(fd[0], readB, 128))>0)
                {
                      write(1, readB, i);
                }
            wait(NULL);
        }
    }


    printf("Processus %d termine\n", prcNum);

    sleep(10); // attende du processeur à la fin du Processus

    fflush(stdout); // renvoie un indicateur en cas d'erreur et renvoi 0 s'il n'y en a pas

    close(1);

}

