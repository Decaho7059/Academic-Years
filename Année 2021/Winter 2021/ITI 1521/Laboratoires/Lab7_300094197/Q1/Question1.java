package com.Lab_7_ITI_1521;

import java.io.*;

public class Question1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter some characters and a return: ");
        InputStreamReader in = new InputStreamReader(System.in);
        int num = 0;
        while(num< in.read()) {
            num ++;
        }
        System.out.println("The number of characters read is: "+num );
    }

    int read(char[] b) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("data"));
        int num;
        char[] buffer = new char[256];
        num = in.read(buffer);
        String str = new String(buffer);
        return num;
    }
    int trim(char[] b)throws IOException{
        File f = new File("data");
        InputStream on = new FileInputStream(f);
        int a = on.read();
        if (a==-1){
            boolean ch = f.delete();
        }
        return a;
    }

}

