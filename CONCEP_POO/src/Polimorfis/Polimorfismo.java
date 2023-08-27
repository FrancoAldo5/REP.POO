package Polimorfis;
public class Polimorfismo {
    public static void main(String[] args){//main principal
        Figura figura1 = new Rectangulo(5, 8);//objetos de las clase hijas
        Figura figura2 = new Circulo(3);

        mostrarArea(figura1);//uso del polimorfismo con un metodo 
        mostrarArea(figura2);//
        // TODO code application logic here
    }
    public static void mostrarArea(Figura figura) {//metodo para mostrar el area de las figuras
        System.out.println("El área es: " + figura.calcularArea());//muestra del area concatenado a un mensaje
    }
}
