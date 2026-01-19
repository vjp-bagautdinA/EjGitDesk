package tema7ej14;
//@author alumno
import java.util.InputMismatchException;
import java.util.Scanner;


public class Tema7Ej14 {
    
    public static int[][] rellenarTemperaturas(int[][] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0;i < array.length;i++) {
            for (int j = 0;j < array[i].length;j++) {
                System.out.println("Introduce un valor para la posicion [" + i+j + "] :");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    
    public static void menu() {
        int eleccionMenu = -1;
        boolean ready;
        int[][] array = new int[4][7];
        Scanner input = new Scanner(System.in);
        do {
            try {
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Rellenar las temperaturas.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Dia o dias mas calurosos del mes.");
            System.out.println("5. Salir del programa.");
            eleccionMenu = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();            }
            if (eleccionMenu < 1 && eleccionMenu > 5) {
                System.out.println("Debe introducir un numero del 1 al 7");
                eleccionMenu = 0;
            }
            switch (eleccionMenu) {
                case 1: {
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready = true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready = true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 4: {
                    if (ready = true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
            }
        }while (eleccionMenu != 5);
        
    }

    public static void main(String[] args) {
        menu();
    }
    
}
