package Polimorfis;
public class Rectangulo extends Figura {//clase hija que hereda de la clase cadre figura
    //atributos propios de la clase rectangulo
    public double base;
    public double altura;

    public Rectangulo(double base, double altura){//constructor de la clase 
        this.base = base;
        this.altura = altura;
    }

    @Override//uso del override para la sobreescitura del metodo heredado
    double calcularArea() {//metado ya sobreescrito
        return base * altura;//retorno del valor
    }
}

