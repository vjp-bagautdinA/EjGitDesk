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
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length;i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void printReverseArray(int[] array) {
        int[] reverseArray = new int [array.length];
        
        for (int i = 0; i < array.length;i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        for (int j = 0; j < reverseArray.length;j++) {
            System.out.println(reverseArray[j]);
        }
    }
    
    public static void printSumaArray(int[] array) {
        int suma = 0;
        
        for (int i = 0;i < array.length;i++) {
            suma = suma + array[i];
        }
        System.out.println("La suma de las ventas es: "+suma);
    }
    
    public static void ventasMesesPares(int[] array) {
        
        for (int i = 1;i < array.length ;i = i + 2) {
            System.out.println(array[i]);
        }
    }
    
    public static void mesMayorVentas(int[] array) {
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int mayor = 0;
        int mes = 0;
        for (int i = 0;i <array.length;i++) {
            if (array[i]> mayor) {
                mayor = array[i];
                mes = i;
            }
            System.out.println("El mes con el mayor numero de ventas es: "+meses[mes]+" con "+mayor+" ventas");
        }
    }
    
    public static void menu() {
        int eleccionMenu = -1;
        boolean ready;
        int[] array = new int[12];
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
                    array = rellenarArray();
                    ready = true;
                    break;
                }
                case 2: {
                    if (ready = true) {
                    printArray(array);
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 3: {
                    if (ready = true) {
                    printReverseArray(array);
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 4: {
                    if (ready = true) {
                    printSumaArray(array);
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 5: {
                    if (ready = true) {
                    ventasMesesPares(array);
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
                case 6: {
                    if (ready = true) {
                    mesMayorVentas(array);
                    }else {
                        System.out.println("Para usar esta opcion debe usar la opcion 1 primero.");
                    }
                    break;
                }
            }
        }while (eleccionMenu != 7);
        
    }

    public static void main(String[] args) {
        menu();        
    }
    
}
