package tema4ej3;
//@author alumno
import java.util.Scanner;
import CalculadorMayorNumero.NewClass; //Importamos paquete donde esta el metodo
public class Tema4Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Por ultimo, introduzca el tercer numero");//Pedimos 3 numeros al usuario
        int num3 = entrada.nextInt();
        int mayor = NewClass.Calculador(num1, num2, num3);//Llamamos al metodo para que calcule el mayor de ellos y guardamos el return
        System.out.println("El numero mayor de los introducidos es: "+mayor);//Imprimimos resultado
    }
    
}
