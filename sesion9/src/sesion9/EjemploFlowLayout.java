package sesion9;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploFlowLayout {
    public static void main(String[] args) {
        JFrame ejeFlo = new JFrame("ejemplo de FlowLayout cambiar de color el fondo");
        ejeFlo.setSize(400, 150);
        ejeFlo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ejeFlo.setVisible(true); 

        ejeFlo.setLayout(new FlowLayout());
        JButton botonrojo = new JButton("rojo");
        botonrojo.addActionListener(e -> {
        	ejeFlo.getContentPane().setBackground(Color.RED); 
        });

        JButton botonazul = new JButton("azul");
        botonazul.addActionListener(e -> {
        	ejeFlo.getContentPane().setBackground(Color.BLUE); 
        });

        JButton botonamarillo = new JButton("amarillo");
        botonamarillo.addActionListener(e -> {
        	ejeFlo.getContentPane().setBackground(Color.YELLOW); 
        });

        JButton botonverde = new JButton("verde");
        botonverde.addActionListener(e -> {
        	ejeFlo.getContentPane().setBackground(Color.GREEN); 
        });

        JButton botonrosado = new JButton("rosado");
        botonrosado.addActionListener(e -> {
        	ejeFlo.getContentPane().setBackground(Color.PINK); 
        });
        ejeFlo.add(botonrojo);
        ejeFlo.add(botonazul);
        ejeFlo.add(botonamarillo);
        ejeFlo.add(botonverde);
        ejeFlo.add(botonrosado);
    }
}
