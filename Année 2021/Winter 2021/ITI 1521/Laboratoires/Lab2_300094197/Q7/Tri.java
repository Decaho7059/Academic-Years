package com.Tableaux;

public class Tri {
    public static void trier(int[] tab){
        int i,j,min,tmp;
        for (i = 0; i< tab.length-1; i++){
            min = i;
            for (j = i+1; j< tab.length; j++){
                if (tab[j] < tab[min]){
                    min = j;
                }
            }
            tmp = tab[min];
            tab[min]=tab[i];
            tab[i]=tmp;
        }
    }
    public static void main(String[] args){
        int[] notes;
        notes=new int[]{125, 3, 272, 5, 80, 87, 74};
        trier(notes);
        for (int i = 0; i< notes.length; i++){
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(notes[i]);
        }
        System.out.println();
    }
}
