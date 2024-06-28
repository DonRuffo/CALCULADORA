package org.example;

import java.lang.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraC {
    private JTextField Numero1;
    private JTextField Numero2;
    public JPanel calculadora;
    private JButton Suma;
    private JButton Resta;
    private JButton Multiplicacion;
    private JButton division;
    private JButton potencia;
    private JButton raiz;
    private JButton seno;
    private JButton coseno;
    private JLabel Resultado;
    private JLabel Respuesta;
    private JButton tangente;


    public CalculadoraC() {

        //operciones Basicas
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double suma = num1 + num2;
                Respuesta.setText(String.format("%.2f", suma));

            }
        });
        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double resta = num1 - num2;
                Respuesta.setText(String.format("%.2f", resta));

            }
        });
        Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double multiplicacion = num1 * num2;
                Respuesta.setText(String.format("%.2f", multiplicacion));

            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                if (num2 == 0) {
                    Respuesta.setText("Imposible");
                    JOptionPane.showMessageDialog(null, "División por cero no es posible.");
                } else {
                    double div = num1 / num2;
                    Respuesta.setText(String.format("%.2f", div));
                }


            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = Numero1.getText();
                String numero2 = Numero2.getText();
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);
                double potencia = Math.pow(num1, num2);
                Respuesta.setText(String.format("%.2f", potencia));

            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero2 = Numero2.getText();
                double num2 = Double.parseDouble(numero2);
                Numero1.setText("Raiz-cuadrada()");
                double raizCuadrada = Math.sqrt(num2);
                Respuesta.setText(String.format("%.2f", raizCuadrada));

            }
        });

        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero2 = Numero2.getText();
                double num2=new Double(numero2).doubleValue();
                Numero1.setText("Sen()");
                double seno = Math.sin(num2);
                String senoStr = String.format("%.3f", seno);
                Respuesta.setText(String.valueOf(senoStr));
            }
        });

        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero2 = Numero2.getText();
                double num2=new Double(numero2).doubleValue();
                Numero1.setText("Cos()");
                double coseno = Math.cos(num2);
                String cosenoStr = String.format("%.3f", coseno);
                Respuesta.setText(String.valueOf(cosenoStr));
            }
        });
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero2 = Numero2.getText();
                double num2=new Double(numero2).doubleValue();
                Numero1.setText("Tan()");
                double tangente = Math.tan(num2);
                String tangenteStr = String.format("%.3f", tangente);
                Respuesta.setText(String.valueOf(tangenteStr));
            }
        });

    }
}
