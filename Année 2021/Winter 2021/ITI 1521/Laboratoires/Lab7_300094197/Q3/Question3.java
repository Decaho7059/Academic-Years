package com.Lab_7_ITI_1521;

import java.io.*;
import java.lang.reflect.Array;

public class Question3 {
    /**
     * programme qui ajoute des éléments de type byte dans un
     * tableau vide de byte
     */
    public static byte getInput()[] throws Exception{
        System.out.println("enter some text: ");
        System.out.println("only 50 bytes i.e about 2 lines...");
        System.out.println("press enter after each line to get input into the program ");

        byte add = new Byte(String.valueOf(System.in));
        try{
            for (int i = 0; i < 50 ; i++) {
                getInput()[i] = add;
            }
        }
        catch (ArrayIndexOutOfBoundsException m){
            System.out.println("invalid elements ");
            System.out.println("generated exception : "+m);
        }
        return getInput();
    }
    public static void main(String[] args) throws Exception {
        byte input[] = getInput();
        OutputStream myOutFile = new FileOutputStream("C:\\Users\\decah\\Documents\\UOTTAWA-ST PAUL-NEW\\Hiver 2021\\ITI 1521\\Labo\\Lab7_300094197\\write.txt");
        for (int i = 0; i <50 ; i++) {
            myOutFile.write(input[i]);
        }
        myOutFile.close();
        int size;
        InputStream myInFile = new FileInputStream("C:\\Users\\decah\\Documents\\UOTTAWA-ST PAUL-NEW\\Hiver 2021\\ITI 1521\\Labo\\Lab7_300094197\\write.txt");
        size =  myInFile.available();
        System.out.println("reading contents of file write2.txt...");
        for (int i = 0; i < size; i++) {
            System.out.println((char) myInFile.read());
        }
        myInFile.close();
    }
}
