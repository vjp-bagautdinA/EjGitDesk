package tema4ej8;
//@author alumno
import java.util.Scanner;
public class Tema4Ej8 {
    public static void recuento(int input,int b50,int b20,int b10,int b5,int m2,int m1) {
        System.out.println(input+" Euros se descomoponen en:");
    if (input / 50 != 0) {//Comprobamos si el numero es mayor que 50, si lo es imprimimos las veces que lo puedo dividir hasta que sea menor
        b50 = input/50;
        System.out.println("Billetes de 50: "+b50);//Imprimimos las veces que lo pudimos dividir
        input = input%50;///Actualizamos input
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
        System.out.println("Introduzca una cantidad de dinero:");//Pedimos cuantos euros quiere descomponer
        input = entrada.nextInt();
        Tema4Ej8.recuento(input, input, input, input, input, input, input);//Llamamos metodo
    }
}
