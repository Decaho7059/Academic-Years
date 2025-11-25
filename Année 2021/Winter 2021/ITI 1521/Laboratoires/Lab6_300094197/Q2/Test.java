package com.Q2;

public class Test {
    /**
     * verifuie si le string possède un [] or () or {}
     * @param str str
     * @return true or false
     */

    public static boolean algorithm1(String str) {
        int brace, square, bow;
        brace = square = bow = 0;
        for (int i = 0; i < str.length(); i++) {
            char c;
            c = str.charAt(i);
            switch (c) {
                case '{':
                    brace++;
                    break;
                case '}':
                    brace--;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    break;
                case '(':
                    bow++;
                    break;
                case ')':
                    bow--;
            }
        }
        return brace == 0 && square == 0 && bow == 0;
    }
    public static void main(String[] args){
        String str = "(14 * (47 -2))";
        String str1 = "([][0])";
        String str2 = "()[]()";

        System.out.println("Test"+str1+" return "+algorithm1(str1));
        //System.out.println("algorithm2"+str2+" return "+Test(str2));
        //System.out.println("algorithm0"+str+" return "+Test(str));

    }

}
