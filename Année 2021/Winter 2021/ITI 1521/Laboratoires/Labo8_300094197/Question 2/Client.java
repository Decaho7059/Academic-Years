package com.Labo_8_ITI_1521;

public class Client {
    /*modelise un client */
    //variables de class
    private static final int MAX_ITEMS =25;

    //variables instances
    private int arriveTime;
    private int Items;
    private int initialItems;

    //Constructor
    public Client(int arriveTime){
        this.arriveTime = arriveTime;
        this.Items = (int)((MAX_ITEMS - 1) * Math.random()) + 1;
        this.initialItems = this.Items;
    }

    //Methods
    public int getArriveTime(){
        return this.arriveTime;
    }
    public int getItems(){
        return this.Items;
    }
    public int getItemsDone(){
        return this.initialItems - this.Items;
    }
    public void serve(){
        this.Items--;
    }
}
