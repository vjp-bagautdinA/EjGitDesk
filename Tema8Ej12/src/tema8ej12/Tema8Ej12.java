package tema8ej12;
//@author alumno

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema8Ej12 {

    public static void menu() {//Muestra el menu hasta que se salga del programa y protege contra inputMismatch
        int eleccionMenu = -1;
        boolean ready = false;
        mueble[] muebles = new mueble[4];
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println();
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Rellenar precio y descripcion de muebles.");
                System.out.println("2. Mostrar precio y descripcion de muebles.");
                System.out.println("3. Mostrar muebles por precio.");
                System.out.println("4. Salir del programa.");
                System.out.println();
                eleccionMenu = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();
            }
            if (eleccionMenu < 1 && eleccionMenu > 4) {
                System.out.println("Debe introducir un numero del 1 al 4");
                eleccionMenu = 0;
            }
            switch (eleccionMenu) {
                case 1: {
                    rellenarMuebles(muebles);
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready == true) {
                        mostrarMuebles(muebles);
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready == true) {
                        mostrarPorPrecio(muebles);
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
            }
        } while (eleccionMenu != 4);

    }

    public static int pedirPrecio() {
        Scanner input = new Scanner(System.in);
        int pedirPrecio = 0;
        System.out.println("Introduzca el precio");
        pedirPrecio = input.nextInt();
        return pedirPrecio;
    }

    public static void rellenarMuebles(mueble muebles[]) {
        for (int i = 0; i < muebles.length; i++) {
            muebles[i] = new mueble(pedirPrecio());
        }
    }

    public static void mostrarMuebles(mueble muebles[]) {
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("Mueble " + (i + 1) + ":");
            System.out.println("Precio: " + muebles[i].getPrecio());
            System.out.println("Descripcion: " + muebles[i].getDescripcion());
        }
    }

    public static void mostrarPorPrecio(mueble muebles[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su presupuesto maximo:");
        int presupuesto = input.nextInt();
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i].getPrecio() <= presupuesto) {
                System.out.println("Mueble " + (i + 1) + ": " + muebles[i].getPrecio());
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
