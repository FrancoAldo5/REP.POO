/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.culebra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

// Clase principal que extiende de JFrame (ventana)
public class InicioBoton extends JFrame {
    private Image imagenFondo;

    // Constructor de la clase
    public InicioBoton() {
        // Configuración de la ventana
        setTitle("Inicio del Juego");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Carga y establece la imagen de fondo en el fondo de la ventana
        cargarImagenFondo("fondo.jpg");
        setContentPane(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
            }
        });

        // Crea el botón de inicio con una imagen escalada y ajusta su apariencia
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("star_game.jpg"));
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(200, -1, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        JButton botonIniciar = new JButton(iconoEscalado);
        // Configura el aspecto del botón
        botonIniciar.setContentAreaFilled(false);
        botonIniciar.setBorderPainted(false);
        botonIniciar.setFocusPainted(false);
        botonIniciar.setOpaque(false);
        // Configura la acción al hacer clic en el botón de inicio
        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaJuego();
            }
        });

        // Crea el botón de salir con una imagen escalada y ajusta su apariencia
        ImageIcon iconoSalir = new ImageIcon(getClass().getResource("salir.jpg"));
        Image imagenEscaladaSalir = iconoSalir.getImage().getScaledInstance(150, -1, Image.SCALE_SMOOTH);
        ImageIcon iconoEscaladoSalir = new ImageIcon(imagenEscaladaSalir);
        JButton botonSalir = new JButton(iconoEscaladoSalir);
        // Configura el aspecto y la acción del botón de salir
        botonSalir.setContentAreaFilled(false);
        botonSalir.setBorderPainted(false);
        botonSalir.setFocusPainted(false);
        botonSalir.setOpaque(false);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Crea un panel para el título "SNAKE"
        JPanel panelTitulo = new JPanel();
        panelTitulo.setOpaque(false);
        JLabel labelTitulo = new JLabel("SNAKE");
        labelTitulo.setFont(new Font("Arial Black", Font.BOLD, 50));
        labelTitulo.setForeground(Color.BLACK);
        panelTitulo.add(labelTitulo);

        // Crea un panel para organizar los componentes en el centro
        JPanel panelCentro = new JPanel(new GridBagLayout());
        panelCentro.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 0, 50, 0);
        panelCentro.add(panelTitulo, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 50, 0);
        panelCentro.add(botonIniciar, gbc);

        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 50, 0);
        panelCentro.add(botonSalir, gbc);

        // Configura el diseño general de la ventana y la hace visible
        setLayout(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    // Carga la imagen de fondo desde un archivo
    private void cargarImagenFondo(String rutaImagen) {
        try {
            imagenFondo = ImageIO.read(getClass().getResource(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Abre la ventana de juego al hacer clic en el botón de inicio
    private void abrirVentanaJuego() {
      JOptionPane.showMessageDialog(this, "¡Bienvenido al juego!\nEl juego tiene una duración de 1 minuto.", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    Vista vistaJuego = new Vista();
    vistaJuego.setVisible(true);
}
    // Punto de entrada para ejecutar la aplicación
    public static void main(String[] args) {
        InicioBoton inicioBoton = new InicioBoton();
        inicioBoton.setVisible(true);
    }
}

