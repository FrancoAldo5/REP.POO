/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author josep
 */
public class Registro extends JFrame {
    
    public JPanel panel;
    
    public Registro() {
        this.setSize(500, 500);
        setTitle("Registro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
        colocarAreaTXT();
        ColocarCajatexto();
    }
    
    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.blue);
        this.getContentPane().add(panel);
    }
    
    public void colocarEtiqueta() {
        JLabel label = new JLabel("REGISTRAR", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100, 10, 250, 50);
        label.setForeground(Color.red);
        label.setBackground(Color.green);
        label.setOpaque(true);
        
        JLabel label1 = new JLabel("NOMBRE:");
        panel.add(label1);
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label1.setBounds(100, 70, 350, 50);
        
        JLabel label2 = new JLabel();
        ImageIcon icon = new ImageIcon("form.png");
        label2.setBounds(100, 100, 50, 50);
        panel.add(label2);
        label2.setIcon(new ImageIcon(icon.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void colocarBotones() {
        JButton boton = new JButton("CLICK");
        boton.setBounds(30, 310, 100, 50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        
        JButton boton2 = new JButton("CLICK");
        boton2.setBounds(120, 310, 100, 50); // Ajusta la posición para evitar solapamiento
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');
    }
    
    public void ColocarCajatexto(){
        JTextField cajaTexto1= new JTextField();
        cajaTexto1.setBounds(130,80,250,30);
        panel.add(cajaTexto1);
        cajaTexto1.setText("HOLA");
        System.out.println("El texto de la caja es:"+cajaTexto1.getText());
    }
    
    /**
     *
     */
    public void colocarAreaTXT(){
        JTextArea areatxt = new JTextArea();
        areatxt.setBounds(130,140,250,90);
        panel.add(areatxt);
        areatxt.setText("ESTA ES LA AREA DE TEXT");
        System.out.println("La area de texto es:" + areatxt.getText());
        
        
        JScrollPane barra = new JScrollPane(areatxt);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(130,140,250,90);
        panel.add(barra);
    }
    
    
}
