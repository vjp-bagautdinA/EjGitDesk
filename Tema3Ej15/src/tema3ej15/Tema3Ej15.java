package tema3ej15;
//@author alumno
import java.util.Scanner;
public class Tema3Ej15 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Dime cualquier numero para ver su tabla de multiplicación"); //Pedimos valor de variable del usuario
        double numero = entrada.nextDouble();
        for (int i=1;i<=10;i++) {//Imprimimos las primeras 10 multiplicaciones de la tabla
            System.out.println(numero+ " x "+i+" = "+(numero*i));
        }
    }
    
}
