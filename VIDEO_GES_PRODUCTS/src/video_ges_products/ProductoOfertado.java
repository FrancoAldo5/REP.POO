/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video_ges_products;

/**
 *
 * @author josep
 */
public class ProductoOfertado extends Producto{
    int dias;
    
    public ProductoOfertado(String nombre, double precio,int dias) {
        super(nombre, precio);
        this.dias=dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String nombree(){
        return ""+nombre;
    }
    
    @Override
    public double obtenerPrecioPedido(int unidadesPedidas){
        if (dias==1){
            return super.obtenerPrecioPedido(unidadesPedidas)*0.8;
        }else if(dias==2||dias==3){
            return super.obtenerPrecioPedido(unidadesPedidas)*0.85;
            
        }else{
            return super.obtenerPrecioPedido(unidadesPedidas)*0.9;
        }
    }
    
}
