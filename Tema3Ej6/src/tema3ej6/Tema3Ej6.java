/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int nota;
        System.out.println("Introduzca tu nota del 1 al 10");
        nota = entrada.nextInt();
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Estas suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Estas aprobado");
                break;
            case 7:
            case 8:
                System.out.println("Tienes un notable");
                break;
            case 9:
            case 10:
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                System.out.println("El numero es invalido");
            
              
            
                    
        }
    }
    
}
