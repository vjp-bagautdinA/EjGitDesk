package tema4ej10;
//@author alumno
import java.util.Scanner;
public class Tema4Ej10 {
    public static int numero(int n) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar");//Pedimos un numero al usuario y lo devolvemos
        n = inp.nextInt();
        return n;
    }
    public static void tabla(int n) {    
        for (int i=0;i<=10;i++) {
            System.out.println(n*i);//Imprimimos su tabla de multiplicar con un bucle for
        }
    }
    public static void main(String[] args) {
        int n;
        n = Tema4Ej10.numero(0);//Llamamos al primer metodo para pedir un numero
        Tema4Ej10.tabla(n);//Y al segundo para imprimir su tabla
    }
    
}
