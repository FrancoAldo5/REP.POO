package poo_l1_metodos;
import javax.swing.JOptionPane;
public class Ope {
    int n1;
    int n2;
    int suma;
    int resta;
    int multi;
    int divi;

    public void capturarnumeros(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    }

    public void sumar(){
        suma =n1+n2;
    }
    
    public void resultados(){
        System.out.println("el resultado de la suma es:"+suma);
    }
    
    
    
    
    
    public int sumar(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
    public void resultados(int suma){
        System.out.println("el resultado de toda la suma es:"+suma);
    }
}