package tema7ej9;
//@author alumno
import java.util.Scanner;
public class Tema7Ej9 {
    
    public static int obtenerNumero() {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero entero:");
        numero = input.nextInt();
        return numero;
    }
    
    public static int contarCifras(int numero) {
        int numCifras = 0;
        int aux = numero;
        
        if (aux == 0) {
            return 1;
        }
        
        while (aux != 0) {
            aux = aux / 10;
            numCifras++;
        }
        return numCifras;
    }
    
    public static int[] meterNumeroEnArray(int numero, int numCifras) {
        int[] array = new int[numCifras];
        
        for (int i = numCifras - 1; i >= 0;i--) {
            array[i] = numero % 10;
            numero = numero /10;
        }
        return array;
    }
    
    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int [array.length];
        
        for (int i = 0; i < array.length;i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }
    
    public static void printArray(int[] reverseArray) {
        System.out.println("El numero al reves es: ");
        
        for (int i = 0; i < reverseArray.length;i++) {
            System.out.println(reverseArray[i]);
    }
    }

    public static void main(String[] args) {
        int numero = obtenerNumero();
        int numCifras = contarCifras(numero);       
        int[] array = meterNumeroEnArray(numero,numCifras);
        int[] reverseArray = reverseArray(array);
        
        printArray(reverseArray);
        
    }
}

