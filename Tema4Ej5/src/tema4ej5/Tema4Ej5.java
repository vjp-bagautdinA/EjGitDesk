package tema4ej5;
//@author alumno
import java.util.Scanner;
import salida.ParOImpar;
public class Tema4Ej5 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = entrada.nextInt();
        ParOImpar.check(num);
    }
    
}
