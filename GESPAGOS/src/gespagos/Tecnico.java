/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;

/**
 *
 * @author Administrador
 */
public class Tecnico extends Personal{//CLASE HIJA, HERENCIA
    int reparar;

    public Tecnico(String nombre, int edad, String genero, int ci, double sueldo,int reparar) {//CONSTRUCTOR CON HERENCIA
        super(nombre, edad, genero, ci, sueldo);//SUPER QUE IDENTIFICA LOS ATRIBUTOS DE LA CLASE PADRE
        this.reparar=reparar;
    }

    public int getReparar() {//ENTRADA Y SALIDA DE DATOS
        return reparar;
    }

    public void setReparar(int reparar) {//
        this.reparar = reparar;
    }
    
    @Override
    public double comision(){//SIBRE ESCRITURA DEL METODO ABSTRACTO
        if( reparar==1){
            double comi=sueldo*0.95;//comision del 5 porciento
            double comi2=sueldo-comi;
            double newsueldo=comi2+sueldo;
        return newsueldo;
        }else{
            return sueldo;
        }
        
        
    }
    
}
