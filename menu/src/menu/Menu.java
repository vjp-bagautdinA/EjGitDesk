package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    
    public static void menu() { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. .");
                System.out.println("2. .");
                System.out.println("3. .");
                System.out.println("4. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                case 1: {
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready == true) {
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready == true) {
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                default:
                    System.out.println("Debes elegir una opcion del 1 al 4");
            }
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();
            }
            
        } while (eleccionMenu != 4); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
