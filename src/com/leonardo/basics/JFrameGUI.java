package com.leonardo.basics;

import javax.swing.*;

public class JFrameGUI {
    public static void main(String[] args) {
        //JFrame =   es una ventana GUI para agregar componentes

        JFrame frame = new JFrame();     //nos crea un Frame
        frame.setTitle("Login");        //titulo del frame
        frame.setSize(420, 420); //establece las medidas del frame
        frame.setVisible(true);          //hará el frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
