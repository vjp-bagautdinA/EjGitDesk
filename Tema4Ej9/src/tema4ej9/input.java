package tema4ej9;
//@author alumno
import java.util.Scanner;
public class input {
    public static int salida (int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        n = input.nextInt();
    return n;}
    public static void menor (int n1,int n2,int n3, int menor) {
        menor = n1;
        if(n2<menor){
           menor = n2;
        }
        if (n3<menor) {
            menor = n3;
        }
        System.out.println("El numero menor es: "+menor);
    }
    
}
