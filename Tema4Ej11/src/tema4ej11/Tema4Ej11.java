package tema4ej11;
//@author alumno
import java.util.Scanner;
public class Tema4Ej11 {
    public static double numero(double n) {
        Scanner inp = new Scanner(System.in);
        boolean valido = false;//Declaramos variables
        do {
        System.out.println("Introduzca un numero positivo para calcular su raiz cuadrada");//Pedimos un numero positivo
        n = inp.nextDouble();
        valido = true;
        if (n<0) {
            System.out.println("Introduzca un numero positivo");//Si no es positivo eliminamos el input y preguntamos otra vez
            inp.nextLine();
            valido = false;
        }
        }while (valido != true);//Una vez sea valido salimos del bucle y devolvemos la variable
        return n;
        
    }
     public static double raiz(double n) {
         n = Math.sqrt(n);//Calculamos la raiz cuadrada y la devolvemos
         return n;
     }
     public static void resultado(double n) {
         System.out.println("El resultado es: "+n);//Imprimimos el resultado
     }
    
    public static void main(String[] args) {
        double n = 0;//Declaramos variable para ir actualizandolo
        n = Tema4Ej11.numero(n);//Llamamos al primer metodo para pedir el numero
        n = Tema4Ej11.raiz(n);//El segundo para calcular su raiz
        Tema4Ej11.resultado(n);//Y el ultimo para imprimir el resultado
        
    }
    
}
