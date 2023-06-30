/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_horarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    int op;
    int numLab, capacidad, horaCierre, numcompus, numMicrooscopios;
    int numAsig, horaAsig;
    String nombreLab, equipoLab, lugarLab, encargadoLab;
    String nombreAsig;
    String[] equipoList;
    Computo lab_computacion;
    Quimica lab_quimica;
    ArrayList<Computo> LabComputacion = new ArrayList<>();
    ArrayList<Quimica> LabQuimica = new ArrayList<>();
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24, null));

    public void menu() {
        do {
            System.out.println("---------------MENU-----------");
            System.out.println("1. Agregar los laboratorios");
            System.out.println("2. Asignar horarios");
            System.out.println("3. Informacion de laboratorios");
            System.out.println("------------------------------");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    agregarLabs();
                    break;
                case 2:
                    agregarAsignatura();
                    break;
                case 3:
                    informacionLabs();
                    break;
            }
        } while (op != 4);
    }

    public void agregarLabs() {
        System.out.println("---------------------------Agregar Laboratorios------------------------");
        System.out.println("1. Laboratorio de Computacion");
        System.out.println("2. Laboratorio de Quimica");
        System.out.println("..............................................................................");
        op = in.nextInt();
        System.out.println("¿Cuantos laboratorios va a ingresar?");
        numLab = in.nextInt();
        in.nextLine();
        switch (op) {
            case 1:
                for (int i = 0; i < numLab; i++) {
                    System.out.println(" ");
                    System.out.println("====LAB " + (i + 1) + "====");
                    System.out.println("Ingresa el nombre del laboratorio");
                    nombreLab = in.nextLine();
                    System.out.println("Ingresa la capacidad del laboratorio");
                    capacidad = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa los equipos del laboratorio (separando con una coma)");
                    equipoLab = in.nextLine();
                    equipoList = equipoLab.split(", ");
                    System.out.println("Ingrese la hora a la que cierra el laboratorio");
                    horaCierre = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del encargado de este laboratorio");
                    encargadoLab = in.nextLine();
                    System.out.println("Ingrese el lugar donde se ubica el laboratorio");
                    lugarLab = in.nextLine();
                    System.out.println("Ingrese el numero de computadoras disponibles");
                    numcompus = in.nextInt();
                    in.nextLine();
                    LabComputacion.add(new Computo(nombreLab, capacidad, equipoList, horaCierre, horario, encargadoLab, lugarLab, numcompus));
                }
                break;
            case 2:
                for (int i = 0; i < numLab; i++) {
                    System.out.println("====LAB " + (i + 1) + "====");
                    System.out.println("Ingresa el nombre del laboratorio");
                    nombreLab = in.nextLine();
                    System.out.println("Ingresa la capacidad del laboratorio");
                    capacidad = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa los equipos del laboratorio (separando con una coma)");
                    equipoLab = in.nextLine();
                    equipoList= equipoLab.split(", ");
                    System.out.println("Ingrese la hora a la que cierra el laboratorio");
                    horaCierre = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del encargado de este laboratorio");
                    encargadoLab = in.nextLine();
                    System.out.println("Ingrese el lugar donde se ubica el laboratorio");
                    lugarLab = in.nextLine();
                    System.out.println("Ingrese el numero de microoscopios disponibles");
                    numMicrooscopios = in.nextInt();
                    in.nextLine();
                    LabQuimica.add(new Quimica(nombreLab, capacidad, equipoList, horaCierre, horario, encargadoLab, lugarLab, numMicrooscopios));
                }
                break;
        }
    }

    public void agregarAsignatura() {
        System.out.println("¿Cuantas asignaturas va a ingresar?");
        numAsig = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numAsig; i++) {
            System.out.println("====ASIGNATURA " + (i + 1) + "====");
            System.out.println("Nombre: ");
            nombreAsig = in.nextLine();
            System.out.println("Escoja el laboratorio");
            System.out.println("1. Computacion");
            System.out.println("2. Quimica");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el numero del laboratorio: ");
                    numLab = in.nextInt();
                    in.nextLine();
                    if (LabComputacion.size() >= numLab) {
                        lab_computacion = LabComputacion.get(numLab - 1);
                        System.out.println("Ingrese la hora que solicitara este laboratorio");
                        horaAsig = in.nextInt();
                        in.nextLine();
                        if (lab_computacion.disponibilidad(horaAsig, nombreAsig)) {
                            LabComputacion.set(numLab - 1, lab_computacion);
                            System.out.println("Ingresado con exito");
                        } else {
                            System.out.println("Hora ocupada o Laboratorio cerrado");
                        }
                    } else {
                        System.out.println("Laboratorio no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero del laboratorio: ");
                    numLab = in.nextInt();
                    in.nextLine();
                    if (LabQuimica.size() >= numLab) {
                        lab_quimica = LabQuimica.get(numLab - 1);
                        System.out.println("Ingrese la hora que solicitara este laboratorio");
                        horaAsig = in.nextInt();
                        in.nextLine();
                        if (lab_quimica.disponibilidad(horaAsig, nombreAsig)) {
                            LabQuimica.set(numLab - 1, lab_quimica);
                            System.out.println("Ingresado con exito");
                        } else {
                            System.out.println("Hora ocupada o Laboratorio cerrado");
                        }
                    } else {
                        System.out.println("Laboratorio no encontrado");
                    }
                    break;
            }
        }
    }

    public void informacionLabs() {
        int count = 0;
        System.out.println("---------------------------Laboratorios de computacion----------------------------------");
        for (Computo laboratorio : LabComputacion) {
            System.out.println("---LAB " + (count++) + "-----");
            System.out.println("Nombre:         " + laboratorio.nombreLaboratorio);
            System.out.println("Capacidad:      " + laboratorio.capacidad);
                        System.out.println("Equipos:      ");
            for (String e : laboratorio.equipoList) {
                System.out.println("* " + e);
            }
            System.out.println("Hora de cerrar: " + laboratorio.horaCierre);
            System.out.println("Encargado:      " + laboratorio.encargado);
            System.out.println("Lugar:          " + laboratorio.lugar);
            System.out.println("Num. computadoras: " + laboratorio.numcompus);
        }
        count = 0;
        System.out.println("------Laboratorios de quimica------");
        for (Quimica laboratorio : LabQuimica) {
            System.out.println("-----LAB " + (count++) + "==");
            System.out.println("Nombre:         " + laboratorio.nombreLaboratorio);
            System.out.println("Capacidad:      " + laboratorio.capacidad);
            System.out.println("Equipos: ");
            for (String e : laboratorio.equipoList) {
                System.out.println("* " + e);
            }
            System.out.println("Hora de cerrar: " + laboratorio.horaCierre);
            System.out.println("Encargado:      " + laboratorio.encargado);
            System.out.println("Lugar:          " + laboratorio.lugar);
            System.out.println("Num. computadoras: " + laboratorio.numMicrooscopios);
        }
    }
}


