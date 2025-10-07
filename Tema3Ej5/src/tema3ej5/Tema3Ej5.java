/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un número:");
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero introducido es par");
        }else {
            System.out.println("El numero introducido es impar");
        }
    }
    
}
