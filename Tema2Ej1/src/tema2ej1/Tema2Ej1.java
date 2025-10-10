/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ej1;

/**
 *
 * @author alumno
 */
public class Tema2Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1=30;
        boolean numero2;
        int resultado;
        numero2=700;
        resultado=numero1+numero2;
        System.out.println("El resultado de la suma es: "+resultado);
        //Respuesta
        //El problema en este codigo es que la variable numero 2 nunca es declarada, como se puede ver nunca hay un "int" detras de "numero2"
        //por lo cual java no lo reconoce y da un error de compilacion
        //Solucion
    }
    public static void solucion(String[] args) {
        int numero1=30;
        boolean numero2;
        int resultado;
        int numero3=700;
        resultado=numero1+numero3;
        System.out.println("El resultado de la suma es: "+resultado);
    }
      
        
}
