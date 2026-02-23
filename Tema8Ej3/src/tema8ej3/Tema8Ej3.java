package tema8ej3;

import java.util.Arrays;

public class Tema8Ej3 {

    public static void main(String[] args) {
        int[] array = new int [30];
        Arrays.fill(array,0,10,0);
        Arrays.fill(array,10,20,1);
        Arrays.fill(array,20,30,5);
        System.out.println(Arrays.toString(array));
    }
    
}
