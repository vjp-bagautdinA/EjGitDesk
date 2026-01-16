package tema7ej5;
//@author alumno
import java.util.Scanner;//Importamos scanner
public class Tema7Ej5 {
    
    public static void rellenarArray(int[][] array) {//Metodo que pregunta al usuario cada valor que va dentro de la matriz
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <4;i++){
            for (int j = 0; j<2;j++) {
                System.out.println("Introduzca un valor");
                array[i][j] = input.nextInt();
            }
        }
}
    public static void mostrarArray(int[][] array) {//Metodo base que muestra la matriz
        for (int i = 0; i <4;i++){
            for (int j = 0; j<2;j++) {
                System.out.println("    ["+i+j+"]-->"+array[i][j]);
        }
            System.out.println("\n");
    }
        
    }
    
    public static void arrayMayor(int[][] array) {//Metodo que compara un auxiliar que empieza en el [0][0] a todos los demas y se actualiza con el mayor y al final se imprime
        int aux = array[0][0];
        for (int i = 0; i <4;i++){
            for (int j = 0; j<2;j++) {
                if (aux < array[i][j]) {
                    aux = array[i][j];
                }
            }
        }
        System.out.println("El valor mayor de la matriz es: "+aux);
    }
    
    public static void arrayMenor(int[][] array) {//Lo mismo que el anterior pero esta vez buscamos el numero menor
        int aux = array[0][0];
        for (int i = 0; i <4;i++){
            for (int j = 0; j<2;j++) {
                if (aux > array[i][j]) {
                    aux = array[i][j];
                }
            }
        }
        System.out.println("El valor menor de la matriz es: "+aux);
    }
    
    public static void sumaArray(int[][] array) {//Metodo que suma todos los elementos de la matriz con ayuda de un auxialiar
        int aux = 0;
         for (int i = 0; i <4;i++){
            for (int j = 0; j<2;j++) {
                aux = aux + array[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+aux);
    }

    public static void main(String[] args) {
        
        int array[][] = new int[4][2];//Inicializamos matriz para usarla como parametro
        rellenarArray(array);
        mostrarArray(array);//Llamar a los metodos
        arrayMayor(array);
        arrayMenor(array);
        sumaArray(array);
    }
    
}
