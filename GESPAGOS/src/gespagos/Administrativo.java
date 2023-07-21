/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;

/**
 *
 * @author Administrador
 */
public class Administrativo extends Personal{//CLASE HIJA
    int objetivos;

    public Administrativo(String nombre, int edad, String genero, int ci, double sueldo,int objetivos) {
        super(nombre, edad, genero, ci, sueldo);
        this.objetivos=objetivos;
    }

    public int getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(int objetivos) {
        this.objetivos = objetivos;
    }
    
    @Override
    public double comision(){
        if( objetivos==1){
            double comi=sueldo*0.8;//comision del 20 porciento
            double comi2=sueldo-comi;
            double newsueldo=comi2+sueldo;
        return newsueldo;
        }else{
            return sueldo;
        }
        
        
    }
    
}
