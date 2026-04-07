package tema11ej9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Tema11Ej9 {

    public static void menu(Set<Sorteo> sorteos) { //Metodo principal que enseña al usuario las opciones y controla excepciones.
        int eleccionMenu = -1; //Atributos para controlar excepciones y elegir opciones.
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");//Las opciones del menu separadas por barras y controladas con un trycatch.
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Realizar sorteo.");
                System.out.println("2. Repetir sorteo.");
                System.out.println("3. Mostrar sorteos del mes actual.");
                System.out.println("4. Mostrar sorteo dada una fecha.");
                System.out.println("5. Realizar sorteo por fecha.");
                System.out.println("6. Mostrar todos los sorteos.");
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

    public static void añadirSorteo(Set<Sorteo> sorteos) {
        Iterator<Sorteo> it = sorteos.iterator();
        boolean sorteoYaHecho = false;
        Sorteo aux;
        while (it.hasNext() && sorteoYaHecho == false) {
            aux = it.next();
            if (aux.getFecha() == LocalDate.now()) {
                System.out.println("ERROR:    Solo se puede hacer un sorteo al día");
                sorteoYaHecho = true;
            }
        }

        if (sorteoYaHecho == false) {
            Sorteo nuevoSorteo = new Sorteo(LocalDate.now());
            int[] numerosSorteo = new int[4];
            for (int i = 0; i < numerosSorteo.length; i++) {
                numerosSorteo[i] = (int) (Math.random() * 100) + 1;
            }
            nuevoSorteo.setNumerosGanadores(numerosSorteo);
            sorteos.add(nuevoSorteo);
        }
    }
    
    public static void repetirSorteo(Set<Sorteo> sorteos) {
        Iterator<Sorteo> it = sorteos.iterator();
        Sorteo aux;
        boolean encontrado = false;
        while (it.hasNext() && encontrado == false) {
            aux = it.next();
            if (aux.getFecha() == LocalDate.now()) {
                sorteos.remove(aux);
                añadirSorteo(sorteos);
                encontrado = true;
            }
        }
        if(encontrado == false) {
            System.out.println("ERROR: No se ha hecho ningun sorteo hoy");
        } else {
        }
    }
    
    public static void verSorteosDelMes(Set<Sorteo> sorteos) {
        Iterator<Sorteo> it = sorteos.iterator();
        Sorteo aux;
        LocalDate tiempoAhora =  LocalDate.now();
        while (it.hasNext()) {
            aux = it.next();
            if (tiempoAhora.getMonth() == aux.getFecha().getMonth()) {
                aux.toString();
            }
        }
    }
    
    public static void verSorteosDadaUnaFecha(Set<Sorteo> sorteos) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
        LocalDate fechaDada = null;
        System.out.println("Introduzca una fecha. (yyyy/mm/dd)");
        String fecha = input.nextLine();
        fechaDada = fechaDada.parse(fecha, formatter);
         Iterator<Sorteo> it = sorteos.iterator();
        Sorteo aux;
        boolean encontrado = false;
        while (it.hasNext() && encontrado == false) {
            aux = it.next();
            if(aux.getFecha() == fechaDada) {
                System.out.println(aux.toString());
            }
        }
        
    }

    public static void main(String[] args) {
        Set<Sorteo> sorteos = new TreeSet<>();
        menu(sorteos);
    }

}
