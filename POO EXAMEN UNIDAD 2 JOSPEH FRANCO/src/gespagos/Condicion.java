/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gespagos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Condicion {
    
    Scanner leer=new Scanner(System.in);
    public void cen(){
        System.out.println("Para 15%: Si el docente completo el curso indique con:  1:si");
        System.out.println("Para un doble bono: Si el docente completo el curso y la invetigacion cientifica indique con: 2:si");
        System.out.println("de lo contrario dijite un numero diferente:");
    }
    public void tec(){
        System.out.println("Si el tecnico completo todas las reparaciones indique con:  1:si  2:no");
    }
    public void ad(){
        System.out.println("Si el Administrativo completo los objetivos de la empresa indique con:  1:si  2:no");;
    }
    public void lim(){
        System.out.println("Si el Administrativo completo los objetivos de la empresa indique con:  1:si  2:no");;
    }
    
    
    public int docentee(int meta){
        
        
        meta=leer.nextInt();
        return meta;
    }
    public double meritos(){
        
        return 0;
        
    }
    public double incentivo(){
        double incen=leer.nextDouble();
        return incen;
        
    }
                  
    
}
