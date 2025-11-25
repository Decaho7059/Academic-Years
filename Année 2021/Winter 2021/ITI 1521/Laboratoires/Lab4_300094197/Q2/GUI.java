package com.Labo4_300094197;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    public static final int DRAW_SIZE = 400;
    public GUI(){
        super("GUI 1"); //appel des parametres de la classe mere
        setSize(DRAW_SIZE, DRAW_SIZE);  // dimension de la fenetre
        setTitle(getTitle());  // initialise le titre avec celui de la classe mere
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // crée un exit pour le programme des que fermé
        setBackground(Color.WHITE);

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
    }

    public static void main(String[] args) {
        GUI f = new GUI();
        f.setVisible(true);
    }
}
