package tema11ej8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema11Ej8 {

    public static void menu(ArrayList ciudades) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1.  Agregar una ciudad.");
                System.out.println("2. Mostrar todas las ciudades junto con sus sedes.");
                System.out.println("3. Mostrar sedes con ingresos anuales superiores a la media.");
                System.out.println("4. Buscar por nombre de sede.");
                System.out.println("5. Añadir sede.");
                System.out.println("6. Mostrar sedes de mayor a menor basadas en ingresos. ");
                System.out.println("7. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {

                        ready = true;
                    }
                    case 2 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 3 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 4 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 5 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 6 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    default ->
                        System.out.println("Debes elegir una opcion del 1 al 7");
                }
                //Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un número.");
                input.nextLine();
            }

        } while (eleccionMenu != 7); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static void añadirCiudad() {
        boolean terminado = false;
        System.out.println("Introduzca el nombre de la ciudad:");
        String nombre = pedirString();
        do {
            System.out.println("");
        } while(terminado != true);
    }

    public static String pedirString() {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        return string;
    }

    public static void main(String[] args) {
        ArrayList<Ciudad> ciudades = new ArrayList();
        menu(ciudades);
    }

}
