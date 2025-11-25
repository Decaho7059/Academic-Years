package com.Labo_8_ITI_1521;

public class Set {
    //Variable de class
    private static final String str = System.getProperty("line.separator");

    //Variable instance
    private Cashier[] set;

    //Constructor
    public Set(int nbr){
        set = new Cashier[nbr];
        if ((nbr<1)){
            throw new IllegalArgumentException(Integer.toString(nbr));
        }
        else{
            for (int i = 0; i < nbr; i++) {
                set[i] = new Cashier();
            }
        }
    }

    //Methods instances
    public void add(Client client){
        int ajout = 0;
        for (int i=0; i< set.length; i++){
            if (set[i].getQueueSize() < set[ajout].getQueueSize()){
                ajout = i;
            }
        }
        set[ajout].add(client);
    }

    public void servedClients(int currentTime){
        for (int i = 0; i < set.length; i++) {
            set[i].servedClients(currentTime);
        }
    }

    public String toString(){
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < set.length; i++) {
            out.append("LINE "+i+" : "+str);
            out.append(set[i]);
            out.append(str);
        }
        return out.toString();

    }

}
