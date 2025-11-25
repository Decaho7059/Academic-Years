package com.decahocode;

public class TestBook {
    public static void main(String args[]){

        //Constructeur sans parametre
        Book book = new Book();
        System.out.println("L'auteur est: "+book.getAuthor()+" Le titre est: "+book.getTitle());
        System.out.println(" ");

        //constructeur avec paramettre
        final String author = "Jean";
        final String title = "Jacques";

        Book book2 = new Book();
        System.out.println("le titre est "+ title + " L'auteur est: "+ author);


    }

}
