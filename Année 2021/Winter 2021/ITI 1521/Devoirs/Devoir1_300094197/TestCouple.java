package com.devoir1;

public class TestCouple {
    public static void main(String[] args){
        Couple c1 = new Couple(2,3);
        Couple c2 = new Couple(0, 0);
        Couple c3 = new Couple(2, 3);

        c1.display();
        System.out.println("");
        c2.display();
        System.out.println("");
        c3.display();
        System.out.println("");

        c3.setP(8);

        System.out.println("Après modification, les éléments de c3 sont: "+c3.getP()+" , "+c3.getQ());
        System.out.println("c1 est inférieur à c3: "+c1.compare(c3));
    }
}
