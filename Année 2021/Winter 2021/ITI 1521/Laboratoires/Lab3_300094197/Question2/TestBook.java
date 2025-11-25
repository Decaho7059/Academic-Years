package com.Labo3_ITI;

public class TestBook {
    public static void main(String[] args) {
       Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java",100);
       Book book2 = new Book("Duane A.Bailey", " Data Structures in Java for Principled Programmer ",120);

        System.out.println(book1.setPrice(12));
        System.out.println(book2.setPrice(10));

        book1.affiche();
        System.out.println();
        System.out.println(book2.toString());
    }
}
