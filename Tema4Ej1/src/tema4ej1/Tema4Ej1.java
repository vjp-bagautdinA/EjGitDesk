package tema4ej1;
//@author alumno
import java.util.Scanner;
public class Tema4Ej1 {
    
    public static void PosoNeg (int n){
    if (n <0) {
        System.out.println("Numero es negativo");
    }else {
        System.out.println("Numero es positivo");
    }
}
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        n = inp.nextInt();
        Tema4Ej1.PosoNeg(n);
    }
    
}
