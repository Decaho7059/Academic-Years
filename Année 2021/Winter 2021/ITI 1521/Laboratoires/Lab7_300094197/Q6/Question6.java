package com.Lab_7_ITI_1521;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Question6 {
    public static void main(String[] args){
        try{
            InputStream is = new FileInputStream("C:/Users/decah/Documents/UOTTAWA-ST PAUL-NEW/Hiver 2021/ITI 1521/Labo/Lab7_300094197/Q6/write.txt");
            
        }
        catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
