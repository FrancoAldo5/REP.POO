/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moto1;

/**
 *
 * @author josep
 */
public class MOTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto moto1=new Moto();
        System.out.println("MOTO 1 REGISTRO");
        moto1.placa="IC-753-F";
        moto1.color="negro";
        moto1.cilindraje=125;
        moto1.tipo="classic";
        moto1.marca="suzuki";
        
        
        
        
        
        System.out.println("PLACA:"+moto1.placa);
        System.out.println("COLOR:"+moto1.color);
        System.out.println("CILINDRAJE:"+moto1.cilindraje);
        System.out.println("TIPO:"+moto1.tipo);
        System.out.println("MARCA:"+moto1.marca);
        System.out.println("");
        
        
        PC pc1=new PC();
        System.out.println("PC1 REGISTRO");
        pc1.procesador="i7 10001";
        pc1.ram=8;
        pc1.tipo="laptop";
        pc1.marca="Asus";
        pc1.ssd=256;
        
        System.out.println("PROCESADOR:"+pc1.procesador);
        System.out.println("RAM:"+pc1.ram);
        System.out.println("TIPO:"+pc1.tipo);
        System.out.println("MARCA:"+pc1.marca);
        System.out.println("SSD:"+pc1.ssd);
        System.out.println("");
        
        
        
        
        JUGADOR jugador1=new JUGADOR();
        System.out.println("JUGADOR 1 REGISTRO");
        jugador1.nombre="Messi";
        jugador1.numero=30;
        jugador1.altura=1.70;
        jugador1.pais="Argentina";
        jugador1.equipo="PSG";
        
        System.out.println("Nombre:"+jugador1.nombre);
        System.out.println("NUMERO:"+jugador1.numero);
        System.out.println("ALTURA:"+jugador1.altura);
        System.out.println("PAIS:"+jugador1.pais);
        System.out.println("EQUIPO:"+jugador1.equipo);
        // TODO code application logic here
    }
    
}
