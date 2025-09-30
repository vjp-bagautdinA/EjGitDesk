/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejer32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero:");
        int cantidad = entrada.nextInt();
        int original = cantidad;
        int billetes50 = cantidad/50;
        cantidad = cantidad%50;
        int billetes20 = cantidad/20;
        cantidad = cantidad%20;
        int billetes10 = cantidad/10;
        cantidad = cantidad%10;
        int billetes5 = cantidad/5;
        cantidad = cantidad%5;
        int monedas2 = cantidad/2;
        cantidad = cantidad%2;
        int monedas1 = cantidad;
        System.out.println(original+" euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+billetes5+" billetes de 5, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
                
                
                
                
                
                
                
                
                
    }
    
}
