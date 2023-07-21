
package gespagos;

import java.util.Scanner;

public class GESPAGOS {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        String nombre;
        int edad;
        String genero;
        int ci;
        double sueldo;
        int meta = 0;
        
        
        do{
            System.out.println("            GESTION DE PAGOS             ");
            System.out.println("\nSELECCIONE EL TIPO DE PERSONAL DISPONIBLE:");
            
            System.out.println("\n1:DOCENTE");
            System.out.println("2:TECNICO");
            System.out.println("3:ADMINISTRATIVO");
            System.out.println("4:LIMPIEZA");
            System.out.println("5:SALIR");
            op=leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingresar nombres:");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Ingresar edad:");
                    edad=leer.nextInt();
                    System.out.println("Ingresar genero");
                    leer.nextLine();
                    genero=leer.nextLine();
                    System.out.println("Ingresar cedula de identidad:");
                    ci=leer.nextInt();
                    System.out.println("Ingrese el sueldo");
                    sueldo=leer.nextDouble();
                    System.out.println("-----------COMISION");
                    Condicion con=new Condicion();
                    con.cen();
                    
                    Docente docente=new Docente(nombre, edad, genero, ci,sueldo,con.docentee(meta));
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("------------DOCENTE------------------------");
                    System.out.println("NOMBRES:"+nombre);
                    System.out.println("CI:"+ci);
                    System.out.println("        PAGO       ");
                    System.out.println("SUELDO NORMAL:"+docente.pago()+"$");
                    System.out.println("SUELDO CON COMISION%  :"+docente.comision()+"$");
                    System.out.println("ingrese incentivo");
                    double total=docente.comision()+con.incentivo();
                    System.out.println("total:"+total);
                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    
                    System.out.println("Ingresar nombres:");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Ingresar edad:");
                    edad=leer.nextInt();
                    System.out.println("Ingresar genero");
                    leer.nextLine();
                    genero=leer.nextLine();
                    System.out.println("Ingresar cedula de identidad:");
                    ci=leer.nextInt();
                    System.out.println("Ingrese el sueldo");
                    sueldo=leer.nextDouble();
                    System.out.println("-----------COMISION");
                    Condicion co=new Condicion();
                    co.tec();
                    
                    Tecnico tecnico=new Tecnico(nombre, edad, genero, ci,sueldo,co.docentee(meta));
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("------------TECNICO------------------------");
                    System.out.println("NOMBRES:"+nombre);
                    System.out.println("CI:"+ci);
                    System.out.println("        PAGO       ");
                    System.out.println("SUELDO NORMAL:"+tecnico.pago()+"$");
                    System.out.println("SUELDO CON COMISION 5%  :"+tecnico.comision()+"$");
                    double tota3=tecnico.comision()+co.incentivo();
                    System.out.println("total:"+tota3);
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ingresar nombres:");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Ingresar edad:");
                    edad=leer.nextInt();
                    System.out.println("Ingresar genero");
                    leer.nextLine();
                    genero=leer.nextLine();
                    System.out.println("Ingresar cedula de identidad:");
                    ci=leer.nextInt();
                    System.out.println("Ingrese el sueldo");
                    sueldo=leer.nextDouble();
                    System.out.println("-----------COMISION");
                    System.out.println("Si el Administrativo completo los objetivos de la empresa indique con:  1:si");
                    System.out.println("Si el administra tivo realizo objetivos y orden en la empresa infque con 2:si");
                    Condicion c3=new Condicion();
                   
                    Administrativo admin=new Administrativo(nombre, edad, genero, ci,sueldo,c3.docentee(meta));
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("------------ADMINISTRATIVO------------------------");
                    System.out.println("NOMBRES:"+nombre);
                    System.out.println("CI:"+ci);
                    System.out.println("        PAGO       ");
                    System.out.println("SUELDO NORMAL:"+admin.pago()+"$");
                    System.out.println("SUELDO CON COMISION %  :"+admin.comision()+"$");
                    double total1;
                    total1 = admin.comision()+c3.incentivo();
                    System.out.println("total:"+total1);
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    System.out.println("Ingresar nombres:");
                    leer.nextLine();
                    nombre=leer.nextLine();
                    System.out.println("Ingresar edad:");
                    edad=leer.nextInt();
                    System.out.println("Ingresar genero");
                    leer.nextLine();
                    genero=leer.nextLine();
                    System.out.println("Ingresar cedula de identidad:");
                    ci=leer.nextInt();
                    System.out.println("Ingrese el sueldo");
                    sueldo=leer.nextDouble();
                    System.out.println("-----------COMISION");
                    System.out.println("Si el Administrativo completo los objetivos de la empresa indique con:  1:si");
                    System.out.println("Si el administra tivo realizo objetivos y orden en la empresa infque con 2:si");
                    System.out.println("De lo contrario otro numero:");
                    Condicion c=new Condicion();
           
                    Limpieza limpieza=new Limpieza(nombre, edad, genero, ci,sueldo,c.docentee(meta));
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("------------LIMPIEZA------------------------");
                    System.out.println("NOMBRES:"+nombre);
                    System.out.println("CI:"+ci);
                    System.out.println("        PAGO       ");
                    System.out.println("SUELDO NORMAL:"+limpieza.pago()+"$");
                    System.out.println("SUELDO CON COMISION 20%  :"+limpieza.comision()+"$");
                    double to;
                    to = limpieza.comision()+c.incentivo();
                    System.out.println("total:"+to);
                    System.out.println("--------------------------------------------");
                    break;
                case 5:
                    break;
            }




            
        }while(5!=op);
       
    }
    
}
