package tema11ej3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Tema11Ej3 {
    
    public static void menu(Map mapa,HashMap[] plazas) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Aparcar.");
                System.out.println("2. Mostrar plazas libres.");
                System.out.println("3. Buscar autobús.");
                System.out.println("4. Buscar conductor.");
                System.out.println("5. Posición del autobús con los más conductores asignados.");
                System.out.println("6. Salir.");
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
                case 4: {
                    if (ready == true) {
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 5: {
                    if (ready == true) {
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                
                default:
                    System.out.println("Debes elegir una opcion del 1 al 6");
            }
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un número.");
                input.nextLine();
            } 
            
        } while (eleccionMenu != 6); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }
    
    public static void aparcarAutobus(Map mapa, HashMap[] plazas) {
         Scanner input = new Scanner(System.in);
         System.out.println("¿En que plaza quiere aparcar?");
         int pos = input.nextInt();
         System.out.println("Introduzca los datos del autobús:");
         System.out.println("Matrícula:");
         String Matricula = input.nextLine();
         System.out.println("DNI del conductor:");
         String DNI = input.nextLine();
         System.out.println("Nombre del conductor:");
         String Nombre = input.nextLine();
    }
    
    public static String pedirString() {
        Scanner input = new Scanner(System.in);
        String e = input.nextLine();
        return e;
    }

    public static void main(String[] args) {
        Map<String,Conductor> mapa = new HashMap<>();
        HashMap[] plazas = new HashMap[6];
        menu(mapa, plazas);
    }
    
}
