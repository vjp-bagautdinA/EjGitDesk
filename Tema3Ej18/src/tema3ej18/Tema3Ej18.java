package tema3ej18;
import java.util.Scanner;
//@author alumno
public class Tema3Ej18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int contraseñaCorrecta = 4365; // Guardamos la contraseña correcta
        int intentos = 0; //Creamos variables
        boolean correcto = false;
        int input;
        do {
            System.out.print("Introduce tu contraseña:");
            input = entrada.nextInt(); //Cogemos el input del usuario
           intentos++;
            if (input != contraseñaCorrecta) { //Si el input es diferente de la contraseña guardada y lleva menos de 3 intentos lo pedimos otra vez
                if (intentos < 3) {
                    System.out.println("Contraseña incorrecta. Intentalo otra vez");}
            } else {// Si no se cumple el if significa que es correcto asi que se le da acceso
                correcto = true;
                System.out.println("Correcto, Accediendo...");}          
        } while (correcto == false && intentos < 3); //Al final del bucle comprobamos si el usuario ha hecho mas de 3 intentos salimos del bucle y damos error
        if (correcto == false) {
            System.out.println("Error: Demasiados intentos fallidos.");
        }
    }
}
    
    

