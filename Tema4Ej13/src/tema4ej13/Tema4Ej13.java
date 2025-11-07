package tema4ej13;
//@author alumno
import java.util.Scanner;
public class Tema4Ej13 {
    public static int input(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número");//Pedimos numero y lo devolvemos
        n = input.nextInt();
        return n;
    }
    public static boolean comprobacion(int n, boolean valido) {
        valido = false;
        Scanner input = new Scanner(System.in);
        if (n <=1) {
            do {
                System.out.println("Numero invalido, intentalo otra vez");//Comprobamos que el valor sea mayor que uno y solo salimos del bucle cuando lo es
                n = input.nextInt();
            }while (n <=1);
        }else {
            valido = true;
        }
        return valido;//Devolvemos valido cuando es true
    }
    public static void resultado(boolean correcto, int n) {//Imprimimos los numeros del 1 al numero dado
        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 0;//Declaramos variables
        boolean valido;
        n = Tema4Ej13.input(n);//Llamamos metodos
        valido = Tema4Ej13.comprobacion(n, false);
        Tema4Ej13.resultado(valido, n);
    }
    
}
