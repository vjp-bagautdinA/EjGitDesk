/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int tiempoInicial;
       System.out.println("Por favor, introduzca un numero de segundos:");
               tiempoInicial = entrada.nextInt();
       int horas = tiempoInicial/3600;
       int minutos = (tiempoInicial%3600) / 60;
       int segundos = tiempoInicial%60;

               System.out.println(tiempoInicial+" segundos hacen un total de: "+horas+" horas,"+minutos+" minutos y "+segundos+" segundos");
       
       
              
    }
    
}
