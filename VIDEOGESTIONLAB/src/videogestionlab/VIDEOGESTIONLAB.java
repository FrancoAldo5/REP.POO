/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videogestionlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author josep
 */
public class VIDEOGESTIONLAB {

    /**
     * @param args the command line arguments
     */
private static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
        List<Laboratorio> laboratorios = agregarLaboratorios();
        List<Asignatura> asignaturas = agregarAsignaturas(laboratorios);

        mostrarInformacionLaboratorios(laboratorios);
    }

    private static List<Laboratorio> agregarLaboratorios() {
        List<Laboratorio> laboratorios = new ArrayList<>();

        System.out.println("--               GESTION DE LABORATORIOS           -- ");
        System.out.println("-----------------------------------------------");
        
        
        System.out.print("-Ingrese el número de laboratorios que desea agregar: ");
        int numLaboratorios = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("\nLaboratorio #" + (i + 1));
            System.out.print("-Ingrese el nombre al laboratorio: ");
            String nombre = scanner.nextLine();
            System.out.println("");

            System.out.print("-Ingrese la cantidad de equipos que habran: ");
            int numEquipos = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");

            System.out.print("-Ingrese su capacidad máxima: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");

            System.out.println("");
            List<String> equipos = new ArrayList<>();
            for (int j = 0; j < numEquipos; j++) {
                System.out.print("Ingrese el nombre del equipo #" + (j + 1) + ": ");
                String equipo = scanner.nextLine();
                equipos.add(equipo);
            }
            System.out.println("");

            System.out.print("Ingrese el tipo de espacio del laboratorio: ");
            String tipoEspacio = scanner.nextLine();

            System.out.print("Ingrese la disponibilidad horaria del laboratorio: ");
            String disponibilidad = scanner.nextLine();

            Laboratorio1 laboratorio1 = new Laboratorio1(nombre, capacidad, equipos, tipoEspacio, disponibilidad);
            laboratorios.add(laboratorio1);
            System.out.println("-----------------------------------------------");
        }

        return laboratorios;
    }

    private static List<Asignatura> agregarAsignaturas(List<Laboratorio> laboratorios) {
        List<Asignatura> asignaturas = new ArrayList<>();

        System.out.println("-----------------------------------------------");
        System.out.print("\nIngrese el número de asignaturas a agregar: ");
        int numAsignaturas = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("\nAsignatura #" + (i + 1));
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el horario de la asignatura: ");
            String horario = scanner.nextLine();

            Laboratorio laboratorioAsignado = seleccionarLaboratorio(laboratorios);
            Asignatura asignatura = new Asignatura(nombre, horario, laboratorioAsignado);
            asignaturas.add(asignatura);
            System.out.println("-----------------------------------------------");
        }

        return asignaturas;
    }

    private static Laboratorio seleccionarLaboratorio(List<Laboratorio> laboratorios) {
        System.out.println("-----------------------------------------------");
        System.out.println("\n-Seleccione el laboratorio:");
        for (int i = 0; i < laboratorios.size(); i++) {
            Laboratorio laboratorio = laboratorios.get(i);
            System.out.println((i + 1) + ". " + laboratorio.getNombre());
        }

        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("-----------------------------------------------");

        return laboratorios.get(opcion - 1);
        
    }

    private static void mostrarInformacionLaboratorios(List<Laboratorio> laboratorios) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("\n            -Información de los laboratorios:");
        
        Profesor profesor1 = new Profesor("Juan Pérez", "Informática");
        Estudiante estudiante1 = new Estudiante("María Gómez", "Biología");
        Encargado encargado1 = new Encargado("Pedro Rodríguez", "Administración");

        // Mostrar información de las personas (Profesor, Estudiante, Encargado)
        System.out.println("\nInformación de las personas:");
        System.out.println("- Profesor: " + profesor1.getNombre() + " (" + profesor1.getCarrera() + ")");
        System.out.println("- Estudiante: " + estudiante1.getNombre() + " (" + estudiante1.getCarrera() + ")");
        System.out.println("- Encargado: " + encargado1.getNombre() + " (" + encargado1.getCarrera() + ")");
        
        

        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("\n-Nombre: " + laboratorio.getNombre());
            System.out.println("-Capacidad: " + laboratorio.getCapacidad());
            System.out.println("-Equipos disponibles: " + laboratorio.getEquipos());
            System.out.println("-Tipo de espacio: " + laboratorio.getTipoEspacio());
            System.out.println("-Disponibilidad horaria: " + laboratorio.getDisponibilidad());
        }

        System.out.println("-------------------------------------------------------------------");
    }
    
}




