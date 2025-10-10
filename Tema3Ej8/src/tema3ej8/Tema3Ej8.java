package tema3ej8;
//@author alummno
import java.util.Scanner;//Importo la utilidad Scanner
public class Tema3Ej8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Introduzca un valor en euros");//Como el ejercicio 32 pero con ifs
        int dinero = entrada.nextInt();//Variable original de dinero dado por el usuario
        int original = dinero;//Variable auxiliar que guarda la cantidad original de dinero
        System.out.println(original+" Euros se descomponen en:");
        if (dinero>=50) {//Compruebo si tiene la cantidad necesaria para que haya por lo menos un billete o moneda, si no lo hay no se muestra en el terminal
            int billetes50 = dinero/50;
            dinero = dinero%50;//Si lo hay reescribo la variable original con el resto de la division
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
