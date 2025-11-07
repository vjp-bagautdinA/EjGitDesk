package tema4ej12;
//@author alumno
import java.util.Scanner;
public class Tema4Ej12 {
    public static int peticion(int input) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduzca la contraseña");//Pedimos la contraseña al usuario y devolvemos el valor
        input = inp.nextInt();
        return input;
    }
    public static boolean comprobacion(boolean correcto, int input, int conCorrecta, int intentos) {
        conCorrecta = 124;
        Scanner inp = new Scanner(System.in);//Declaramos variables
        correcto = false;
        intentos = 0;
        do {
           intentos++;
            if (input != conCorrecta) { //Si el input es diferente de la contraseña guardada y lleva menos de 3 intentos lo pedimos otra vez
                if (intentos < 3) {
                    System.out.println("Contraseña incorrecta. Intentalo otra vez");}
                input = inp.nextInt();
            } else {// Si no se cumple el if significa que es correcto asi que se le da acceso
                correcto = true;
                }          
        } while (correcto == false && intentos < 3); //Al final del bucle comprobamos si el usuario ha hecho mas de 3 intentos salimos del bucle con el boolean false
                return correcto;
    }
    
    public static void resultado(boolean correcto) {
        if (correcto == true) {
            System.out.println("Correcto, Accediendo...");//Si el boolean es true imprimimos que ha acertado
        }else {
            System.out.println("Error, demasiados intentos");//Si es false es que ha superado los 3 intentos y denegamos el acceso
        }
    }

    public static void main(String[] args) {
        int input = 0;
        boolean correcto = false;//Declaramos variables
        input = Tema4Ej12.peticion(input);//Llamamos a los metodos
        correcto = Tema4Ej12.comprobacion(correcto, input, input, input);
        Tema4Ej12.resultado(correcto);
        
    }
}
