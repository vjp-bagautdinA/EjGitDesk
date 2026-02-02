package tema8ej12;
//@author alumno

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema8Ej12 {

    public static void menu() {//Muestra el menu hasta que se salga del programa y protege contra inputMismatch
        int eleccionMenu = -1;
        boolean ready = false;
        mueble[] muebles = new mueble[4]; //Creamos el array de objetos para pasarlo por parametro a los demas metodos
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

    public static void rellenarMuebles(mueble muebles[]) {//Pide el precio de cada uno de los muebles dentro del array
        Scanner input = new Scanner(System.in);
        int pedirPrecio = 0; //Pedir el precio en otro metodo no es posible ya que necesito el numero de cada mueble y eso se hace con el "i" del loop for.
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("Introduzca el precio del mueble " + (i + 1) + ":");
            pedirPrecio = input.nextInt();
            muebles[i] = new mueble(pedirPrecio);
        }
    }

    public static void mostrarMuebles(mueble muebles[]) {//Recorre el array y imprime los atributos de cada uno de los objetos
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("Mueble " + (i + 1) + ":");
            System.out.println("Precio: " + muebles[i].getPrecio());
            System.out.println("Descripcion: " + muebles[i].getDescripcion());
        }
    }

    public static void mostrarPorPrecio(mueble muebles[]) { //Le pide al usuario un precio maximo y imprime todos los muebles por debajo de ese precio
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
