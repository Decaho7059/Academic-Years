package com.Lab_7_ITI_1521;

public class Unicode {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            for (int j = 0; j < str.length() ; j++) {
                char ch = str.charAt(j);
                int n = (int)ch;
                System.out.println("char = "+ch+", unicode = "+n);
            }
        }
    }
}
