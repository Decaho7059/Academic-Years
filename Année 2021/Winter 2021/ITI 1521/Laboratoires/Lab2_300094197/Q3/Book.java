//Q1

package com.decahocode;

public class Book {
    private String title, author;
    public Book (String a, String t){
        author = a;
        title = t;
    }
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
