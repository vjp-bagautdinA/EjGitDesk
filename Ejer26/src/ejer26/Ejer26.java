/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejer26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número de 4 cifras:");
        int numeroInicial = entrada.nextInt();
  int primeraCifra = numeroInicial/1000;
  int segundaCifra = (numeroInicial/100)%10;
  int terceraCifra = (numeroInicial/10)%10;
  int cuartaCifra = numeroInicial%10;
        System.out.println("La primera cifra es: "+primeraCifra);
        System.out.println("La segunda cifra es: "+segundaCifra);
        System.out.println("La tercera cifra es: "+terceraCifra);
        System.out.println("La cuarta cifra es: "+cuartaCifra);
        
          
          
    }
    
}
