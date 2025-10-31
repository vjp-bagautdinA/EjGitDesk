package tema4ej8;
//@author alumno
import java.util.Scanner;
public class Tema4Ej8 {
    public static void recuento(int input,int original,int b50,int b20,int b10,int b5,int m2,int m1) {
    original = input;
    if (input / 50 != 0) {
        b50 = input/50;
        System.out.println("Billetes de 50: "+b50);
        input = input%50;
    }
    if (input / 20 != 0) {
        b20 = input/20;
        System.out.println("Billetes de 20: "+b20);
        input = input%20;
    }
    if (input / 10 != 0) {
        b10 = input/10;
        System.out.println("Billetes de 10: "+b10);
        input = input%10;
    }
    if (input / 5 != 0) {
        b5 = input/5;
        System.out.println("Billetes de 5: "+b5);
        input = input%5;
    }
    if (input / 2 != 0) {
        m2 = input/2;
        System.out.println("Monedas de 2: "+m2);
        input = input%2;
    }
    if (input != 0) {
        System.out.println("Monedas de 1: 1");
    }
}
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int input;
        System.out.println("Introduzca una cantidad de dinero:");
        input = entrada.nextInt();
        Tema4Ej8.recuento(input, input, input, input, input, input, input, input);
    }
}
