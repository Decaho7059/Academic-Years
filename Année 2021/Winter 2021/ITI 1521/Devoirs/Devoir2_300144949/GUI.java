package com.Devoir2_ITI_1521;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame implements ActionListener{
    //attribut
    Calculator cal = new Calculator();
    private int DRAW_SIZE = 320;
    JTextField text ;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[11];
    JButton addButton, SubButton, mulButton, divButton;
    JButton equButton, clrButton;
    JButton PowButton, sqrtButton, lnButton, factButton;
    JPanel panel;
    private Double num1, num2, result;

    Font myFont = new Font("Int Free", Font.BOLD, 14);
    String operator;

    //constructeur
    public GUI(){
        super("Calculator");
        setSize(DRAW_SIZE, DRAW_SIZE);
        setTitle(getTitle());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.white);
        setLayout(null);
        text = new JTextField();

        text.setBounds(15, 10, 280, 25);
        text.setFont(myFont);
        text.setEditable(false);

        clrButton = new JButton("C");
        factButton = new JButton("!");
        addButton = new JButton("+");
        SubButton = new JButton("-");
        mulButton = new JButton("*");
        PowButton = new JButton("POW");
        sqrtButton =new JButton("sqrt");
        lnButton = new JButton("ln");
        equButton = new JButton("=");
        divButton = new JButton("/");
        //negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = SubButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = clrButton;
        functionButtons[5] = lnButton;
        functionButtons[6] = sqrtButton;
        functionButtons[7] = factButton;
        functionButtons[8] = equButton;
        functionButtons[9] = PowButton;
        //functionButtons[10] = negButton;

        for (int i =0; i<10; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for (int i =0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(15, 40, 280, 220);
        panel.setLayout(new GridLayout(4,4,5,5));

        panel.add(numberButtons[0]);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(clrButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(factButton);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        panel.add(SubButton);
        panel.add(mulButton);
        panel.add(PowButton);
        panel.add(sqrtButton);
        panel.add(lnButton);
        panel.add(equButton);
        panel.add(divButton);

        add(panel);
        add(text);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]){
                text.setText(text.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource()==addButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "+";
            text.setText("");
        }
        if (e.getSource()==SubButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "-";
            text.setText("");
        }
        if (e.getSource()==mulButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "*";
            text.setText("");
        }
        if (e.getSource()==divButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "/";
            text.setText("");
        }
        if (e.getSource()==lnButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "ln";
            text.setText("");
        }
        if (e.getSource()==sqrtButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "sqrt";
            text.setText("");
        }
        if (e.getSource()==PowButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "POW";
            text.setText("");
        }
        if (e.getSource()==factButton){
            num1 = Double.parseDouble(text.getText());
            operator  = "!";
            text.setText("");
        }
        if (e.getSource()==equButton){
            num2 = Double.parseDouble(text.getText());

            switch (operator){
                case "+":
                    cal.add();
                    break;
                case "-":
                    cal.subtract();
                    break;
                case "*":
                    cal.multiply();
                    break;
                case "/":
                    cal.divide();
                    break;
                case "!":
                    cal.factorial();
                    break;
                case "ln":
                    cal.nepLog();
                    break;
                case "sqrt":
                    cal.rootSquare();
                    break;
                case "POW":
                    cal.pow();
                    break;
            }
            text.setText(String.valueOf(cal.display()));
            num2 = cal.display();
        }
        if (e.getSource()==clrButton){
            text.setText("");
        }
    }

    public static void main(String[] args){
        //GUI f = new GUI();
        //Calculator f = new Calculator();
        new GUI();
    }
}
