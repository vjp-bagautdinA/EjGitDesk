package tema8ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema8Ej6 {
    
    public static void rellenarVector()  {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos empleados quieres crear?");
        int numEmpleados = input.nextInt();
        Empleado[] Empleados = new Empleado[numEmpleados];
        for (int j = 0;j < Empleados.length;j++) {
            System.out.println("Introduzca el nombre del empleado:");
            String nombre = input.next();
            System.out.println("Y ahora el numero de horas que trabajó:");
            int horas = input.nextInt();
            System.out.println("Y finalmente su tarifa:");
            int tarifaNormal = input.nextInt();
            Empleados[j] = new Empleado(nombre,horas,tarifaNormal);
        }
        calcularSueldo(Empleados);
    }
    public static void calcularSueldo(Empleado[] Empleados) {
        double sueldo;
        for(int i = 0;i <Empleados.length;i++) {
            if (Empleados[i].getHoras() <= 40) {
                sueldo = Empleados[i].getHoras()*Empleados[i].getTarifaNormal();
                Empleados[i].setSueldo(sueldo);
                System.out.println("Nombre: "+Empleados[i].getNombre());
                System.out.println("Tarifa: "+Empleados[i].getNombre()+" por hora.");
                System.out.println("Sueldo: "+Empleados[i].getSueldo());
            }
            if (Empleados[i].getHoras() > 40) {
                sueldo = (Empleados[i].getTarifaNormal()*40)+(Empleados[i].getTarifaExtra()*(Empleados[i].getHoras()-40));
                Empleados[i].setSueldo(sueldo);
                System.out.println("Nombre: "+Empleados[i].getNombre());
                System.out.println("Tarifa: "+Empleados[i].getNombre()+" por hora.");
                System.out.println("Sueldo: "+Empleados[i].getSueldo());
            }
        }
    }
 
    public static void main(String[] args) {
        rellenarVector();
 
    }
    
}
