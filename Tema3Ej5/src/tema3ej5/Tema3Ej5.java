package tema3ej5;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Introduzca un número:");
        int numero = entrada.nextInt();//Introduzco una variable int dada por el usuario
        if (numero % 2 == 0) {//Compruebo si la el resto de la variable al dividirla por 2 es 0, si es verdad el numero siempre sera par
            System.out.println("El numero introducido es par");
        }else { //Si no se cumple siempre sera impar
            System.out.println("El numero introducido es impar");
        }
    }
    
}
