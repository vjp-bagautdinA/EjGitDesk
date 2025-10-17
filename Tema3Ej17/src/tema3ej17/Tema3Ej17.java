package tema3ej17;
//@author alumno
import java.util.Scanner;
public class Tema3Ej17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero; //Declaramos variable
        do {
            System.out.print("Introduce un numero no negativo: ");
            numero = entrada.nextDouble(); //Pedimos un numero no negativo al usuario
            if (numero<0) { //Comprobamos si el numero es menor que 0 y si lo es le volvemos a pedir el numero
                System.out.println("No se permiten numeros negativos. Intentalo otra vez");}
        } while (numero < 0);
        double sqrt = Math.sqrt(numero); //Utilizamos math.sqrt para hacer su raiz, la guardamos en una variable y la imprimimos
        System.out.println("La raiz cuadrada de " + numero+ " es " + sqrt);
    }
}
