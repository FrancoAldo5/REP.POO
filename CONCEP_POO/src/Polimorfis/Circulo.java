package Polimorfis;
public class Circulo extends Figura {//clase que herada de la clase abstracta Figura
    public double radio;//atributo propio de la clase 

    public Circulo(double radio) {//constructor con el atributo de la clase
        this.radio = radio;
    }

    @Override//uso del override para sobre escribir el metodo de la clase padre
    double calcularArea() {//metodo abstarcto sobreescrito, para uan funcionalidad diferente
        return Math.PI * radio * radio;//retorno del procedimiento para el circulo
    }
}
