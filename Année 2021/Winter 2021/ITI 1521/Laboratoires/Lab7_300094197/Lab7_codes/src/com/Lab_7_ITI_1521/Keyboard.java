package com.Lab_7_ITI_1521;

import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        int num;
        while((num = in.read())!=-1){
            char c = (char)num;
            System.out.println("unicode = "+num+", char = "+c);
        }
        System.out.println("bye");
    }
}
