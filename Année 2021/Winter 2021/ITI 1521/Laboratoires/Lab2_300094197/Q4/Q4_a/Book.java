//Q1

package com.decahocode;

public class Book {
    private String title, author;
    public Book(String a, String u){
        author = a;
        title = u;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
