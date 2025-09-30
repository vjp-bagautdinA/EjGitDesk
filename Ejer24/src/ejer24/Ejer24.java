/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
      float NProg;
      float NLMSGI;
      float NBD;
      float NED;
      float NSI;
      float NIPE1;
      float NMedia;
        System.out.println("Por favor, introduza la nota de Programación:");
        NProg = entrada.nextFloat();
        System.out.println("Intoduzca la nota de Lenguajes de Marcas:");
        NLMSGI = entrada.nextFloat();
        System.out.println("Introduza la nota de Bases de Datos:");
        NBD = entrada.nextFloat();
        System.out.println("Introduzca la nota de Entornos de Desarollo:");
        NED = entrada.nextFloat();
        System.out.println("Introduzca la nota de Sistemas Informáticos:");
        NSI = entrada.nextFloat();
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral:");
        NIPE1 = entrada.nextFloat();
        NMedia = (NProg+NLMSGI+NBD+NSI+NIPE1+NED)/6;
        System.out.println("Su nota media del curso es de: "+NMedia);
        
        
        
    }
    
}
