package Herenci;
public class Herencia{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//main principal
        Carro carro = new Carro("Toyota", "Corolla", 4);//uso del objeto de la clase
        //con los atributos constantes
        carro.mostrarInfo();//llamadoal metodo de mostrar informacion, usando la herencia
        carro.arrancar();//llamado para arrancar arrancar
        carro.conducir();//llamado al metodo conducir, que es propia de la clase hija
        carro.detener();//llamado al metodo de detener.

    }
    
}
