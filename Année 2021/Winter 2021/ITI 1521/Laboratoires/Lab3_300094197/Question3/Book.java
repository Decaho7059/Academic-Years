package com.Labo3_ITI;

public class Book {
    // Variables
    private String title, author;
    private final double price;

    // Constructeur
    public Book(String a, String t, double p) {
        this.author = a;
        this.title = t;
        this.price = p;
    }

    // Accesseurs
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public double getPrice(){ return price; }

    // Modificateurs
    public void setAuthor(String sA) {
        author = sA;
    }

    public void setTitle(String sT) {
        title = sT;
    }
    public String setPrice(double sP){ return "Error: negative price!"; }

    public void affiche() {
        System.out.print(toString());
    }

    public String toString() {
        String n = "";

        if (this.price == -1 ){
            n = "Error: negative price!";
        }
        else if(isFixedPrice()){
            n = "Book[title=" + title + ", author=" + author + ", fixedPrice="+isFixedPrice()+ ", price="+price+ "]";
        }
        return n;
    }

    boolean fixedPrice ;
    public boolean isFixedPrice(){
        boolean fixedPrice;
        fixedPrice = false;
        if (this.price >= 0){
            fixedPrice = true;
        }
        return fixedPrice;
    }



}
