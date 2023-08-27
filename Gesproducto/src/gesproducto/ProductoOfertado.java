package gesproducto;

class ProductoOfertado extends Producto {//CLASE HIJA
    private int días;
    public ProductoOfertado(String nombre, double precio, int días) {//CONSTRUCTOR
        super(nombre, precio);
        this.días = días;
    }

    public int getDías() {
        return días;
    }

    public void setDías(int días) {
        this.días = días;
    }
    public String nombree(){
        
        return ""+nombre;
    }
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        if (días == 1) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.8; // Aplica un 20% de descuento
        } else if (días == 2 || días == 3) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.85; // Aplica un 15% de descuento
        } else {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.9; // Aplica un 10% de descuento
        }
    }
}