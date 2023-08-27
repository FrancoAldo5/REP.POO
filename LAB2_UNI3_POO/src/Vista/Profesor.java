/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.List; // Importa la interfaz List correcta
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Profesor extends JFrame{
    // heredando del jframe
    
     public JPanel panel;
     Conexion cc=new Conexion();
Connection con=(Connection) cc.conexion();
    JTextField cajaTexto1;
    JTextField cajaTexto2;
    JTextField cajaTexto3;
    JTextField cajaTexto4;
    JTextField cajaTexto5;
    JComboBox<String> combo1;
    JComboBox<String> combo2;
    JTable table;
     
     public Profesor(){
        this.setSize(1000, 1000);
        setTitle("Estudiantes");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ejecucion al cerrar la ventana
        setLocationRelativeTo(null);//para que centre la ventana al abrir
        iniciarComponentes();
     }
     
     public void iniciarComponentes() {// metodo para agregar las cosas al panel
         colocarPanel();
         colocarEtiqueta();
         ColocarCajatexto();
         colpcarComobox();
         tabla();
         colocarBotones();
         
    }
    public void colocarPanel() {//colocando el panel
        panel = new JPanel();
        panel.setBackground(Color.white);//color para el panel
        this.getContentPane().add(panel);//agragar el panel
    }
    
    public void colocarEtiqueta(){
        JLabel label = new JLabel("PROFESOR", SwingConstants.CENTER);//objeto para el label
        panel.add(label);// se agrega al panel
        panel.setLayout(null);
        label.setBounds(100, 10, 100, 25);//dimensiones
        label.setForeground(Color.WHITE);//color de la letra 
        label.setBackground(Color.BLACK);// color del fondo
        label.setOpaque(true);
        
        JLabel label2 = new JLabel("Titulo:");//objeto para el label
        panel.add(label2);// se agrega al panel
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));// tipo de letra y tamaño
        label2.setBounds(10, 90, 100, 25);//dimensiones
        
        JLabel label3 = new JLabel("Asignatura:");//objeto para el label
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
        
        
        JLabel label4 = new JLabel("Nombre:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);
        
        JLabel label5 = new JLabel("Apellido:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
        
        JLabel label6 = new JLabel("Estado:");
        panel.add(label6);
        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(10, 250, 100, 25);
        
        JLabel label7 = new JLabel("Cedula:");
        panel.add(label7);
        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(10, 290, 100, 25);
        
        JLabel label8 = new JLabel("Mail:");
        panel.add(label8);
        label8.setHorizontalAlignment(SwingConstants.LEFT);
        label8.setFont(new Font("Arial", Font.PLAIN, 15));
        label8.setBounds(10, 330, 100, 25);
    }
    
    public void ColocarCajatexto(){
        cajaTexto1= new JTextField();//objeto
        cajaTexto1.setBounds(100, 90,250,25);// dimensiones
        panel.add(cajaTexto1);
        cajaTexto1.setText("");//para que este vacio
        System.out.println("El texto de la caja es:"+cajaTexto1.getText());//
        
        cajaTexto2= new JTextField();
        cajaTexto2.setBounds(100,170,250,25);
        panel.add(cajaTexto2);
        cajaTexto2.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto2.getText());
        
        cajaTexto3= new JTextField();
        cajaTexto3.setBounds(100,210,250,25);
        panel.add(cajaTexto3);
        cajaTexto3.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto3.getText());
        
        cajaTexto4= new JTextField();
        cajaTexto4.setBounds(100,290,250,25);
        panel.add(cajaTexto4);
        cajaTexto4.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto4.getText());
        
        cajaTexto5= new JTextField();
        cajaTexto5.setBounds(100,330,250,25);
        panel.add(cajaTexto5);
        cajaTexto5.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto5.getText());
    }
    
    public void colpcarComobox(){
        combo1 = new JComboBox<>();
        combo1.setBounds(100, 130, 150, 25);
        panel.add(combo1);
        combo1.addItem("Computo");
        combo1.addItem("Edo");
        combo1.addItem("Calculo");
        combo1.addItem("Poo");
        combo1.addItem("Fisica");
        combo1.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(combo1);
        
        combo2 = new JComboBox<>();
        combo2.setBounds(100, 250, 150, 25);
        panel.add(combo2);
        combo2.addItem("Activo");
        combo2.addItem("Inactivo");
        combo2.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(combo2);
     }
    
    public void tabla(){
        String[] columNames= {"Codigo","Titulo","Asignatura","Nombre","Apellido","Estado","Cedula","Mail"};
        DefaultTableModel tableModel= new DefaultTableModel(columNames,0);
        
        table= new JTable(tableModel);
        JScrollPane scrollPane= new JScrollPane(table);
        scrollPane.setBounds(400, 50, 600, 250);
        panel.add(scrollPane);
        mostrarDatos();
        
     }
    public void colocarBotones(){//metodo para los botones
        JButton boton = new JButton("Nuevo");//objeto para le boton
        boton.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 mostrarDatos();
                
                }
        });
        boton.setBounds(30, 420, 70, 30);// dimensiones del boton
        panel.add(boton);// para agregar al panel
        boton.setEnabled(true);// para abilkitar con el true
        boton.setMnemonic('a');
        
        JButton boton1 = new JButton("Guardar");//objeto para le boton
        boton1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 insertarDatos();
                 mostrarDatos();
                
                }
        });
        boton1.setBounds(120, 420, 100, 30);//objeto para le boton
        panel.add(boton1);// para agregar al panel
        boton1.setEnabled(true);// para abilkitar con el true
        boton1.setMnemonic('a');
        
        JButton boton2 = new JButton("Editar");//objeto para le boton
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
        boton2.setBounds(235, 420, 80, 30);//objeto para le boton
        panel.add(boton2);// para agregar al panel
        boton2.setEnabled(true);// para abilkitar con el true
        boton2.setMnemonic('a');
        
        JButton boton3 = new JButton("Eliminar");//objeto para le boton
        boton3.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
                 int filaSeleccionada = table.getSelectedRow();//ACCION QUE ELIMINA EL REGISTRO DE LA TABLA AL DAR CUN CLICK
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
        return;
    }
    eliminarDatos(filaSeleccionada);
                
                }
        });
        boton3.setBounds(30, 460, 100, 30);//objeto para le boton
        panel.add(boton3);// para agregar al panel
        boton3.setEnabled(true);// para abilkitar con el true
        boton3.setMnemonic('a');
        
        JButton boton4 = new JButton("Salir");//objeto para le boton
        boton4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Cierra la ventana al hacer clic en el botón "Salir"
            dispose();
        }
    });
        boton4.setBounds(135, 460, 100, 30);//objeto para le boton
        panel.add(boton4);// para agregar al panel
        boton4.setEnabled(true);// para abilkitar con el true
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
    }
    public void mostrarDatos(){
        String titulos[]={"Codigo","Titulo","Apellidos","Nombres","Asignatura","Estado","Celular","Mail"};
        String registro[]=new String [9];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiantes`";// Cambiar a 'estu2' si ese es el nombre correcto de la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("estu_codigo");
            registro [1]=rs.getString("estu_titulo");
            registro [2]=rs.getString("estu_apellido");
            registro [3]=rs.getString("estu_nombre");
            registro [4]=rs.getString("estu_asignatura");
            registro [5]=rs.getString("estu_estado");
            registro [6]=rs.getString("estu_celular");
            registro [7]=rs.getString("estu_mail");
            
            modelo.addRow(registro);
        }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
    
    private void eliminarDatos(int filaSeleccionada) {
        String codigoEstudiante = table.getValueAt(filaSeleccionada, 0).toString();
        String SQL = "DELETE FROM estudiantes WHERE estu_codigo = ?";
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, codigoEstudiante);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e);
        }
        mostrarDatos();
    }
    
    private void editarRegistroEnTabla(int fila) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setValueAt(cajaTexto1.getText(), fila, 1); // Columna 1 es "Titulo"
        model.setValueAt(cajaTexto2.getText(), fila, 3); // Columna 3 es "Nombre"
        model.setValueAt(cajaTexto3.getText(), fila, 2); // Columna 2 es "Apellido"
        model.setValueAt(combo1.getSelectedItem(), fila, 4); // Columna 4 es "Asignatura"
        model.setValueAt(combo2.getSelectedItem(), fila, 5); // Columna 5 es "Estado"
        model.setValueAt(cajaTexto4.getText(), fila, 6); // Columna 6 es "Cedula"
        model.setValueAt(cajaTexto5.getText(), fila, 7); // Columna 7 es "Mail"
    }
    
}
