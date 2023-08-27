/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video.animales;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class VideoAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op,patas1,patas2,patas3,dif2=0,dif3=0;
        int mamifero1,mamifero2,mamifero3;
        String nombre1,nombre2,nombre3;
        boolean ladra,verd1,verd2,verd3,maulla;
        
        do{
            System.out.println("1:Animales");
            System.out.println("2:Perro");
            System.out.println("3:Gato");
            System.out.println("4:Salir");
            
            System.out.println("Ingrese una opcion");
            op=leer.nextInt();
            
            switch(op){
                case 1:
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del Animal");
                    nombre1=leer.nextLine();
                    
                    System.out.println("Si el animal es mamifero 1:si 2:no");
                    mamifero1=leer.nextInt();
                    if(mamifero1==1){
                        verd1=true;
                    }else{
                        verd1=false;
                    }
                    System.out.println("Ingrese el numero de patas del animal");
                    patas1=leer.nextInt();
                    
                    
                    Animales animal = new Animales(verd1,patas1,nombre1);
                    animal.nombre();
                    animal.mamifero();
                    animal.patas();
                break;
                
                case 2:
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del perro:");
                    nombre2=leer.nextLine();
                    
                    System.out.println("Indique si el perro ladra: 1:si 2:no");
                    mamifero1=leer.nextInt();
                    
                    if(dif2==1){
                        ladra=true;
                    }else{
                        ladra=false;
                    }
                    System.out.println("Si el perro es mamifero coloque: 1:si 2:no");
                    mamifero2=leer.nextInt();
                    if(mamifero2==1){
                        verd2=true;
                        
                    }else{
                        verd2=false;
                    }
                    System.out.println("Ingrese el numero de patas del perro");
                    patas2=leer.nextInt();
                    
                    
                    Perro perro = new Perro(ladra,verd2,patas2,nombre2);
                    perro.nombre();
                    perro.mamifero();
                    perro.patas();
                    perro.ladrar(ladra);
                break;
                
                case 3:
                    System.out.println("Indique si el gato maulla: 1:si 2:no");
                    mamifero1=leer.nextInt();
                    if(dif3==1){
                        maulla= true;
                    }else{
                        maulla=false;
                    }
                    
                    System.out.println("Si el gato es mamifero:  1:si 2:no");
                    mamifero3=leer.nextInt();
                    if(mamifero3==1){
                        verd3=true;
                    }else{
                        verd3=false;
                    }
                    
                    System.out.println("Ingrese el numero de patas del gato:");
                    patas3=leer.nextInt();
                    
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del gato:");
                    nombre3=leer.nextLine();
                    
                    Gato gato = new Gato(maulla,verd3,patas3,nombre3);
                    gato.nombre();
                    gato.mamifero();
                    gato.patas();
                    gato.maullar(maulla);
                    break;
            }
            
        }while(4!=op);
        
        // TODO code application logic here
    }
    
}
