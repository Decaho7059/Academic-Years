package com.Labo3_ITI;

public class TestBook {
    public static void main(String[] args) {
       Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java",0);
       Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ",120);
       Book book3 = new Book("Mark Grand", "Pattern in java",250);

        Accountant a = new Accountant();
        a.count(book2);
        Accountant b = new Accountant();
        b.count(book3);

        //System.out.println(book1.setPrice(12));
        System.out.println("Price fixed !");
        book1.affiche();
        System.out.println();
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println("total book prices recorded by the 1st accountant is: "+a.getTotalPrice());
        System.out.println("total book prices recorded by the second accountant is: "+b.getTotalPrice());

    }
}
