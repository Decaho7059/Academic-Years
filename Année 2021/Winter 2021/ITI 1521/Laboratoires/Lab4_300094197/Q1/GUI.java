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
    }

    public static void main(String[] args) {
        GUI f = new GUI();
        f.setVisible(true);
    }
}
