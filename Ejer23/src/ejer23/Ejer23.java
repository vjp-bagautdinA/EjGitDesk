/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer23;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
   int precio;
   int unidades;
        System.out.println("Por favor introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextInt();
        System.out.println("¿Cuantas unidades quiere llevarse?");
        unidades = entrada.nextInt();
    int resultado = precio*unidades;
        System.out.println("El precio total de su compra es de: "+resultado);
        
    }
    
}
