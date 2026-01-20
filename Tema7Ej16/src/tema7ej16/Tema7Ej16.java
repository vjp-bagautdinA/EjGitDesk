package tema7ej16;
//@author alumno

import java.util.InputMismatchException;
import java.util.Scanner;


public class Tema7Ej16 {
    
    public static void menu() {//Muestra el menu hasta que se salga del programa y protege contra inputMismatch
        int eleccionMenu = -1;
        boolean ready = false;
        int[][] array = new int[6][4];
        Scanner input = new Scanner(System.in);
        do {
            try {
            System.out.println();
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas en el punto anterior.");
            System.out.println("3. Mostrar el alumno con la mejor media de la clase.");
            System.out.println("4. Mostrar el alumno con mas suspensos.");
            System.out.println("5. Mostrar las ventas totales de los meses pares.");
            System.out.println("6. Mostrar el mes con mas ventas.");
            System.out.println("7. Salir del programa.");
            System.out.println();
            eleccionMenu = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();            }
            if (eleccionMenu < 1 && eleccionMenu > 6) {
                System.out.println("Debe introducir un numero del 1 al 6");
                eleccionMenu = 0;
            }
            switch (eleccionMenu) {
                case 1: {
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready == true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready == true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 4: {
                    if (ready == true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 5: {
                    if (ready == true) {
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }

            }
        }while (eleccionMenu != 6);
        
    }
    
    public static int[][] rellenarMatriz(int [][] array) {
        Scanner input = new Scanner(System.in);
    for (int i = 0;i <=5;i++) {
        System.out.println("NOTAS DEL ALUMNO" + (i+1) + ":");
        for (int j = 0;j <=3;i++) {
            array[i][j] = input.nextInt();
        }
    }
    return array;
    
    public static void mostrarMatriz 
}

    public static void main(String[] args) {
        menu();
    }
    
}
