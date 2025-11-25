package com.Devoir2_ITI_1521;

public class Calculator {
    //variables
    private double first, second, result;
    private String oP;

    //constrcteur sans arguments
    public Calculator() {
    }

    //méthodes qui initialises les coommandes
    void operation(String str) {
        first = second;
        second = 0;
        oP = str;
    }

    //addition
    void add() {operation("+"); }

    //soustraction
    void subtract(){ operation("-");}
    //multiplication
    void multiply(){operation("*");}
    //division
    void divide(){operation("/"); }
    //factoriel
    void factorial(){ operation("!");}
    //puissance
    void pow(){ operation("POW");}
    // racine carrée
    void rootSquare(){ operation("sqrt");}
    //logarithme
    void nepLog(){ operation("ln");}
    // évaluation de la touche =
    void compute(){
        switch (oP){
            case "+":
                second = first + second;
                break;
            case "-":
                second = first - second;
                break;
            case "*":
                second = first * second;
                break;
            case "/":
                second = first / second;
                break;
            case "!":
                if (first >=0) {
                    second = Math.sqrt(2 * Math.PI * first) * Math.pow((first / 2.718 /*Math.E*/), first) * (1 + 1 / (12 * first));
                }else {
                    System.out.println("Error nombre incorrect");
                }
                break;
            case "POW":
                second = Math.pow(first, second);
                break;
            case "sqrt":
                if (first >=0){
                    second = Math.sqrt(first) ;
                }else {
                    System.out.println("Error nombre incorrect");
                }
                break;
            case "ln":
                second = Math.log(first);
                break;
        }
    }
    //renvoie la 2e opérande
    double display(){ return second;}

    //remise à zéro
    void clear(){
        operation("C");
        first = second;
        second = 0;
        oP = "";
        //return second;
    }





}
