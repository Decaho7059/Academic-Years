package com.Tableaux;

public class Tab{
    public static void main(String [] args) {
        int tab1[] = {3, 55, 7, 1, 88, 9, 4, -10};
        int[] tab2;
        tab2 = new int[]{10, 34, 62, 56, 82, 7, 95};

        trier(tab1);
        for (int i = 0; i< tab1.length; i++){
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(tab1[i]);
        }
        System.out.println("\n");
        trier(tab2);
        for (int i = 0; i< tab2.length; i++){
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(tab2[i]);
        }
        System.out.println();


    }
    int moyenne1, moyenne2 ;
    int somme1, s ;
    public int moyenne(String t1){
        for (int i = 0; i < t1.length(); i++) {
            somme1 = somme1 + i;
            moyenne1 = somme1/ t1.length();
        }
        return moyenne1;
    }

    private static int length() {
        return Tab.length();
    }

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


}
