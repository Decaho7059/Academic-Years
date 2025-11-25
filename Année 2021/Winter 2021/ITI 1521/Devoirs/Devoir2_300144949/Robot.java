
package com.Devoir2_ITI_1521;

import java.awt.*;
//import java.awt.Point;

public class Robot {
    private String name;
    private Point location;

    //Création d'un robot
    public Robot(String name, Point location){
        this.name = name;
        this.location = new Point(location);
    }

    //accesseur
    public Point getLocation(){ return location;}

    //modificateur
    public void setLocation(int u, int v){ location.x = u; location.y = v;}

    //Affiche l'état du robot
    public String display(){
        return "Robot: "+name+"\nLocation: ("+location.x+","+location.y+")";
    }

    //permet de le faire avancer de plusieurs pas
    public void moveTo(int xHori, int yVert){
        location.x = xHori;
        location.y = yVert;
    }
    //Calcul la distance entre les 2 obj
    public double distance(Robot r1){
        return Math.sqrt((Math.pow((this.location.x - r1.location.x),2)) + (Math.pow((this.location.y - r1.location.y),2)));
    }
    //main méthode
    public static void main(String[] args){
        Robot robot1 = new Robot("robot1",new Point(0, 0));
        Robot robot2 = new Robot("robot2", new Point(3,4));

        System.out.println(robot1.display());
        robot1.moveTo(1, 2);
        System.out.println("Déplacé de "+ robot1.location.x+" horizontalement et de "+robot1.location.y+" verticalement.");
        System.out.println(robot1.display());

        System.out.println(robot2.display());
        System.out.println("Distance entre les deux robots : "+robot1.distance(robot2));
    }
}

