package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi aplicacion de login"); //Intanciado
        frame.setContentPane(new CalculadoraC().calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar procesos
        frame.setSize(20000, 1000);
        frame.pack();
        frame.setVisible(true);
    }
}
