package com.Labo_8_ITI_1521;

public class Cashier {
    // variable de class
    public static final String str = System.getProperty("line.separator");

    //variable instance
    private Queue<Client> queue;
    private Client currentClient;
    private int ClientTime;
    private int ClientServed;
    private  int ItemsDone;

    //Constructor
    public Cashier(){
        this.queue = new ArrayQueue<Client>();
        this.ClientTime = 0;
        this.ClientServed = 0;
        this.ItemsDone = 0;
    }

    //methods instances
    public void add(Client client){
        queue.enqueue(client);
    }
    public int getQueueSize(){
        return queue.size();
    }
    public void servedClients(int currentTime){
        if (currentClient == null && queue.isEmpty()){
            return ;
        }
        if (currentClient == null){
            currentClient = queue.dequeue();
            ClientTime += (currentTime - currentClient.getArriveTime());
            ClientServed++;
        }
        currentClient.serve();
        if (currentClient.getItems() == 0){
            ItemsDone+= currentClient.getItemsDone();
            currentClient =null;
        }
    }
    public int getClientTime(){
        return this.ClientTime;
    }
    public int getItemsDone(){
        return this.ItemsDone;
    }
    public int getClientServed(){
        return this.ClientServed;
    }
    public String toString(){
        StringBuffer out = new StringBuffer();

        out.append("The total number of clients served is ");
        out.append(ClientServed);
        out.append(str);

        out.append("the average number of items per client was ");
        out.append(ItemsDone);
        out.append(str);

        out.append("The average time (in seconds) was ");
        out.append(ClientTime);
        out.append(str);

        return out.toString();

    }

}
