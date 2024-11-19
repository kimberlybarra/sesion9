package sesion9;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EjemploBorderLayout {
	public static void main(String[] args) {
        JFrame ejeBor = new JFrame("ejemplo de BorderLayout");
        ejeBor.setSize(400, 300);
        ejeBor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ejeBor.setVisible(true);

        ejeBor.setLayout(new BorderLayout());        

        JButton botonnorte = new JButton("norte");
        botonnorte.addActionListener(e -> JOptionPane.showMessageDialog(ejeBor, "estas en el norte"));
        
        JButton botonsur = new JButton("sur");
        botonsur.addActionListener(e -> JOptionPane.showMessageDialog(ejeBor, "estas en el sur"));
        
        JButton botoneste = new JButton("este");
        botoneste.addActionListener(e -> JOptionPane.showMessageDialog(ejeBor, "estas en el este"));
        
        JButton botonoeste = new JButton("oeste");
        botonoeste.addActionListener(e -> JOptionPane.showMessageDialog(ejeBor, "estas en el oeste"));
        
        JButton botoncentro = new JButton("centro");
        botoncentro.addActionListener(e -> JOptionPane.showMessageDialog(ejeBor, "estas en el centro"));
        
        ejeBor.add(botonnorte, BorderLayout.NORTH);
        ejeBor.add(botonsur, BorderLayout.SOUTH);
        ejeBor.add(botoneste, BorderLayout.EAST);
        ejeBor.add(botonoeste, BorderLayout.WEST);
        ejeBor.add(botoncentro, BorderLayout.CENTER);
    }
}

