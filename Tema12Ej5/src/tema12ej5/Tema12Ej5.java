package tema12ej5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tema12Ej5 {

    public final static String FICHERO = "agenda.txt";

    public static void menu(Scanner input, ArrayList<Contacto> contactos) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Añadir un contacto al fichero.");
                System.out.println("2. Mostrar el fichero.");
                System.out.println("3. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                input.nextLine();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        añadirContactoAFichero(contactos, input);
                    }
                    case 2 -> {
                        leerFichero(contactos,FICHERO);                       
                    }
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default ->
                        System.out.println("Debes elegir una opcion del 1 al 3");
                }
                //Try catch con todos los errores con su respuesta correspondiente
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

    public static void añadirContacto(ArrayList<Contacto> contactos, Scanner input) throws InputMismatchException {
        String nombre;//Cogemos todos los datos del contacto en variables
        System.out.println("Escriba el nombre del contacto.");
        nombre = pedirString(input);
        System.out.println("Escriba la edad del contacto.");
        String edad = pedirString(input);
        System.out.println("Escriba el numero de telefono");
        String numero = pedirString(input);
        Contacto nuevoContacto = new Contacto(nombre, edad, numero);//Los guardamos en un contacto nuevo y lo añadimos al arrayList
        contactos.add(nuevoContacto);
    }

    public static void escribirFichero(ArrayList<Contacto> contactos) throws FileNotFoundException, IOException {
        Contacto aux;
        try (
                FileWriter fw = new FileWriter(FICHERO); //Escribimos el fichero itirerando sobre el arrayList
                PrintWriter pw = new PrintWriter(fw);
                ) {
            Iterator<Contacto> it = contactos.iterator();
            while (it.hasNext()) {
                aux = it.next();
                pw.println(aux.getNombre()+ ";");
                pw.println(aux.getEdad()+ ";");
                pw.println(aux.getNumero()+ ";");
            }
        }
    }

    public static void leerFichero(ArrayList<Contacto> contactos, String FICHERO) throws IOException {
        try (
                FileReader fr = new FileReader(FICHERO); BufferedReader br = new BufferedReader(fr);) { //Leemos el fichero remplazando ; con nada para que sea mas facil leer
            String linea = br.readLine();

            while (linea != null) {
                linea = linea.replace(";", "");
                System.out.println(linea);

                linea = br.readLine();
            }
        }
    }
    
    public static void añadirContactoAFichero(ArrayList<Contacto> contactos, Scanner input) throws FileNotFoundException, IOException { //Como dice el nombre del método...
        añadirContacto(contactos,input);
        escribirFichero(contactos);
    }

    public static String pedirString(Scanner input) {
        String string = input.nextLine();
        return string;
    }

    public static int pedirInt(Scanner input) {
        while (true) {
            try {
                int val = input.nextInt();
                input.nextLine();
                return val;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList();
        menu(input, contactos);
    }

}
