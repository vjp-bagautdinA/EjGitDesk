package tema7ej8;
//@author alumno
import java.util.Scanner;
public class Tema7Ej8 {
    
    public static int obtenerNumero() {
        Scanner input = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce un digito de 5 numeros");
            numero = input.nextInt();
        } while (numero < 10000 || numero > 99999);
        return numero;
    }
    
    public static int[] convertirAArrayAlReves(int numero) {
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = numero % 10;
            numero = numero /10;
        }
        return array;
    }
    
    public static void imprimirArrayComoNumero(int[] array) {
        System.out.println("El numero al reves es: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int numero = obtenerNumero();
        int [] numerosAlReves = convertirAArrayAlReves(numero);
        imprimirArrayComoNumero(numerosAlReves);
    }
    
}
