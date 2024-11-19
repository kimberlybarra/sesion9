package sesion9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ejemplo de GridLayout");
        frame.setLayout(new GridLayout(3, 3)); 
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton botonuno = new JButton("boton 1");
        botonuno.addActionListener(e -> botonuno.setText("X"));
        frame.add(botonuno);
        
        JButton botondos = new JButton("boton 2");
        botondos.addActionListener(e -> botondos.setText("X"));
        frame.add(botondos);
        
        JButton botontres = new JButton("boton 3");
        botontres.addActionListener(e -> botontres.setText("X"));
        frame.add(botontres);
        
        JButton botoncuatro = new JButton("boton 4");
        botoncuatro.addActionListener(e -> botoncuatro.setText("O"));
        frame.add(botoncuatro);
        
        JButton botoncinco = new JButton("boton 5");
        botoncinco.addActionListener(e -> botoncinco.setText("X"));
        frame.add(botoncinco);
        
        JButton botonseis = new JButton("boton 6");
        botonseis.addActionListener(e -> botonseis.setText("O"));
        frame.add(botonseis);
        
        JButton botonsiete = new JButton("boton 7");
        botonsiete.addActionListener(e -> botonsiete.setText("O"));
        frame.add(botonsiete);
        
        JButton botonocho = new JButton("boton 8");
        botonocho.addActionListener(e -> botonocho.setText("O"));
        frame.add(botonocho);
        
        JButton botonnueve = new JButton("boton 9");
        botonnueve.addActionListener(e -> botonnueve.setText("O"));
        frame.add(botonnueve);


    }
}
