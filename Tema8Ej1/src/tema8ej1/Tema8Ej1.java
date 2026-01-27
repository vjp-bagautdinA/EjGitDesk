package tema8ej1;
//@author Usuario
import java.util.Scanner;
public class Tema8Ej1 {
    
    public static void pedirNotas() {
        Scanner input = new Scanner(System.in);
        nota[] notas = new nota[6];
        for (int i = 0;i < notas.length;i++) {
            notas[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
      
    }
}
