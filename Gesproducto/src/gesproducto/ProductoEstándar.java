package gesproducto;
class ProductoEstándar extends Producto {//CLASE HIJA
    private String sección;
    public ProductoEstándar(String nombre, double precio, String sección) {//CONSTRUCTOR
        super(nombre, precio);
        this.sección = sección;
    }

    public String getSección() {
        return sección;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }
    public String nombree(){
        
        return ""+nombre;
    }

    @Override
    public double obtenerPrecioPedido(int unidadesPedidas) {
        if (unidadesPedidas >= 5) {
            return super.obtenerPrecioPedido(unidadesPedidas) * 0.9; // Aplica un 10% de descuento
        } else {
            return super.obtenerPrecioPedido(unidadesPedidas);
        }
    }
}