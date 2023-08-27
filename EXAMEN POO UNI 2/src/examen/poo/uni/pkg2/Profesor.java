/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.poo.uni.pkg2;

/**
 *
 * @author josep
 */
public class Profesor extends Personal{
    
    String asignatura;

    public Profesor(String nombre, int edad,String asignatura) {
        super(nombre, edad);
        this.asignatura=asignatura;
    }

    

    @Override
    public void informacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
