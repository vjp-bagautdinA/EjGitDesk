/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer número:");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número");
        int numero2 = entrada.nextInt();
        System.out.println("Por último, introduzca el tercer número");
        int numero3 = entrada.nextInt();
        if (numero1 > numero2 && numero1 > numero3){
        System.out.println("El número mayor de los introducidos es el "+numero1);
    }   else if (numero2>numero1 && numero2>numero3){
        System.out.println("El número mayor de los introducidos es el "+numero2);
    }   else {
            System.out.println("El número mayor de los introducidos es el "+numero3);
        
    }
    
       
        
    
    }
    
}
