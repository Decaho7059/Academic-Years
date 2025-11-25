package com.devoir1;

import java.util.Scanner;

public class Coding {

    public static void code(byte[] data){
        byte[][] p = new byte[3][data.length];
        byte c = 0;

        for(int i=0;i< 3;i++){
            if(i == 1){c=1;}
            else if (i == 2){ c = 2;}
            for(int j=0; j < 6;j++){
                switch(i){
                    case 0:
                        p[i][j] = data[c];
                        c+=3;
                        break;

                    case 1:
                        p[i][j] = data[c];
                        c+=3;
                        break;

                    case 2:
                        p[i][j] = data[c];
                        c+=3;
                        break;
                    default:
                        System.out.println("Une erreur est survenue...");
                        break;
                }
            }
        }
        for (int i=0; i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        byte[][] data = new byte[][]{new byte[]{},new byte[]{}};
        byte[][] d1 = new byte[][]{new byte[]{},new byte[]{}};
        byte[][] d2 = new byte[][]{new byte[]{},new byte[]{}};

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String str = "";
        System.out.print("Entrer les valeurs: ");
        str = scanner.nextLine();
        String [] tab = str.split(" ");
        n = tab.length;
        byte [] cd = new byte[n];
        for (int i = 0; i < n; i++) {
            cd[i]= Byte.parseByte(tab[i]);
        }

        byte[][] p = new byte[3][cd.length];
        System.out.println("");
        System.out.println("Le tableau codé si pas d'erreur de transmission: ");
        for (int i=0; i < 3;i++){
            for(int j=0; j< cd.length;j++) {
                if (i == 0) {
                    p[i][j] = cd[j];
                } else {
                    p[i][j] = p[0][j];
                }
            }
        }
        for (int i=0; i<3;i++){
            for(int j=0;j< cd.length;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println("");
        }
    }

    /*public byte[] decode(byte[] data){

    }*/


}
