/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.Conexion;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Registro_2 extends JFrame{
    JTextField cajaTexto1;
    JTextField cajaTexto2;
    JTextField cajaTexto3;
    JTextField cajaTexto4;
    JTextField cajaTexto5;
    JComboBox<String> combo1;
    JComboBox<String> combo2;
    JTable table;
 Conexion cc=new Conexion();
Connection con=(Connection) cc.conexion();// heredando del jframe
    
     public JPanel panel;//variable en general
     public Registro_2() {
        this.setSize(1000, 1000);//tamaño para la ventana
        setTitle("Estudiantes");// nombre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ejecucion al cerrar la ventana
        setLocationRelativeTo(null);//para que centre la ventana al abrir
        iniciarComponentes();
        ColocarCajatexto();// para colocar las cajas de texto
    }
    
     
        public void iniciarComponentes() {// metodo para agregar las cosas al panel
            colocarPanel();
           colocarEtiqueta();
           colocarBotones();
           tabla();
           colpcarComobox();
       }
     
     public void colocarPanel() {//colocando el panel
        panel = new JPanel();
        panel.setBackground(Color.blue);//color para el panel
        this.getContentPane().add(panel);//agragar el panel
    }
     public void colocarEtiqueta(){//metodo para los labels
         JLabel label = new JLabel("ESTUDIANTES", SwingConstants.CENTER);//objeto para el label
        panel.add(label);// se agrega al panel
        panel.setLayout(null);
        label.setBounds(100, 10, 100, 25);//dimensiones
        label.setForeground(Color.WHITE);//color de la letra 
        label.setBackground(Color.BLACK);// color del fondo
        label.setOpaque(true);
        
        JLabel label1 = new JLabel("Codigo:");//objeto para el label
        panel.add(label1);// se agrega al panel
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        label1.setFont(new Font("Arial", Font.PLAIN, 15));// tipo de letra y tamaño
        label1.setBounds(10, 50, 100, 25);//dimensiones
        
        JLabel label2 = new JLabel("Cedula:");//objeto para el label
        panel.add(label2);// se agrega al panel
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        label2.setFont(new Font("Arial", Font.PLAIN, 15));// tipo de letra y tamaño
        label2.setBounds(10, 90, 100, 25);//dimensiones
        
        
        JLabel label3 = new JLabel("Apellido:");//objeto para el label
        panel.add(label3);
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setBounds(10, 130, 100, 25);
        
        //lo mismo para todosssssssssssssssss
        
        JLabel label4 = new JLabel("Nombre:");
        panel.add(label4);
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Arial", Font.PLAIN, 15));
        label4.setBounds(10, 170, 100, 25);
        
        JLabel label5 = new JLabel("Mail:");
        panel.add(label5);
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        label5.setFont(new Font("Arial", Font.PLAIN, 15));
        label5.setBounds(10, 210, 100, 25);
        
        JLabel label6 = new JLabel("Telefono:");
        panel.add(label6);
        label6.setHorizontalAlignment(SwingConstants.LEFT);
        label6.setFont(new Font("Arial", Font.PLAIN, 15));
        label6.setBounds(10, 250, 100, 25);
        
        JLabel label7 = new JLabel("Direccion:");
        panel.add(label7);
        label7.setHorizontalAlignment(SwingConstants.LEFT);
        label7.setFont(new Font("Arial", Font.PLAIN, 15));
        label7.setBounds(10, 290, 100, 25);
        
        JLabel label8 = new JLabel("Materia:");
        panel.add(label8);
        label8.setHorizontalAlignment(SwingConstants.LEFT);
        label8.setFont(new Font("Arial", Font.PLAIN, 15));
        label8.setBounds(10, 330, 100, 25);
        
        JLabel label9 = new JLabel("Estado:");
        panel.add(label9);
        label9.setHorizontalAlignment(SwingConstants.LEFT);
        label9.setFont(new Font("Arial", Font.PLAIN, 15));
        label9.setBounds(10, 370, 100, 25);
        
        
        
     }
     
     public void colocarBotones(){//metodo para los botones
        JButton boton = new JButton("Nuevo");//objeto para le boton
        boton.setBounds(30, 420, 70, 30);// dimensiones del boton
        panel.add(boton);// para agregar al panel
        boton.setEnabled(true);// para abilkitar con el true
        boton.setMnemonic('a');
        
        JButton boton1 = new JButton("Guardar");//objeto para le boton
        boton1.setBounds(120, 420, 100, 30);//objeto para le boton
        panel.add(boton1);// para agregar al panel
        boton1.setEnabled(true);// para abilkitar con el true
        boton1.setMnemonic('a');
        
        JButton boton2 = new JButton("Editar");//objeto para le boton
        boton2.setBounds(235, 420, 80, 30);//objeto para le boton
        panel.add(boton2);// para agregar al panel
        boton2.setEnabled(true);// para abilkitar con el true
        boton2.setMnemonic('a');
        
        JButton boton3 = new JButton("Eliminar");//objeto para le boton
        boton3.setBounds(30, 460, 100, 30);//objeto para le boton
        panel.add(boton3);// para agregar al panel
        boton3.setEnabled(true);// para abilkitar con el true
        boton3.setMnemonic('a');
        
        JButton boton4 = new JButton("Salir");//objeto para le boton
        boton4.setBounds(135, 460, 100, 30);//objeto para le boton
        panel.add(boton4);// para agregar al panel
        boton4.setEnabled(true);// para abilkitar con el true
        boton4.setMnemonic('a');
        
        //JButton boton5 = new JButton();
        //ImageIcon icon = new ImageIcon("form.png");
        //boton5 .setBounds(170, 460, 50, 50);
        //panel.add(boton5 );
        //boton5 .setIcon(new ImageIcon(icon.getImage().getScaledInstance(boton5 .getWidth(), boton5 .getHeight(), Image.SCALE_SMOOTH)));
     }
     
     public void ColocarCajatexto(){//metodo para los textt field
        JTextField cajaTexto1= new JTextField();//objeto
        cajaTexto1.setBounds(100,50,250,25);// dimensiones
        panel.add(cajaTexto1);
        cajaTexto1.setText("");//para que este vacio
        System.out.println("El texto de la caja es:"+cajaTexto1.getText());//
        
        JTextField cajaTexto2= new JTextField();
        cajaTexto2.setBounds(100,90,250,25);
        panel.add(cajaTexto2);
        cajaTexto2.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto2.getText());
        
        JTextField cajaTexto3= new JTextField();
        cajaTexto3.setBounds(100,130,250,25);
        panel.add(cajaTexto3);
        cajaTexto3.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto3.getText());
        
        JTextField cajaTexto4= new JTextField();
        cajaTexto4.setBounds(100,170,250,25);
        panel.add(cajaTexto4);
        cajaTexto4.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto4.getText());
        
        JTextField cajaTexto5= new JTextField();
        cajaTexto5.setBounds(100,210,250,25);
        panel.add(cajaTexto5);
        cajaTexto5.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto5.getText());
        
        JTextField cajaTexto6= new JTextField();
        cajaTexto6.setBounds(100,250,250,25);
        panel.add(cajaTexto6);
        cajaTexto6.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto6.getText());
        
        JTextField cajaTexto7= new JTextField();
        cajaTexto7.setBounds(100,290,250,25);
        panel.add(cajaTexto7);
        cajaTexto7.setText("");
        System.out.println("El texto de la caja es:"+cajaTexto7.getText());

        

        
        
        // Agrupar los botones de radio para que solo uno pueda ser seleccionado a la vez
        
    }
    
     public void tabla(){
        String[] columNames= {"Codigo","Cedula","Apellido","Nombre","Mail","Telefono","Dirección","Materia","Estado"};
        DefaultTableModel tableModel= new DefaultTableModel(columNames,0);
        
        JTable table= new JTable(tableModel);
        JScrollPane scrollPane= new JScrollPane(table);
        scrollPane.setBounds(400, 50, 600, 250);
        panel.add(scrollPane);
     }
     
     public void colpcarComobox(){
         JComboBox<String> combo1 = new JComboBox<>();
        combo1.setBounds(100, 320, 150, 25);
        panel.add(combo1);
        combo1.addItem("Computo");
        combo1.addItem("Edo");
        combo1.addItem("Vectorial");
        combo1.addItem("Poo");
        combo1.addItem("Fisica");
        combo1.addActionListener((ActionEvent e) -> {
            JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
        });
        panel.add(combo1);
        JRadioButton rb1 = new JRadioButton("Activo"); 
        JRadioButton rb2 = new JRadioButton("Inactivo"); 
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        
        rb1.setBounds(100, 350, 140, 20);
        rb2.setBounds(100, 380, 140, 20);
        
        panel.setLayout(null); // Usamos un diseño nulo para poder posicionar los componentes manualmente
        
        panel.add(rb1);
        panel.add(rb2);
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
     
     private void editarRegistroEnTabla(int fila) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setValueAt(cajaTexto1.getText(), fila, 1); // Columna 1 es "Titulo"
        model.setValueAt(cajaTexto2.getText(), fila, 3); // Columna 3 es "Nombre"
        model.setValueAt(cajaTexto3.getText(), fila, 2); // Columna 2 es "Apellido"
        model.setValueAt(combo1.getSelectedItem(), fila, 4); // Columna 4 es "Asignatura"
        model.setValueAt(combo2.getSelectedItem(), fila, 5); // Columna 5 es "Estado"
        model.setValueAt(cajaTexto4.getText(), fila, 6); // Columna 6 es "Cedula"
        model.setValueAt(cajaTexto5.getText(), fila, 7); // Columna 7 es "Mail"
        model.setValueAt(combo2.getSelectedItem(), fila, 5); // Columna 5 es "Estado"
    }
     
     public void mostrarDatos(){
        String titulos[]={"Codigo","Cedula","Apellido","Nombre","Mail","Telefono","Direccion","Materia","Estado"};
        String registro[]=new String [10];
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `estudiante`";// Cambiar a 'estu2' si ese es el nombre correcto de la tabla
        try{
            Statement st=(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
            registro [0]=rs.getString("estu_codigo");
            registro [1]=rs.getString("estu_cedula");
            registro [2]=rs.getString("estu_apellido");
            registro [3]=rs.getString("estu_nombre");
            registro [4]=rs.getString("estu_mail");
            registro [5]=rs.getString("estu_telefono");
            registro [6]=rs.getString("estu_direccion");
            registro [7]=rs.getString("estu_materia");
            registro [8]=rs.getString("estu_estado");
            
            modelo.addRow(registro);
        }
            table.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: "+e);
        }
    }
     
     
        

}
