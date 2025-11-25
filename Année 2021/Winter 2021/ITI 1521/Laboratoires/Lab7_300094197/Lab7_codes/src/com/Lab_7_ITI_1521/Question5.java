package com.Lab_7_ITI_1521;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Question5 {
    public static void main(String [] args){
        try {
            byte[] tab = new byte[-1];
        }
        catch(NegativeArraySizeException N){
            System.out.println("generated exception : "+N);
            //System.out.println(" After the try block");

        }
        System.out.println(" After the try block");
    }
}
