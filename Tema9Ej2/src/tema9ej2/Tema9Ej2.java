package tema9ej2;
import java.util.Scanner;
public class Tema9Ej2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba una cadena de carácteres");
        String cadena1 = input.next();
        for (int i = 0;i <cadena1.length();i++) {
            System.out.println("El carácter situado en la posición"+i+1+" es el: "+cadena1.charAt(i));
        }
    }
    
}
