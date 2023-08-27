/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Control.Conexion;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Horario extends JFrame {

    public JPanel panel;
    Conexion cc = new Conexion();
    Connection con = (Connection) cc.conexion();
    JTextField cajaTexto1;
    JTextField cajaTexto2;
    JTextField cajaTexto3;
    JTextField cajaTexto4;
    JTextField cajaTexto5;
    JComboBox<String> combo1;
    JComboBox<String> combo2;
    JTable table;

    public Horario() {
        this.setSize(1000, 1000);
        setTitle("Horarios");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ejecución al cerrar la ventana
        setLocationRelativeTo(null);// para que centre la ventana al abrir
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        ColocarCajatexto();
        colpcarComobox();
        tabla();
        colocarBotones();

    }

    public void colocarPanel() {
        panel = new JPanel();
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public void colocarEtiqueta() {
        JLabel label = new JLabel("HORARIO", SwingConstants.CENTER);
        panel.add(label);
        panel.setLayout(null);
        label.setBounds(100, 10, 100, 25);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        JLabel label2 = new JLabel("Hora:");
        panel.add(label2);
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setBounds(10, 90, 100, 25);

        JLabel label3 = new JLabel("Encargado:");
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);

        JLabel label4 = new JLabel("Semestre:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);

        JLabel label5 = new JLabel("Estado:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
    }

    public void ColocarCajatexto() {
        cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(100, 90, 250, 25);
        panel.add(cajaTexto1);
        cajaTexto1.setText("");

        cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(100, 130, 250, 25);
        panel.add(cajaTexto2);
        cajaTexto2.setText("");
    }

    public void colpcarComobox() {
        combo1 = new JComboBox<>();
        combo1.setBounds(100, 170, 150, 25);
        panel.add(combo1);
        combo1.addItem("Primer Semestre");
        combo1.addItem("Segundo Semestre");
        combo1.addItem("Tercer Semestre");
        combo1.addItem("Cuarto Semestre");
        combo1.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Semestre seleccionado: " + selectedOption);
        });
        panel.add(combo1);

        combo2 = new JComboBox<>();
        combo2.setBounds(100, 210, 150, 25);
        panel.add(combo2);
        combo2.addItem("Activo");
        combo2.addItem("Inactivo");
        combo2.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Estado seleccionado: " + selectedOption);
        });
        panel.add(combo2);
    }

    public void tabla() {
        String[] columNames = {"Codigo", "Hora", "Encargado", "Semestre", "Estado"};
        DefaultTableModel tableModel = new DefaultTableModel(columNames, 0);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(400, 50, 600, 250);
        panel.add(scrollPane);
        mostrarDatos();
    }

    public void colocarBotones() {
        JButton boton = new JButton("Nuevo");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });
        boton.setBounds(30, 420, 70, 30);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');

        JButton boton1 = new JButton("Guardar");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarDatos();
                mostrarDatos();
            }
        });
        boton1.setBounds(120, 420, 100, 30);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');

        JButton boton2 = new JButton("Editar");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro para editar.");
                    return;
                }
                editarRegistroEnTabla(filaSeleccionada);
            }
        });
        boton2.setBounds(235, 420, 80, 30);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('a');

        JButton boton3 = new JButton("Eliminar");
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
                    return;
                }
                eliminarDatos(filaSeleccionada);
            }
        });
        boton3.setBounds(30, 460, 100, 30);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('a');

        JButton boton4 = new JButton("Salir");
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        boton4.setBounds(135, 460, 100, 30);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('a');

        JButton botonReporte = new JButton("Generar Reporte PDF");
        botonReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarReportePDF();
            }
        });
        botonReporte.setBounds(30, 500, 150, 30);
        panel.add(botonReporte);
    }

    private void generarReportePDF() {
        List<String[]> registros = obtenerRegistros();
        try {
            Reporte.generarReportePDF(registros);
            System.out.println("Se ha generado el reporte en PDF");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
        }
    }

    private List<String[]> obtenerRegistros() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        List<String[]> registros = new ArrayList<>();

        for (int fila = 0; fila < model.getRowCount(); fila++) {
            String[] registro = new String[model.getColumnCount()];
            for (int columna = 0; columna < model.getColumnCount(); columna++) {
                registro[columna] = model.getValueAt(fila, columna).toString();
            }
            registros.add(registro);
        }

        return registros;
    }

    public void insertarDatos() {
        try {
            String SQL = "INSERT INTO estudiantes(estu_titulo, estu_nombre, estu_apellido, estu_asignatura, estu_estado, estu_celular, estu_mail) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setString(1, cajaTexto1.getText());
            pst.setString(2, cajaTexto3.getText()); // Fixed the ordering
            pst.setString(3, cajaTexto2.getText()); // Fixed the ordering

            int seleccion = combo1.getSelectedIndex();
            pst.setString(4, combo1.getItemAt(seleccion));

            int seleccion2 = combo2.getSelectedIndex();
            pst.setString(5, combo2.getItemAt(seleccion2));

            pst.setString(6, cajaTexto4.getText());
            pst.setString(7, cajaTexto5.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e);
        }
        // Implementar la lógica de inserción en la base de datos
    }

    public void mostrarDatos() {
        // Implementar la lógica de mostrar los datos desde la base de datos
    }

    private void eliminarDatos(int filaSeleccionada) {
        // Implementar la lógica de eliminación en la base de datos
        mostrarDatos();
    }

    private void editarRegistroEnTabla(int fila) {
        // Implementar la lógica de edición de registro en la base de datos y en la tabla
    }
}