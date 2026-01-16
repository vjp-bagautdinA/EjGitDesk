package tema7ej4;
//@author alumno

public class Tema7Ej4 {
    
    public static void rellenarArray(int[][] array) { //Metodo para rellenar el array con valores usando bucles
        for (int i = 0; i <4;i++){
            for (int j = 0; j<3;j++) {
                array[i][j] = (int) (Math.random() * 101 + 100);// Funcion math.random para generar numeros y meterlos en la matriz
            }
        }
    }
    
    public static void mostrarArray(int[][] array) {//Metodo normal para mostrar la matriz
        for (int i = 0; i <4;i++){
            for (int j = 0; j<3;j++) {
                System.out.println("    ["+i+j+"]-->"+array[i][j]);
            }
            System.out.println("\n");
        }
    }
    
    public static void mostrarArrayPares(int[][] array) {//Metodo que muestra la matriz pero con if para filtrar solo los pares
        for (int i = 0; i <4;i++){
            for (int j = 0; j<3;j++) {
                if (array[i][j] % 2 == 0) {
                System.out.println("    ["+i+j+"]-->"+array[i][j]);
                }
    }
            }
            System.out.println("\n");
        }
    

    public static void main(String[] args) {
        int array [][] = new int [4][3];//Inicializamos matriz para usarla como parametro
        rellenarArray(array);//Llamar a los metodos
        mostrarArray(array);
        mostrarArrayPares(array);
    }
    
}
