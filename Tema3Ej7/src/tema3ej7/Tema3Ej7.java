/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         boolean laborable;
         System.out.println("Que numero del dia de la semana es? Ej: Lunes = 1, Martes = 2");
         int diasemana = entrada.nextInt();
         switch (diasemana) {
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
             laborable = true;
             if (laborable == true) {
             System.out.println("Hoy se trabaja");
             }
                     break;
             case 6:
             case 7:
             laborable =false;
             if (laborable == false) {
                  System.out.println("Hoy no se trabaja, corre al bar");
             }
            
                     
         
       
    }
    
}
}