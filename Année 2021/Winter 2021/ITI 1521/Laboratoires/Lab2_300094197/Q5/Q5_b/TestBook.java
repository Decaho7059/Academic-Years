package com.decahocode;

import  java.lang.System;
public class TestBook {
    public static void main(String args[]) {
        //Constructeur sans parametre
        Book book1 = new Book("Paul", "Jacques");

        //constructeur avec paramettre
        Book book2 = new Book(null,null);

        //Appel de la méthode toString()
        String book = book1.toString();
        System.out.println(book);

        //Appel de la méthode affiche()
        String objet = book2.affiche();
        System.out.println(objet);
    }

}
