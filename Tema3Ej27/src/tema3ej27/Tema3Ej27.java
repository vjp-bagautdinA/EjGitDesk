package tema3ej27;
import java.util.Scanner;
//@author alumno
public class Tema3Ej27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");//Pedimos los numeros
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        int num2 = entrada.nextInt();
        int eleccion; 
        do {
            System.out.println("Que quieres hacer?"); //Menu
            System.out.println("1: Sumar los números");
            System.out.println("2:Restar los números");
            System.out.println("3.Multiplicar los números");
            System.out.println("4.Dividir los números");
            System.out.println("5.Salir del programa");
            eleccion = entrada.nextInt(); //Leemos su eleccion
            switch (eleccion) { //Hacemos lo que nos dice el menu en cada caso
                case 1: {
                    System.out.println("El resultado es: "+(num1+num2));
                    break;
                }
                case 2: {
                    System.out.println("El resultado es: "+(num1-num2));
                    break;
                }
                case 3: {
                    System.out.println("El resultado es: "+(num1*num2));
                    break;
                }
                case 4: {
                    try {
                        System.out.println("El resultado es: "+(num1/num2)); //Try catch para que no se pueda dividir entre 0
                    }catch (ArithmeticException e) {
                        System.out.println("No puedes dividir entre 0");
                    }
                break;
                }
            }
        }while (eleccion != 5); //El programa termina si ponen 5 como input
    }
}
