package tema8ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema8Ej6 {
    
    public static void rellenarVector()  {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos empleados quieres crear?");
        int numEmpleados = input.nextInt();
        Empleado[] Empleados = new Empleado[numEmpleados];
        for (int j = 0;j <= Empleados.length;j++) {
            System.out.println("Introduzca el nombre del empleado:");
            String nombre = input.next();
            System.out.println("Y ahora el numero de horas que trabajó:");
            int horas = input.nextInt();
            Empleados[j] = new Empleado(nombre,horas);
        }
    }
    public static void calcularSueldo(Empleado[] Empleados) {
        for(int i = 0;i <=Empleados.length;i++) {
            System.out.println("");
        }
    }
 
    public static void main(String[] args) {
        rellenarVector();
 
    }
    
}
