package tema4ej2;
//@author alumno
import java.util.Scanner;
public class Tema4Ej2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduzca un numero");
        n1 = inp.nextInt();
        System.out.println("Introduzca otro numero");
        n2 = inp.nextInt();
        if (n1>10) {
            SumaOProducto.Producto(n1, n2);
        }else {
            SumaOProducto.Suma(n1, n2);
        }
    }
    
}
