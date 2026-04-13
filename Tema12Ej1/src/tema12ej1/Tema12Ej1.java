package tema12ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tema12Ej1 {
    
    public static void menu(ArrayList<Contacto> contactos, Scanner input) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Añadir un contacto.");
                System.out.println("2. Ver lista de contactos..");
                System.out.println("3. Eliminar un contacto.");
                System.out.println("4. Ver contactos ordenador por edad.");
                System.out.println("5. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                input.nextLine();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                case 1 ->  añadirContacto(contactos, input);
                case 2 ->  verContactos(contactos);
                case 3 ->  eliminarContacto(contactos, input);
                case 4 ->  mostrarContactosPorEdad(contactos);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Debes elegir una opcion del 1 al 5");
            }
                //Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número sin letras o simbolos.");
                input.nextLine();
            } 
            
        } while (eleccionMenu != 5); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }
    
    public static void añadirContacto(ArrayList<Contacto> contactos, Scanner input) throws InputMismatchException {
        System.out.println("Escriba el nombre del contacto.");
        String nombre = pedirString(input);
        System.out.println("Escriba la edad del contacto.");
        int edad = pedirInt(input);
        System.out.println("Escriba el numero de telefono");
        String numero = pedirString(input);
        Contacto nuevoContacto = new Contacto(nombre,edad,numero);
        contactos.add(nuevoContacto);
        System.out.println("El contacto ha sido añadido.");
    }
    
    public static void verContactos(ArrayList<Contacto> contactos) {
        Iterator<Contacto> it = contactos.iterator();
        Contacto aux;
        System.out.println("Lista de contactos:");
        while(it.hasNext()) {
            aux = it.next();
            System.out.println(aux.toString());
        }
    }
    
    public static void eliminarContacto(ArrayList<Contacto> contactos, Scanner input) throws InputMismatchException {
        System.out.println("Escriba el numero de telefono del contacto que quiera eliminar.");
        String numero = pedirString(input);
        boolean encontrado = false;
        Iterator<Contacto> it = contactos.iterator();
        Contacto aux;
        while(it.hasNext() && encontrado == false) {
            aux = it.next();
            if (aux.getNumero().equals(numero)) {
                it.remove();
                encontrado = true;
                System.out.println("El contacto ha sido eliminado.");
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha podido encontrar un contacto con ese numero.");
        }
    }
    
    public static void mostrarContactosPorEdad(ArrayList<Contacto> contactos) {
        contactos.sort(Comparator.comparingInt(Contacto::getEdad));
        verContactos(contactos);
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
        ArrayList<Contacto> contactos = new ArrayList();
        Scanner input = new Scanner(System.in);
        menu(contactos, input);
    }
    
}
