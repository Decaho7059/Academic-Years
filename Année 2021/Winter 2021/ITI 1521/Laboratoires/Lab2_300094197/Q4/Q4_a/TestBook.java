package com.decahocode;

public class TestBook {
    public static void main(String args[]){
        Book book = new Book(null,null);
        System.out.println("L'auteur est: "+book.getAuthor()+" Le titre est: "+book.getTitle());
    }
}
