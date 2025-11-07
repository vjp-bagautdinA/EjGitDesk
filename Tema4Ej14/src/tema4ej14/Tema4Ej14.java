package tema4ej14;
//@author alumno
import java.util.Scanner;
public class Tema4Ej14 {
    public static int input(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero");//Pedimos un numero y lo devolvemos
        n = input.nextInt();
        return n;
    }
    public static int check(int n) {
        int intentos;
        intentos = 1;//Mantenemos cuenta de los intentos
        Scanner input = new Scanner(System.in);
            do {
                System.out.println("Introduzca un valor mayor que 0");//Pedimos un nuevo valor
                n = input.nextInt();
                intentos++;//Cada vez que se ejecute el bucle incrementamos los intentos
            }while (n<=0);//Comprobamos que no sea menor que 0
            System.out.println(intentos+" intentos");//Imprimimos el numero de intentos
        return n;
    }
    public static void resultado(int n) {
        for (int i=0;i<=n;i++) {
            if (i%3 == 0) {//Filtramos los numeros para que sean multiplos de 3
                System.out.println(i);//Imprimimos los numeros
            }
        }
    }
    public static void main(String[] args) {
        int n = 0;//Declaramos variable necesaria
        n = Tema4Ej14.input(n);//Llamamos a los metodos
        n = check(n);
        Tema4Ej14.resultado(n);
    }
    
}
