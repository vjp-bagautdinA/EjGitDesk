package tema3ej8;
//@author alummno
import java.util.Scanner;
public class Tema3Ej8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un valor en euros");
        int dinero = entrada.nextInt();
        int original = dinero;
        System.out.println(original+" Euros se descomponen en:");
        if (dinero>=50) {
            int billetes50 = dinero/50;
            dinero = dinero%50;
            System.out.println("Billetes de 50: "+billetes50);
        }if (dinero>=20) {
            int billetes20 = dinero/20;
            dinero = dinero%20;
            System.out.println("Billetes de 20: "+billetes20);
        }if (dinero>=10) {
            int billetes10 = dinero/10;
            dinero = dinero%10;
            System.out.println("Billetes de 10 "+billetes10);
        }if (dinero>=5) {
            int billetes5 = dinero/5;
            dinero = dinero%5;
            System.out.println("Billetes de 5: "+billetes5);
        }if (dinero>=2) {
            int monedas2= dinero/2;
            System.out.println("Monedas de 2 euros "+monedas2);
        }if (dinero == 1) {
            System.out.println("Monedas de 1 euro: 1");
        }          
  }
    
}
