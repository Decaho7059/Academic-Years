//Q1

package com.decahocode;

public class Book {
    private String title, author;
    public Book (String a, String t){
        author = a;
        title = t;
    }
    public static void main(String[] args){
        Book book1 = new Book("J.K. Rowling","Harry Potter");
        Book book2 = new Book("Suzanne Collins", "The Hunger Games");
        System.out.println("L'auteur de ce livre est: "+book1.author);
        System.out.println("L'auteur de ce livre est: "+book2.author);

    }
    public String getAuthor(){
        return author;
    }


}
