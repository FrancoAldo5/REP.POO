package gesproducto;
import java.util.Scanner;
public class Gesproducto {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String namestan1,namestan2,nameofer1,nameofer2,nameofer3;//VARIABLES A USAR
        double valstan1,valstan2,valofer1,valofer2,valofer3;
        int diaofer1,diaofer2,diaofer3;
        int u1;
        int u2,u3,u4,u5;
        System.out.println("            SISTEMA DE GESTION DE PRODUCTOS                  ");//INGRESO DE DATOS DE LOS PRODUCTOS
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el nombre del primer producto estandar");
        namestan1=leer.nextLine();
        System.out.println("Ingrese el valor del primer producto estandar");
        valstan1=leer.nextDouble();
        System.out.println("Cantidad:");
        u1=leer.nextInt();
        System.out.println("----------------------------------------------------");
        leer.nextLine();
        System.out.println("Ingrese el nombre del segundo producto estandar");
        namestan2=leer.nextLine();
        System.out.println("Ingrese el valor del segundo producto estandar");
        valstan2=leer.nextDouble();
        System.out.println("Cantidad:");
        u2=leer.nextInt();
        System.out.println("----------------------------------------------------");
        System.out.println("");
        System.out.println("--------------PRODUCTOS OFERTADOS--------------------");//INGRESO DE DATOS DE LOS OFERTADOS
        leer.nextLine();
        System.out.println("1: Ingrese el nombre del primer producto ofertado");
        nameofer1=leer.nextLine();
        System.out.println("1: Ingrese el valor del primer producto ofertado");
        valofer1=leer.nextDouble();
        System.out.println("Cantidad:");
        u3=leer.nextInt();
        System.out.println("1: Ingrese cuantos dias de oferta quedan restantes");
        diaofer1=leer.nextInt();
        System.out.println("--");
        System.out.println("2: Ingrese el nombre del segundo producto ofertado");
        leer.nextLine();
        nameofer2=leer.nextLine();
        System.out.println("2: Ingrese el valor del segundo producto ofertado");
        valofer2=leer.nextDouble();
        System.out.println("Cantidad:");
        u4=leer.nextInt();
        System.out.println("2: Ingrese cuantos dias de oferta quedan restantes al producto");
        diaofer2=leer.nextInt();
        System.out.println("--");
        System.out.println("3: Ingrese el nombre del tercer producto ofertado");
        leer.nextLine();
        nameofer3=leer.nextLine();
        System.out.println("3: Ingrese el valor del tercer producto ofertado");
        valofer3=leer.nextDouble();
        System.out.println("Cantidad:");
        u5=leer.nextInt();
        System.out.println("3: Ingrese cuantos dias de oferta quedan restantes al producto");
        diaofer3=leer.nextInt();
        System.out.println("-------------------------------------------------------");
        ProductoOfertado productoOfertado1 = new ProductoOfertado(nameofer1, valofer1, diaofer1);//LLAMADO A LAS CLASES OFETADOS
        ProductoOfertado productoOfertado2 = new ProductoOfertado(nameofer2, valofer2, diaofer2);
        ProductoOfertado productoOfertado3 = new ProductoOfertado(nameofer3, valofer3, diaofer3);
        ProductoEstándar productoEstándar1 = new ProductoEstándar(namestan1, valstan1, "Sec A");//LLAMADAO A LAS CLASES DE ESTANDAR CON SUS RESPECTIVOS 
        ProductoEstándar productoEstándar2 = new ProductoEstándar(namestan2, valstan2, "Sec  B");//PARAMETRO
        double totalPedido = productoEstándar1.obtenerPrecioPedido(u1)//METODOS DE CALCULO DEL VALOR
                + productoEstándar2.obtenerPrecioPedido(u2)
                + productoOfertado1.obtenerPrecioPedido(u3)
                + productoOfertado2.obtenerPrecioPedido(u4)
                + productoOfertado3.obtenerPrecioPedido(u5);
        System.out.println("--------------------------------------------------------");//MUESTRA DE DATOS
        System.out.println("Producto 1:"  +productoEstándar1.nombree()+":"+productoEstándar1.obtenerPrecioPedido(u1));
        System.out.println("Producto 2:"  +productoEstándar2.nombree()+":"+productoEstándar2.obtenerPrecioPedido(u2));
        System.out.println("Producto 3:"  +productoOfertado1.nombree()+":"+productoOfertado1.obtenerPrecioPedido(u3));
        System.out.println("Producto 4:"  +productoOfertado2.nombree()+":"+productoOfertado2.obtenerPrecioPedido(u4));
        System.out.println("Producto 5:"  +productoOfertado3.nombree()+":"+productoOfertado3.obtenerPrecioPedido(u5));
        System.out.println("\nEl valor total de los productos es de: $" + totalPedido);//VALOR FINAL
        System.out.println("---------------------------------------------------------");
    }
    
}
