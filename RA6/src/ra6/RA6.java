package ra6;

import java.util.InputMismatchException;
import java.util.Scanner;
import static ra6.Figurina.rellenarVitrina;

public class RA6 {

    public static void menu() {
        int eleccionMenu = -1;
        Figurina[][] figurinas = new Figurina[3][3];
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Rellenar la vitrina.");
                System.out.println("2. Mostrar figurinas de una colección.");
                System.out.println("3. Mostrar figura mas valiosa.");
                System.out.println("4. Salir.");
                System.out.println("-------------------------------------");
                eleccionMenu = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();
            }
            if (eleccionMenu < 1 && eleccionMenu > 4) {
                System.out.println("Debe introducir un numero del 1 al 4");
                eleccionMenu = 0;
            }
            switch (eleccionMenu) {
                case 1: {
                    figurinas = rellenarVitrina();
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready == true) {
                        mostrarColección(figurinas);
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready == true) {
                        mostrarValioso(figurinas);
                    } else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
            }
        } while (eleccionMenu != 4);

    }

    public static void mostrarColección(Figurina[][] figurinas) {
        Scanner input = new Scanner(System.in);
        boolean figurinaEncontrada = false;
        System.out.println("Introduzca la colección deseada:");
        String aux = input.next();
        for (int i = 0; i < figurinas.length; i++) {
            for (int j = 0; j < figurinas[i].length; j++) {
                if (figurinas[i][j].getColección().equalsIgnoreCase(aux)) {
                    System.out.println(figurinas[i][j].toString());
                    figurinaEncontrada = true;
                }
            }
        }
        if (figurinaEncontrada == false) {
            System.out.println("No se ha podido encontrar ninguna figurina de esa colección");
        }
    }
    
    public static void mostrarValioso(Figurina[][] figurinas) {
        int iaux = 0,jaux = 0;
        double valoraux = 0;
        for (int i = 0; i < figurinas.length; i++) {
            for (int j = 0; j < figurinas[i].length; j++) {
                if (figurinas[i][j].getValor() > valoraux) {
                    valoraux = figurinas[i][j].getValor();
                    iaux = i;
                    jaux = j;
                }
            }
        }
        System.out.println("La figura mas valiosa esta en el estante "+(iaux+1)+ " compartimento "+(jaux+1)+ ".");
        System.out.println("Datos: "+figurinas[iaux][jaux].toString());
    }

    public static void main(String[] args) {
        menu();
    }
}
