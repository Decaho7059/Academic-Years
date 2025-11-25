package com.Labo3_ITI;

public class Use {
    public static String[] replace(String[] tabIn, String[] tab, String[] tabOut) {

        int i;
        for (i = 0; i < tabIn.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                for (int k = 0; k < tabOut.length; k++) {
                    if (tabIn[i] == tab[j]) {
                        if ((tab.length == tabOut.length)) {
                            tab[i] = tabOut[j];
                        }

                    } else if (tab.length != tabOut.length) {
                        return null;
                    }else if (tabIn == null || tab == null || tabOut == null) {
                        return null;
                    }
                //else if () {
                //}
            }


            }
        }

        return null;
    }


    public static void main(String[] args) {
        String[] tabIn = new String[]{"Book", "off", "I"};
        String[] tab = new String[]{"Java", "C++", "off"};
        String[] tabOut = new String[]{"Id", "Name", "my"};
        replace(tabIn, tab, tabOut);
        for (int i = 0; i < tabIn.length; i++) {
            System.out.println(tabIn[i]);
        }
        System.out.println(",");
        //System.out.println();
    }

}
