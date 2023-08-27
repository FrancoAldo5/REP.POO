/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video_ges_products;

/**
 *
 * @author josep
 */
public class VIDEO_GES_PRODUCTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductoOfertado productoOfertado1=new ProductoOfertado("Ariel",3,2);
        ProductoOfertado productoOfertado2=new ProductoOfertado("JABON",4,8);
        ProductoOfertado productoOfertado3=new ProductoOfertado("ARROZ",12,4);
        
        ProductoEstandar productoEstandar1=new ProductoEstandar("DORITO",1,"SECCION A");
        ProductoEstandar productoEstandar2=new ProductoEstandar("COCA COLA",2,"SECCION B");
        
        
        
        double totalPedido=productoEstandar1.obtenerPrecioPedido(5)
                +productoEstandar2.obtenerPrecioPedido(3)+productoOfertado1.obtenerPrecioPedido(1)+productoOfertado2.obtenerPrecioPedido(3)+productoOfertado3.obtenerPrecioPedido(2);
        
        System.out.println("\n El valor total es:$"+totalPedido);
        
        // TODO code application logic here
    }
    
}
