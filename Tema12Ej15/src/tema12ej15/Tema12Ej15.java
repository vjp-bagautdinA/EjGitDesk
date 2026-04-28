package tema12ej15;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema12Ej15 {
    
    public static void menu() { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        Scanner input = new Scanner(System.in);
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Añadir un contacto al fichero.");
                System.out.println("2. Mostrar fichero.");
                System.out.println("3. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = pedirInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        añadirContactoAFichero();
                    }
                    case 2 -> {
                        mostrarFichero();
                    }
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default ->
                        System.out.println("ERROR: Debes elegir una opcion del 1 al 3");
                }
                //Try catch con todos los errores con su respuesta correspondiente
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un número sin letras o simbolos.");
                input.nextLine();
            } catch (FileNotFoundException t) {
                System.out.println("ERROR: Archivo no encontrado");
            } catch (EOFException f) {
                System.out.print("");
            } catch (IOException r) {
                System.out.println("ERROR: Error con el archivo " + r.getMessage());
            } 

        } while (eleccionMenu != 3); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }
    
    public static void añadirContactoAFichero() throws FileNotFoundException, IOException {
        System.out.println("Introduzca el nombre.");
        String nombre = pedirString();
        System.out.println("Indique la edad.");
        int edad = pedirInt();
        System.out.println("Indique el numero.");
        String numero = pedirString();
        try (
        FileOutputStream fos = new FileOutputStream("agenda.bin");
        DataOutputStream dos = new DataOutputStream(fos);) {
            dos.writeUTF(nombre);
            dos.writeInt(edad);
            dos.writeUTF(numero);
        }
        
    }
    
    public static void mostrarFichero() throws FileNotFoundException, IOException, EOFException {
        try (
        FileInputStream fis = new FileInputStream("agenda.bin");
        DataInputStream dis = new DataInputStream(fis)) {
            while (true) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readUTF());
            }
        }
    }
    
    public static int pedirInt() {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        input.nextLine();
        return v;
    }
    
    public static String pedirString() {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        return string;
    }

    public static void main(String[] args) {
        menu();
    }
    
}
