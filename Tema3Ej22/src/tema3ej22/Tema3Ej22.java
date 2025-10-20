package tema3ej22;
//@author alumno
import java.util.Scanner;
public class Tema3Ej22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado;
        try {
            System.out.println("Introduzca el primer numero");//Pedimos los dos numeros protegidos por try
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = entrada.nextInt();
            resultado = num1+num2; //Calculamos resultado
        }catch (java.util.InputMismatchException e) {
            System.out.println("Error: No puedes introducir letras"); //Si ponen letras en cualquier numero salta el catch y resultado = 0
            resultado = 0;
        }
        System.out.println("El resultado es: "+resultado); //Imprimimos resultado
    }
    
}
