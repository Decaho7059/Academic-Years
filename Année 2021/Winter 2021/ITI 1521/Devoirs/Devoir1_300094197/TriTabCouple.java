package com.devoir1;

public class TriTabCouple {

    static void bubbleSort(Couple[] args){

        int n = args.length;
        Couple temp = new Couple();
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(args[j].compare(args[j-1])){
                    //swap elements
                    temp = args[j-1];
                    args[j-1] = args[j];
                    args[j] = temp;
                }
            }
        }
    }

    static void insertSort(Couple[] args) {
        Couple[] couples = new Couple[args.length];

        for (int i = 0; i < args.length; i++) {
            Couple key = args[i];
            int j = i - 1;
            while (j >= 0 && key.compare(args[j])) {
                args[j + 1] = args[j];
                j = j - 1;
            }
            args[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Couple[] p= new Couple[]{new Couple(2,5), new Couple(2,3), new Couple(0,5)};
        bubbleSort(p);
        System.out.print("Mon tableau trié est: {" );
        for (int i = 0; i < p.length; i++) {
            p[i].display();
            if (i!=p.length-1){
                System.out.print(" , ");
            }else{
            System.out.print("}");}
        }
        System.out.println("");
    }
}
