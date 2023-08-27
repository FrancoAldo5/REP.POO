/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relax_1_interfaces;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author josep
 */
public class Ventana extends JFrame{
    public Ventana(){
        //setSize(500, 500); //tamaño de la ventana
        iniciarComponente();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para dejar de ejecutar al cerrar la ventana
        //setLocation(100,200); //ccordenadas de la ventana
        setBounds(100,200,500,500);// coordenadas y tamañao de la ventana
        setLocationRelativeTo(null);//para que se centre la ventana
        setTitle("El mejor ats");//para colocar un titulo a la ventana
    }
    private void iniciarComponente(){//panel
        JPanel panel= new JPanel();//objeto del panel
        panel.setLayout(null);
        panel.setBackground(Color.blue);
        this.getContentPane().add(panel);//agregamos el panel a la ventana
        
        JLabel etiqueta= new JLabel("HOLA");
        etiqueta.setBounds(10, 10, 50, 30);
        panel.add(etiqueta);
    }
    
    
}
