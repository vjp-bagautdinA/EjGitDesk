/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ej9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduca el primer número:");
        int n1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número:");
        int n2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número");
        int n3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto número");
        int n4 = entrada.nextInt();
        int aux;
        if(n1>n2){aux=n1;n1=n2;n2=aux;}
        if(n1>n3){aux=n1;n1=n3;n3=aux;}
        if(n1>n4){aux=n1;n1=n4;n4=aux;}
        if(n2>n3){aux=n2;n2=n3;n3=aux;}
        if(n2>n4){aux=n2;n2=n4;n4=aux;}
        if(n3>n4){aux=n3;n3=n4;n4=aux;}
        System.out.println("El orden de los números introducidos es el "+n1+"-"+n2+"-"+n3+"-"+n4);
        
        }
        
        
    }
    

