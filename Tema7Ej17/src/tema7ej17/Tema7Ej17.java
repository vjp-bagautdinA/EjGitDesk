package tema7ej17;
public class Tema7Ej17 {
    
    public static void rellenarArray(int[] array) {
        for (int i = 0;i<array.length;i++) {
            array[i] = (int) (Math.random()*10);
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
    
    public static void mayorAMenor(int[] array) {
        int aux;
        
        for(int i = 0;i < array.length;i++) {
            for(int j = 0;j < array.length - 1;j++) {
                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        printArray(array);
        mayorAMenor(array);
        printArray(array);       
    }
    
}
