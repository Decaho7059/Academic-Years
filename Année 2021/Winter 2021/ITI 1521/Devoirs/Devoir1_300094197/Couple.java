package com.devoir1;

public class Couple {
    private int p, q;

    public Couple(int x, int y){
        p = x;
        q = y;
    }
    public Couple() {
        this.p = 0;
        this.q = 0;
    }
    public Couple(Couple n){
        this.p = n.getP();
        this.q = n.getQ();
    }
    public void display(){
        System.out.print("("+getP()+","+getQ()+")");
    }

    public boolean compare(Couple c1) {

        return((this.p < c1.getP())||((this.p == c1.getP()) && (this.q < c1.getQ())));
    }


    public int getP() { return p; }

    public int getQ() { return q; }

    public void setP(int a){ this.p = a;}
    public void setQ(int b){ this.q = b;}
}
