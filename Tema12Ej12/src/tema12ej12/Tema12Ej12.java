package tema12ej12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tema12Ej12 {
    
    public final static String PARES = "pares.txt";
    public final static String IMPARES = "impares.txt";
    
    public static void leerYEscribirFichero() throws IOException, FileNotFoundException {
        try (
            BufferedReader brPares = new BufferedReader(new FileReader(PARES));
            BufferedReader brImpares = new BufferedReader(new FileReader(IMPARES));
            PrintWriter pw = new PrintWriter(new FileWriter("resultados.txt"))) {
            
            String lineaPares = brPares.readLine();
            String lineaImpares  = brImpares.readLine();
            
            while (lineaPares != null && lineaImpares != null) {
                int numPar = Integer.parseInt(lineaPares.trim());
                int numImpar = Integer.parseInt(lineaImpares.trim());
                int suma = numPar + numImpar;
                
                pw.println(suma + ";");
                
                lineaPares = brPares.readLine();
                lineaImpares = brImpares.readLine();
            }
        }
        System.out.println("Archivo terminado.");
    }

    public static void main(String[] args) {
        try {
        leerYEscribirFichero();
    } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
    } catch (IOException r) {
            System.out.println("Error con el archivo "+r.getMessage());
    }
    }
}
