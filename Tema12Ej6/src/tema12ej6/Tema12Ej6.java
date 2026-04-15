package tema12ej6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema12Ej6 {

    public static void menu(int[] numerosPrimos, String nombreFichero, Scanner input) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Escribir los 100 primeros numeros primos en un fichero.");
                System.out.println("2. Mostrar fichero.");
                System.out.println("3. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                input.nextLine();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        ready = true;
                        numerosPrimos = crearArray(numerosPrimos);
                        nombreFichero = escribirFichero(numerosPrimos, input);
                    }
                    case 2 -> {
                        if (ready == true) {
                            leerFichero(nombreFichero);
                        } else {
                            System.out.println("ERROR: Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default ->
                        System.out.println("ERROR: Debes elegir una opcion del 1 al 3");
                }
                ////Try catch con todos los errores con su respuesta correspondiente
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un número sin letras o simbolos.");
                input.nextLine();
            } catch (FileNotFoundException r) {
                System.out.println("ERROR: No se ha encontrado el archivo");
                input.nextLine();
            } catch (IOException t) {
                System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
                input.nextLine();
            } catch (Exception f) {
                System.out.println("ERROR DESCONOCIDO");
                input.nextLine();
            }

        } while (eleccionMenu != 3); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static int[] crearArray(int[] numerosPrimos) { //Creamos el array de 100 numeros primos y lo devolvemos
        int j = 0;
        for (int i = 2; i <= 200; i = i + 2) {
            numerosPrimos[j] = i;
            j++;
        }
        return numerosPrimos;
    }

    public static String escribirFichero(int[] numerosPrimos, Scanner input) throws IOException { //Escribimos el fichero con el nombre que nos da el usuario y devolvemos el nombre
        System.out.println("Escribe el nombre del fichero en el que quieres guardar los numeros");
        String nombreFichero = input.nextLine();
        try (
                FileWriter fw = new FileWriter(nombreFichero+ ".txt"); PrintWriter pw = new PrintWriter(fw);) {
            for (int i = 0; i < numerosPrimos.length; i++) {
                pw.println(numerosPrimos[i]+ ";");
            }
        }
        nombreFichero = nombreFichero+".txt";
        return nombreFichero;       
    }
    
    public static void leerFichero(String nombreFichero) throws IOException { //Leemos el archivo 
        try (
                FileReader fr = new FileReader(nombreFichero);
                BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            while (linea != null) {
                linea = linea.replace(";", "");
                System.out.println(linea);

                linea = br.readLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numerosPrimos = new int[100];
        String nombreFichero = null;
        menu(numerosPrimos, nombreFichero, input);
    }

}
