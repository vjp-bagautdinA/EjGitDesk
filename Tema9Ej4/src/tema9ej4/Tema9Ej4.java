package tema9ej4;
import java.util.Scanner;
public class Tema9Ej4 {
    
final static String RESPUESTA1 = "Madrid";
final static String RESPUESTA2 = ("COLON");
final static String RESPUESTA2ALT = "COLÓN";

    public static void main(String[] args) {
        int puntuacion = 0;
        Scanner input = new Scanner(System.in);       
        System.out.println("Cuál es la capital de España?");
        String INPUT1 = input.next();
        System.out.println("Quien descubrio America?");
        String INPUT2 = input.next();
        if (RESPUESTA1.equalsIgnoreCase(INPUT1)) {
            puntuacion = puntuacion +5;
        }
        if (RESPUESTA2.equalsIgnoreCase(INPUT2)||RESPUESTA2ALT.equalsIgnoreCase(INPUT2)) {
            puntuacion = puntuacion +5;
        }
        System.out.println("Has sacado un "+puntuacion);
    }
    
}
