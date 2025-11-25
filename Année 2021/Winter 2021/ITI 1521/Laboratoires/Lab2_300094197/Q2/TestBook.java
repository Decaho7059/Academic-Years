package com.decahocode;

public class TestBook {
    public static void main(String args[]){
        Book jean = new Book("Jean", "ITI programs");
        System.out.println("Le nom de l'auteur est: "+jean.getAuthor());
        Book Paul = new Book("Paul", "World of the java Program");
        System.out.println("Le nom de l'auteur est: "+Paul.getAuthor());
    }
}
