package com.Q3;

import com.Q1.ArrayStack;
import java.util.Stack;


public class algorithm2 {
    public static boolean algorithm2(String str ) {
        Stack<Character> myStack;
        myStack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                myStack.push(new Character(current));
            }
            if (current == ')' || current == ']' || current == '}'){
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
    public static void main(String[] args){
        String str = new String("()[]()");
        String str1 = new String("(14 * (47 - 2)))");
        String str2 = new String(" ((())");

        System.out.println(algorithm2(str));


    }
}
