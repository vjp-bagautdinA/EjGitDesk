package tema7ej15;
//@author alumno
import java.util.Scanner;
import java.util.InputMismatchException;
public class Tema7Ej15 {
    
    public static int[] rellenarArray() {
        int[] array = new int[12];
        
        for (int i = 0; i <=11; i++) {
            array[i] = (int)(Math.random() * 91) + 10;
        }
        return array;
    }
    
    public static void menu() {
        int eleccionMenu = -1;
        Scanner input = new Scanner(System.in);
        do {
            try {
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches mensuales.");
            System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
            System.out.println("3. Mostrar las ventas introducidas al revés.");
            System.out.println("4. Mostrar la suma total de ventas del año.");
            System.out.println("5. Mostrar las ventas totales de los meses pares.");
            System.out.println("6. Mostrar el mes con mas ventas.");
            System.out.println("7. Salir del programa.");
            eleccionMenu = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Debe ser un numero.");
                input.nextLine();            }
            if (eleccionMenu < 1 && eleccionMenu > 7) {
                System.out.println("Debe introducir un numero del 1 al 7");
                eleccionMenu = 0;
            }
            switch (eleccionMenu) {
                case 1: {
                    rellenarArray();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
            }
        }while (eleccionMenu != 7);
        
    }

    public static void main(String[] args) {
        menu();        
    }
    
}
