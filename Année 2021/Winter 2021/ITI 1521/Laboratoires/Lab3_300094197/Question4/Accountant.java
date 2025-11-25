package com.Labo3_ITI;

public class Accountant {
    private double totalPrice;

    void count(Book b){
        totalPrice += b.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
