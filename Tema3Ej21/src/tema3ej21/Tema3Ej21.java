package tema3ej21;
import java.util.Scanner;
//@author alumno
public class Tema3Ej21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");//Pedimos los dos numeros
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el sengundo número:");
        int num2 = entrada.nextInt();
        int resultado;
        try {
             resultado = num1/num2; //Calculamos resultado y protegemos con try
        } catch (ArithmeticException e) { //En caso de que intenten dividir por 0 pillamos el error y resultado = 0
            System.out.println("Error, no se puede dividir por 0");
            resultado = 0;
        }
        System.out.println(resultado); //Imprimimos resultados
        
    }
    
}
