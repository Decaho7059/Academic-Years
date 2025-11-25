package com.decahocode;

public class TestBook {
    public static void main(String args[]) {
        //Constructeur sans parametre
        Book book1 = new Book("Paul", "Jacques");

        //constructeur avec paramettre
        Book book2 = new Book(null,null);

        //Appel de la méthode affiche()
        String book = book1.affiche();
        System.out.println(book);
    }

}
