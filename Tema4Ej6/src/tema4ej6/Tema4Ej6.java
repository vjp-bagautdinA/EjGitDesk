package tema4ej6;
//@author alumno
import java.util.Scanner;
public class Tema4Ej6 {
    public static void check(int num) {
        if (num >= 0 && num <= 4) {//Comprobamos en que rango el numero dado por el usuario esta y imprimimos correspondientemente
            System.out.println("Estas suspenso");
        }
        if (num == 5 || num == 6) {
            System.out.println("Estas aprobado");
        }
        if (num == 7 || num == 8) {
            System.out.println("Tienes un notable");
        }
        if (num == 9 || num == 10) {
            System.out.println("Tienes un sobresaliente");
        }
        else {
            System.out.println("Error: Introduce un numero del 0 al 10");//Mensaje de Error si el valor no es del 0 al 10
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Introduce tu nota del 0 al 10");//Pedimos un numero del 0 al 10
        num = input.nextInt();
        Tema4Ej6.check(num);//Llamamos al metodo
    }
    
}
