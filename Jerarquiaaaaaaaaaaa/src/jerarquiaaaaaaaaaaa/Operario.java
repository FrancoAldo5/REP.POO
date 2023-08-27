/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarquiaaaaaaaaaaa;

import java.time.LocalDate;

/**
 *
 * @author josep
 */
public class Operario extends Empleado {
    int nivel;

    public Operario(String nombre, int edad, LocalDate fechaingreso, double salario,int nivel) {
        super(nombre, edad, fechaingreso, salario);
        this.nivel=nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    

    
    
    @Override
    public void incentivar() {
       if(getEdad()>30 && getNivel()>2){
           double newsalario=getSalario()+(2*bono);
           setSalario(newsalario);
       }else if(getEdad()>30||getNivel()>2){
           double newsalario=getSalario()+bono;
           setSalario(newsalario);
       }
    }
    
    public void actnivel(){
        if(nivel<5 && getFechaingreso().plusYears(2).isBefore(LocalDate.now())){
            nivel++;
        }
    }
    
    
}
