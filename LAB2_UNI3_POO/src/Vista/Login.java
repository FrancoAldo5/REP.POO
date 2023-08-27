/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author josep
 */
public class Login extends JFrame{
    public JPanel panel;
     Conexion cc=new Conexion();
Connection con=(Connection) cc.conexion();
    
    public void colocarPanel() {//colocando el panel
        panel = new JPanel();
        panel.setBackground(Color.white);//color para el panel
        this.getContentPane().add(panel);//agragar el panel
    }
    
    public void iniciarComponentes() {// metodo para agregar las cosas al panel
         colocarPanel();
         colocarEtiqueta();
         
         
    }

    public void colocarEtiqueta(){
        JLabel label = new JLabel("LOGIN", SwingConstants.CENTER);//objeto para el label
        panel.add(label);// se agrega al panel
        panel.setLayout(null);
        label.setBounds(100, 10, 100, 25);//dimensiones
        label.setForeground(Color.WHITE);//color de la letra 
        label.setBackground(Color.BLACK);// color del fondo
        label.setOpaque(true);
        
        JLabel label2 = new JLabel("Usuario:");//objeto para el label
        panel.add(label2);// se agrega al panel
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));// tipo de letra y tamaño
        label2.setBounds(10, 90, 100, 25);//dimensiones
        
        JLabel label3 = new JLabel("Clave:");//objeto para el label
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
    }
    
}
