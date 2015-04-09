package boletin25_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    

    public void amosar() {
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("Programacion");
        boton2 = new JButton("Bases de datos");
        //panel.setLayout(null);
        panel.add(boton1);
        panel.add(boton2);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(180, 100);
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1 == e.getSource()) {
            marco.setTitle("Programacion");
        }
        if (boton2 == e.getSource()) {
            marco.setTitle("Bases de datos");
        }
    }
}

