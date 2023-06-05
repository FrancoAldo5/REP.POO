/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_unidad_1;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Gestion1 {
    
    Scanner leer = new Scanner(System.in);
    
    public void Gestion1(){//metodo de ingreso de profesores
        int n,i;
        
        n = 2;
        
        String[] profe = new String[n];
        for (i = 0; i < n; i++) {//for de ingreso de docentes al arreglo
            System.out.println("Ingrese el docente numero: " + i+1);
            profe[i] = leer.nextLine();
        }
       
        for (i = 0; i < n; i++) {//muetsra del arreglo
            System.out.println("Profesores ingresados" + (i + 1) + ": " + profe[i]);
        }   
    }
    
    public void opcion2(){//metodo de ingreso de estudiantes
        int p2,i;
        
        p2 = 6;
        
        String[] estudiantes = new String[p2];
        for (i = 0; i < p2; i++) {//ingreso de estudiantes mediante for
            System.out.println("Ingrese el estudiante numero: " + i+1);
            estudiantes[i] = leer.nextLine();
        }
       
        for (i = 0; i < p2; i++) {//muestra de datos del arreglo
            System.out.println("Alumnos ingresados" + (i + 1) + ": " + estudiantes[i]);
        }
      
    }
    
    public void opcion3(){//metodo de ingreso de materias
        int p3,i;
        
        p3 = 4;
        
        String[] materias = new String[p3];
        for (i = 0; i < p3; i++) {//for ingreso de materias
            System.out.println("Ingrese la materia: " + i+1);
            materias[i] = leer.nextLine();
        }
       
        for (i = 0; i < p3; i++) {//for de muestra del arreglo
            System.out.println("materia ingresada" + (i + 1) + ": " + materias[i]);
        }
        
    
    }
    
    private static class opcion1 {

        public opcion1() {
            
        }
    }
    
}
