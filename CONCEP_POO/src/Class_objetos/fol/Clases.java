package Class_objetos.fol;

public class Clases {

    public static void main(String[] args) {
        // Objetos de la clase de Estudiantes
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";//definiendo variables para el metodo
        estudiante1.edad = 20;

        // Creación del otro objeto de la clase Estudiante
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "María";
        estudiante2.edad = 22;

        // Muestra de la información de los estudiantes
        System.out.println("Información del primer estudiante:");
        estudiante1.mostrarInformacion();//LLamado del metodo mediante el objeto

        System.out.println("\nInformación del segundo estudiante:");
        estudiante2.mostrarInformacion();//LLamado del metodo mediante el objeto
        // TODO code application logic here
    }
    
}
