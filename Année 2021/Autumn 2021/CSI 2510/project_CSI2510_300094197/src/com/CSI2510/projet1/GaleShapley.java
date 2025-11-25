/**
 * Nom : Decaho Gbegbe
 * Numéro d'étudiant : 300094197
 */


package com.CSI2510.projet1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;

public class GaleShapley {

    private String[] employers, students;  // de valeur -1
    private int[] employer, student;  // de valeur -1
    int [][] A;   // matrice [Employeur] [Students]
    private TreeMap  <Integer, Integer> PQ[];
    private Stack <Integer> Sue;


    /**
     *
     * @param filename
     * @throws IOException
     *
     * effectue la lecture du fichier d'entrée
     * et effectue toutes les étapes d'initialisations
     */
    void initialize(File filename)  throws IOException {
        Scanner entry = new Scanner(filename);    //entrer à partir du clavier clavier

        int first = Integer.parseInt(entry.nextLine());   //convertir en entier l'entrée

        Sue = new Stack<>();
        student = new int[first];   // attribuer les entiers aux tableaux
        employer = new int[first];

        employers = new String[first];
        students = new String[first];

        Arrays.fill(student, -1);  // remplir la valeur de base des tableaux par -1
        Arrays.fill(employer, -1);

        A = new int[first][first];
        PQ = new TreeMap[first];

        for (int i = 0; i < first ; i++) {
            employers[i] = entry.nextLine();
            Sue.push(i);  // initialiser la pile
        }

        // lire les informations des etudiants( leurs noms)
        for (int i = 0; i < first; i++) {
            students[i] = entry.nextLine();
            while(entry.hasNextLine()){
                for (i = 0; i < first; i++) {
                    String[] line = entry.nextLine().trim().split(" ");   // séparer par des espaces
                    PQ[i] = new TreeMap<>();

                    for (int j = 0; j < line.length; j++) {
                        StringTokenizer x = new StringTokenizer(line[j], ",");
                        PQ[i].put(Integer.parseInt(x.nextToken()), j);
                        A[j][i] = Integer.parseInt(x.nextToken());  // inserer les préférences des employés
                    }
                }
            }
            entry.close();
        }

    }


    /**
     * execute l'algorithme de gale-Sharpley décrit
     */
    void execute(){
        // algorithme de gale shapley
        while(!Sue.isEmpty()){
            int e = Sue.pop();
            int s = PQ[e].remove(PQ[e].firstKey());

            int e0 = student[s];
            if (student[s] == -1){
                student[s] = e;
                employer[s] = s;
            }else if(A[s][e] < A[s][e0]){
                student[s] = e;
                employer[e] = s;
                Sue.push(e0);
            }else{
                Sue.push(e);
            }
        }
    }

    /**
     * @param filename
     *
     * sauvegarde la solution trouvée
     * dans la forme prescrite
     */
    void save(File filename){
        try(FileWriter writer = new FileWriter(filename)){
            for (int i = 0; i < students.length; i++) {
                writer.write("Match " + i + " : "+employers[i]+" - " +students[employer[i]]+"n");  // créér et ecrire dans un nouveau fichier text
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * @param args
     * @throws IOException
     *
     * demande à l'utilisateur le nom du fichier d'entrée
     * et ensuite appelle les methodes initialize, execute et save
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // write your code here
        // File name ... C:\Users\decah\Documents\UOTTAWA-ST PAUL-NEW\Automne 2021\CSI 2510\Projet\projectCSI2510_300094197
        ///Users/cassandregbegbe/Desktop/decaho/Projet 1/test_N3.txt

        System.out.println("Enter file name:");
        String filename = new Scanner(System.in).nextLine();
        GaleShapley test = new GaleShapley();
        test.initialize(new File(filename));
        test.execute();
        test.save(new File("Matches_"+filename));
    }
}
