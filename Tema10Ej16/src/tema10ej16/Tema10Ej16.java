package tema10ej16;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema10Ej16 {

    public static ArrayList<Producto> menu() { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. MENÚ DE ADMINISTRACIÓN.");
                System.out.println("2. MENÚ DE COMPRA.");
                System.out.println("3. SALIR.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        menuAdministración(productos);
                        ready = true;
                    }
                    case 2 -> {
                        if (ready == true) {
                            menuCompra(productos);
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    default ->
                        System.out.println("Debes elegir una opcion del 1 al 3");
                }
                //Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un numero.");
                input.nextLine();
            }

        } while (eleccionMenu != 3); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.
        return productos;
    }

    public static void menuAdministración(ArrayList<Producto> productos) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Introducir productos en la lista.");
                System.out.println("2. Visualizar la lista de productos.");
                System.out.println("3. Eliminar productos de la lista.");
                System.out.println("4. Volver al menú principal.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        añadirProducto(productos);
                        ready = true;
                    }
                    case 2 -> {
                        if (ready == true) {
                            verLista(productos);
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    case 3 -> {
                        if (ready == true) {
                            eliminarProducto(productos);
                        } else {
                            System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                        }
                    }
                    default ->
                        System.out.println("Debes elegir una opcion del 1 al 4");
                }
                //Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un numero.");
                input.nextLine();
            }

        } while (eleccionMenu != 4); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static void menuCompra(ArrayList<Producto> productos) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Comprar productos.");
                System.out.println("2. Volver al menú principal.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
                switch (eleccionMenu) {//Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
                    case 1 -> {
                        comprarProducto(productos);
                    }
                    default ->
                        System.out.println("Debes elegir una opcion del 1 al 2");
                }
                //Dependiendo del numero dado por el usuario ejecutamos el método correspondiente.
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un numero.");
                input.nextLine();
            }

        } while (eleccionMenu != 2); //Volvemos a presentar el menu hasta que el usuario decide salir del programa.

    }

    public static void añadirProducto(ArrayList<Producto> productos) { //Metodo que pregunta el valor de los atributos de un nuevo producto(objeto) y lo añade a la lista.
        int stock;
        String nombre;
        float precio;
        boolean checkAllowed = true;
        if (productos.isEmpty()) {
            checkAllowed = false;
        }
        System.out.println("Introduzca los datos del producto:");
        nombre = pedirNombre();
        if (checkAllowed == true) {
            if (nombreCheck(productos, nombre) == true) {
                precio = pedirPrecio();
                stock = pedirStock();
                productos.add(new Producto(nombre, precio, stock));
            }
        } else {
            precio = pedirPrecio();
            stock = pedirStock();
            productos.add(new Producto(nombre, precio, stock));
        }
    }

    public static boolean nombreCheck(ArrayList<Producto> productos, String nombre) { //Check que se asegura que dos productos no puedan tener el mismo nombre.
        boolean check = true;
        int i = 0;
        boolean enc = false;
        while (enc != true) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("No puede añadir un producto con el mismo nombre que otro producto existente");
                check = false;
                enc = true;
            } else {
                i++;
            }
        }
        return check;
    }

    public static void verLista(ArrayList<Producto> productos) { //Itirera la lista y muestra el toString de cada objeto.
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("--------------------");
            System.out.println("Producto en índice " + i + ": " + productos.get(i).toString());
        }
    }

    public static void eliminarProducto(ArrayList<Producto> productos) { //Pide el nombre del producto que se quiere eliminar y luego se busca y elimina.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto que quiere eliminar:");
        String nombre = input.nextLine();
        int i = 0;
        boolean enc = false;
        while(enc != true) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(productos.get(i));
                enc = true;
            }else {
                i++;
            }
        }
    }

    public static void comprarProducto(ArrayList<Producto> productos) {
        Scanner input = new Scanner(System.in);
        int unidades = 0;
        int i = 0;
        boolean enc = false;
        System.out.println("Introduzca el nombre del producto que desea comprar");
        verLista(productos);
        String elección = input.nextLine();
        while (i < productos.size() && !enc) {
            if (productos.get(i).getNombre().equalsIgnoreCase(elección)) {
                pedirUnidades();
                enc = true;
            } else {
                i++;
            }
        }
        if (enc == true) {
            if (productos.get(i).getStock() < unidades) {
                System.out.println("Error: No hay tantas unidades disponibles, solo hay " + productos.get(i).getStock()); //Check para asegurarse que la cantidad de compra es válida.
            } else {
                productos.get(i).setStock(productos.get(i).getStock() - unidades);
                System.out.println("El importe final es " + (unidades * productos.get(i).getPrecio())); //Dice el importa final y actualiza el stock del producto
            }
        } else {
            System.out.println("Ese producto no existe, volviendo al menu...");
        }
    }

    public static float pedirPrecio() {
        Scanner input = new Scanner(System.in);
        System.out.println("Precio del producto:");
        float precio = input.nextFloat();
        return precio;
    }

    public static int pedirStock() {
        Scanner input = new Scanner(System.in);
        System.out.println("Stock del producto:");
        int stock = input.nextInt();
        return stock;
    }

    public static int pedirUnidades() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas unidades desea comprar?");
        int unidades = input.nextInt();
        return unidades;
    }

    public static String pedirNombre() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre del producto:");
        String unidades = input.next();
        return unidades;
    }

    public static void main(String[] args) {
        menu();
    }

}
