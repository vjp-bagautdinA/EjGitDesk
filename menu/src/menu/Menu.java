package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    
    public static void menu() {
        int eleccionMenu = -1;
        boolean ready = false;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("-------------------------------------");
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. .");
                System.out.println("2. .");
                System.out.println("3. .");
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
            }
        } while (eleccionMenu != 4);

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
