/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;

/**
 *
 * @author Administrador
 */
public class Limpieza extends Personal{
    int horas;

    public Limpieza(String nombre, int edad, String genero, int ci, double sueldo,int horas) {
        super(nombre, edad, genero, ci, sueldo);
        this.horas=horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
        @Override
    public double comision(){
        if( horas==1){
            double comi=sueldo*0.8;//comision del 20 porciento
            double comi2=sueldo-comi;
            double newsueldo=comi2+sueldo;
        return newsueldo;
        }else{
            return sueldo;
        }
        
        
    }
    
    
    
}
