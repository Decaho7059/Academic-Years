package com.Labo3_ITI;

public class TestBook {
    public static void main(String[] args) {
       Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java",100);
       Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ",120);
       Book book3 = new Book("Mark Grand", "Pattern in java",250);

        Accountant a = new Accountant();
        a.count(book2); a.count(book1); a.count(book3);

        book1.affiche();
        System.out.println();
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println("total book prices recorded by the accountant is: "+a.getTotalPrice());

    }
}
