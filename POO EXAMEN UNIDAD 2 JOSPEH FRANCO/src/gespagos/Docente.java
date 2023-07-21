/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;

/**
 *
 * @author Administrador
 */
public class Docente extends Personal {//CLASE HIJA, HERENCIA
    int curso;

    public Docente(String nombre, int edad, String genero, int ci, double sueldo,int curso) {//CONSTRUCTOR CON LA HERENCIA
        super(nombre, edad, genero, ci, sueldo);
        this.curso=curso;
    }

    public int getCurso() {//ENTRADAS Y SALIDAS
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    @Override
    public double comision(){//SOBRE ESCRITRA DEL METODO ABSTRACTO
        if( curso==1){
            double comi=sueldo*0.85;//comision del 15 porciento
            double comi2=sueldo-comi;
            double newsueldo=comi2+sueldo;
        return newsueldo;
        }else if(curso==2){
            double comi=sueldo*0.85;//comision del 15 porciento
            double comi2=sueldo-comi;
            double newsueldo=(comi2*2)+sueldo;
            return newsueldo;
        }{
            return sueldo;
        }
        
        
    }
    
}
