/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número");
        int numero1 = entrada.nextInt();
        System.out.println("Por favor, introduzca un segundo número");
        int numero2 = entrada.nextInt();
        if (numero1 > 10) {
            int resultadoMulti = numero1*numero2;
            System.out.println("La operacion que se realizo fue un producto y el resultado es "+resultadoMulti);            
        }
        else {
            int resultadoSuma = numero1+numero2;
            System.out.println("La operacion que se realizo fue una suma y el resultado es "+resultadoSuma);
        }
    }
    
}
