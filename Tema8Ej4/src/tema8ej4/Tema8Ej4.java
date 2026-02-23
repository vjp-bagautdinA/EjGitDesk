package tema8ej4;

import java.util.Arrays;

public class Tema8Ej4 {

    public static void main(String[] args) {
        String[] arrayChar = new String[6];
        Arrays.fill(arrayChar,0,3,"a");
        Arrays.fill(arrayChar,3,6,"b");
        System.out.println(Arrays.toString(arrayChar));
    }
    
}
