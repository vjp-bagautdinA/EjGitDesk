package tema12ej12bis2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tema12Ej12bis2 {
    
    public static final String FICHERO = "resultado.txt";
    
    public static void escribirCadenasEnArchivo(String[] cadenas, String FICHERO) throws FileNotFoundException, IOException{
        try (
        PrintWriter pw = new PrintWriter(new FileWriter(FICHERO))) {
            for (String nuevaCadena : cadenas) {
            pw.print(nuevaCadena + "*");
        }
        }
    }

    public static void main(String[] args) {
        String[] cadenas = {"abc","def","ghu","iok"};
        try {
            escribirCadenasEnArchivo(cadenas,FICHERO);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException r) {
            System.out.println("Error con el archivo " + r.getMessage());
        }
    }
    
}
