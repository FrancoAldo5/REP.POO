/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video_ges_products;

/**
 *
 * @author josep
 */
public class ProductoEstandar extends Producto{
    private String sección;

    public ProductoEstandar(String nombre, double precio, String sección) {//CONSTRUCTOR
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
