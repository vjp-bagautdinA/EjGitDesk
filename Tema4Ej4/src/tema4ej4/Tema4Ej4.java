package tema4ej4;
//@author alumno
import java.util.Scanner;
public class Tema4Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca el tercer numero");
        int num3 = entrada.nextInt();
        int menor = Menor.Calculador(num1, num2, num3);
        System.out.println("El numero menor de los introducidos es: "+menor);
    }   
}


