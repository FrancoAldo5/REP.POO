package gesproducto;

class Producto {//clase padre
    String nombre;//atributos de la clase padre
    private double precio;

    public Producto(String nombre, double precio) {//constructor de la clase padre
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {//GGETTERS DE LOS ATRIBUTOS
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {//SETTERS DE LOS ATRIBUTOS
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerPrecioPedido(int unidadesPedidas) {//METODO DE OBTENER PRECIO
        return unidadesPedidas * precio;
    }
}

