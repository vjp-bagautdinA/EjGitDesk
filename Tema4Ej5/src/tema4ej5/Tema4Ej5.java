package tema4ej5;
//@author alumno
import java.util.Scanner;
import salida.ParOImpar;//Importamos paquete donde esta el metodo
public class Tema4Ej5 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número");//Pedimos un numero al usuario
        num = entrada.nextInt();
        ParOImpar.check(num);//Llamamos al metodo
    }
    
}
