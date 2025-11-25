//Q4

import java.util.Scanner;

public class Somme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Somme ");
        String n = scanner.nextLine();

        int somme = 0;
        String[] number = n.split(" ");

        for (int i = 0; i < number.length; i++) {
            somme = somme+(Integer.parseInt(number[i]));
        }
        System.out.println(somme);


    }
}
