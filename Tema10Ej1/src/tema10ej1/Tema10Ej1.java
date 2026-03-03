package tema10ej1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema10Ej1 {

    public static void menu() { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        ArrayList<String> Nombres = new ArrayList<String>();
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Añadir personas a la lista.");
                System.out.println("2. Mostrar lista.");
                System.out.println("3. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1: {
                        Nombres = pedirDatos(Nombres);
                        ready = true;
                        if (Nombres.isEmpty()) {
                            System.out.println("Debes introducir al menos una persona para usar las demas opciones.");
                        }
                        break;
                    }
                    case 2: {
                        if (ready == false) {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        } else if (Nombres.isEmpty()) {
                            System.out.println("Debes introducir al menos una persona para mostrar la lista.");
                        } else {
                            mostrarLista(Nombres);
                        }
                        break;
                    }
                    case 3:
                    default:
                        System.out.println("Debes elegir una opcion del 1 al 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero.");
                input.nextLine();
            }

        } while (eleccionMenu != 3); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static ArrayList<String> pedirDatos(ArrayList<String> Nombres) { //Método para añadir personas.
        int elección = 0;
        Scanner input = new Scanner(System.in);
        añadirNombre(Nombres);
        do {
            try {
                System.out.println("Quieres añadir una persona?");//Pregunta si quiere añadir una persona hasta que diga que no.
                System.out.println("1. Si.");
                System.out.println("2. No.");
                elección = input.nextInt();
                switch (elección) { //
                    case 1: {
                        añadirNombre(Nombres);
                        break;
                    }
                    default: //Protegido con un default
                        System.out.println("Debe elegir la opción 1 o 2");
                }
            } catch (InputMismatchException e) { //Protegido con un trycatch
                System.out.println("Debe ser un numero.");
                input.nextLine();
            }
        } while (elección != 2);
        return Nombres;
    }

    public static void mostrarLista(ArrayList Nombres) { //Método para mostrar la lista
        for (int i = 0; i < Nombres.size(); i++) {
            System.out.println("--------------------");
            System.out.println("Nombre en índice " + i + ": " + Nombres.get(i));
        }
    }

    public static void añadirNombre(ArrayList Nombres) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre y apellido de la persona que quiere añadir.");
        Nombres.add(input.next());
    }

    public static void main(String[] args) {
        menu();
    }

}
