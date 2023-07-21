/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;


public abstract class Personal {//CLASE ABSTRACTA
    String nombre;
    int edad;
    String genero;
    int ci;
    double sueldo;

    public Personal(String nombre, int edad, String genero, int ci, double sueldo) {//CONSTRUCTOR DE LA CLASE PADRE
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ci = ci;
        this.sueldo = sueldo;
    }

    public String getNombre() {//GETTERS Y SETTERS PARA ENTRADA Y SALIDA DE DATOS
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double pago(){
        
        return sueldo;
        
    }
    public double comision(){//METODO ABSTRACTO
        double comi=sueldo*0.9;//comision del 10 porciento
            double comi2=sueldo-comi;
            double newsueldo=comi2+sueldo;
        return newsueldo;
        
    }
        
 }

