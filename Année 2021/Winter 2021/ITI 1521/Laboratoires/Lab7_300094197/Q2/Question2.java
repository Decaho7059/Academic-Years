package com.Lab_7_ITI_1521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Question2 {
    public static void main(String[] args) throws IOException {
        int tab[] = {10, 24, 31, 60, 100};
        System.out.println("enter a number as array index and find out its value ");
        try{
            String line ;
            int pos ;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while((line = input.readLine())!=null){
                if (line.equals("end")) break;
                else{
                    try {
                        for (int i = 0; i < tab.length; i++) {
                            if (line.equals(tab[i])){
                                pos = tab[i];
                                System.out.println("Valid element and it is: "+pos);
                            }
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException m){
                        System.out.println("invalid elements ");
                        System.out.println("generated exception : "+m);
                    }
                    catch (NumberFormatException n){
                        System.out.println("sorry no characters ");
                        System.out.println("generated exception : "+n);
                    }
                }

            }
        } catch (IOException i) {
            //i.printStackTrace();
        }
    }
}
