package tema4ej2;
//@author alumno
import java.util.Scanner;
public class Tema4Ej2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduzca un numero");
        n1 = inp.nextInt();
        System.out.println("Introduzca otro numero");//Pedimos dos numeros al usuario
        n2 = inp.nextInt();
        if (n1>10) {//Comprobamos si es mayor que 10 y llamamos al metodo correspondiente
            SumaOProducto.Producto(n1, n2);//Si lo es los multiplicamos
        }else {
            SumaOProducto.Suma(n1, n2);//Sino los sumamos
        }
    }
    
}
