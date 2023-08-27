
package jerarquia_em;
import java.time.LocalDate;
import java.util.Scanner;
public class Jerarquia_em {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op,edad,personal,nivel;
        String nombre,departamento;
        double salario;
        
        do{
            System.out.println("--                GESTION DE JERARQUIA JF                --");
            System.out.println("------------------------------------------------------------");
            System.out.println("\n          MENU       ");
            System.out.println("1: DIRECTOR");
            System.out.println("2: OPERARIO");
            System.out.println("3: SALIR");
            op=leer.nextInt();
            
            switch(op){
                case 1:
                    
                    System.out.println("\n-------------------DIRECTOR----------------------");
                    leer.nextLine();
                    System.out.println("-INGRESAR NOOMBRES:");
                    nombre=leer.nextLine();
                    System.out.println("-INGRESAR EDAD:");
                    edad=leer.nextInt();
                    leer.nextLine(); 
                    System.out.println("INGRESE LA FECHA (EN FORMATO: AAAA-MM-DD): ");
                    String fechaIngresada = leer.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaIngresada);
                    System.out.println("-INGRESAR SALARIO ANUAL:");
                    salario=leer.nextDouble();
                    leer.nextLine();
                    System.out.println("INGRESAR EL DEPARTAMENTO AL QUE PERTENECE");
                    departamento=leer.nextLine();
                    System.out.println("-INGRESAR EL PERSONAL ACARGO");
                    personal=leer.nextInt();
                    System.out.println("------------------------------------------------");
                    System.out.println("\n");
                    Director director = new Director(nombre, edad, fecha, salario, departamento, personal);
                    System.out.println("Salario del director antes de incentivar: " + director.getSalario());
                    director.incentivar();
                    System.out.println("Salario del director después de incentivar: " + director.getSalario());
                    break;
                case 2:
                    System.out.println("\n-------------------OPERARIO----------------------");
                    leer.nextLine();
                    System.out.println("-INGRESAR NOOMBRES:");
                    nombre=leer.nextLine();
                    System.out.println("-INGRESAR EDAD:");
                    edad=leer.nextInt();
                    leer.nextLine(); 
                    System.out.println("INGRESE LA FECHA (EN FORMATO: AAAA-MM-DD): ");
                    String fechaingre = leer.nextLine();
                    LocalDate fecha2 = LocalDate.parse(fechaingre);
                    System.out.println("-INGRESAR SALARIO ANUAL:");
                    salario=leer.nextDouble();
                    System.out.println("-INGRESAR NIVEL");
                    nivel=leer.nextInt();
                    System.out.println("\n----------------------------INFORMACIÓN--------------------------------");
                    Operario operario = new Operario(nombre, edad, fecha2, salario, nivel);
                    System.out.println("SALARIO DEL OPERARIO:: " + operario.getSalario());
                    operario.incentivar();
                    System.out.println("SALARIO DEL OPERARIO LUEGO DE INCENTIVAR: " + operario.getSalario());
                    System.out.println("----------------------------ACTUALIZACION DE NIVEL---------------------");
                    operario.actnivel();
                    System.out.println("NIVEL DEL OPERARIO LUEGO DE INCENTIVAR: " + operario.getNivel());
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("\n");
                    
            }
        }while(op!=3);
        
    }
    
}
