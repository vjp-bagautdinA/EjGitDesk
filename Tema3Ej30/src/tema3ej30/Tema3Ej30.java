package tema3ej30;
import java.util.Scanner;
//@author alumno
public class Tema3Ej30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number = (int) Math.floor(Math.random() * 101); //Creamos un numero aleatorio del 0 al 100 int inclusivo
        int intentos = 0; //Leemos sus intentos que sube cada vez que se reproduce el bucle
        int input;
        do {
            try {
                System.out.println("Tengo un número del 0 al 100, adivínalo:");
                input = entrada.nextInt(); //Leemos su numero
            } catch (java.util.InputMismatchException e) {
                System.out.println("Eso no es un número, inténtalo otra vez."); //Si es una letra lo pillamos en catch y reseteamos el valor input
                entrada.next(); 
                input = -1;             
            }
            if (input < number && input >= 0) {
                System.out.println("Más para arriba");//Dependiendo del valor le decimos si se queda corto o largo
            } else if (input > number) {
                System.out.println("Te has pasado");
            }
            intentos++;
        } while (input != number); //El bucle solo se repite si no ha adivinado el numero
        System.out.println("¡Lo has acertado en " + intentos + " intentos, muy bien!"); //Imprimimos en cuantos intentos lo ha adivinado
    }
}
