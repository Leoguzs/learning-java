package com.leonardo.basics;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Hola, "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad "));
        JOptionPane.showMessageDialog(null, "tienes "+ age + " años");
    }
}
