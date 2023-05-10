/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionales_jf;

/**
 *
 * @author ESPE
 */
public class Condicionales_jf {

    public static void main(String[] args) {
        int hora= 2;
        if(hora>=0 && hora<=12){
            System.out.println("buenos dias");
        }else if(hora>12 && hora<=18){
            System.out.println("buenas tardes");
        }else{
            System.out.println("buenas noches");
        }
        
    }
}
