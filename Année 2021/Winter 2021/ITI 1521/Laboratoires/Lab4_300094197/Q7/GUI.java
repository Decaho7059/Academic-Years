package com.Labo4_300094197;

import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.Point;

public class GUI extends JFrame implements ActionListener {
    public static final int DRAW_SIZE = 400;
    public java.awt.Point[] tabPoints = new java.awt.Point[10];
    private int x,y;
    DrawPanel trace;
    private Color changeColorDraw = Color.BLACK;

    public GUI(){
        super("GUI 1"); //appel des parametres de la classe mere
        setSize(DRAW_SIZE, DRAW_SIZE);  // dimension de la fenetre
        setTitle(getTitle());  // initialise le titre avec celui de la classe mere
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // crée un exit pour le programme des que fermé
        setBackground(Color.WHITE);

        //dessine la figure
        trace = new DrawPanel();

        //crée une zone d'affichage et ses parametres
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        add(panel, BorderLayout.NORTH);

        //crée deux boutons
        JButton Shape = new JButton("Shape");
        JButton Quit = new JButton("Quit");

        //ajout des boutons à la zonne d'affichage
        panel.add(Shape);
        panel.add(Quit);
        Shape.addActionListener(this);
        Quit.addActionListener(this);

        //crée le panneau central
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        add(panel1, BorderLayout.CENTER);
        add(trace);
        setJMenuBar(createMenu());
        setVisible(true);
    }

    //Constructeur pour le point
    public void Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){return (int)(Math.random() * DRAW_SIZE); }
    public int getY() {return (int)(Math.random() * DRAW_SIZE);}

    //mathode d'ajout de point
    private void addpoint(Point p){
        for (int i = 0; i < tabPoints.length; i++) {
            //tant que le prochain index est null le remplir
            if (tabPoints[i]==null){
            tabPoints[i] = new Point(p);
            break;}
        }
    }

    //méthode java qui facilite l'interraction avec la machine
    public void actionPerformed(ActionEvent e){
        // identifier quel bouton est appuyer
        String command;
        command = e.getActionCommand();
        for (int i=0; command.equals("Shape"); i++) {
                addpoint(new Point((int) getX(), ((int) getY())));
                changeColorDraw = Color.red;  //changer la couleur
                trace.repaint();  //dessiner
                break;
        }
        if (command.equals("Quit")){
            System.exit(0);
        }
    }
    //sous classe qui permet l'affichage du graphe
    private class DrawPanel extends JPanel {

        public void paint(Graphics g){
            super.paint(g);
            for (int i = 0; i < tabPoints.length-1; i++) {
                if (tabPoints[i+1] != null && tabPoints[i] !=null){
                    g.setColor(changeColorDraw);
                    g.drawLine(tabPoints[i].x, tabPoints[i].y,  tabPoints[i+1].x, tabPoints[i+1].y);
                }
            }
        }
    }
    //cree un meu de couleur
    JMenuBar createMenu(){
        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("ColorMenu");
        bar.add(menu);

        JMenuItem item = new JMenuItem("Black");
        menu.add(item);

        item = new JMenuItem("Red");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Green");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Blue");
        item.addActionListener(this);
        menu.add(item);
        return bar;
    }
    //méthode main
    public static void main(String[] args) {
        new GUI();
    }
}
