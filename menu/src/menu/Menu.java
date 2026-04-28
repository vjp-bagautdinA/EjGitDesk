package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void menu() { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        Scanner input = new Scanner(System.in);
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. .");
                System.out.println("2. .");
                System.out.println("3. .");
                System.out.println("4. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = pedirInt(input);
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        ready = true;
                    }
                    case 2 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("ERROR: Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 3 -> {
                        if (ready == true) {
                        } else {
                            System.out.println("ERROR: Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Saliendo...");
                    }
                    default ->
                        System.out.println("ERROR: Debes elegir una opcion del 1 al 4");
                }
                //Try catch con todos los errores con su respuesta correspondiente
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un número sin letras o simbolos.");
                input.nextLine();
            }

        } while (eleccionMenu != 4); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static void trycatch() {
        try {

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Debe introducir un número");
        }
    }

    public static String pedirString(Scanner input) {
        String string = input.nextLine();
        return string;
    }

    public static int pedirInt(Scanner input) {
        int v = input.nextInt();
        input.nextLine();
        return v;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
    }

}
