package tema12ej12bis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tema12Ej12bis {

    public static final String FICHERO = "masnumeros.txt";

    public static void leerFichero() throws FileNotFoundException, IOException {
        double sumaTotal = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] numeros = linea.split(";");

                for (String numStrings : numeros) {
                    if (!numStrings.isEmpty()) {
                        try {
                            // Convert the string to a number and add it to the total
                            sumaTotal += Double.parseDouble(numStrings);
                        } catch (NumberFormatException e) {
                            // Handle cases where a value isn't a valid number
                            System.out.println("Warning: '" + numStrings + "' is not a valid number and was skipped.");
                        }
                    }
                }
            }
        }
        System.out.println(sumaTotal);
    }

    public static void main(String[] args) {
        try {
            leerFichero();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException r) {
            System.out.println("Error con el archivo " + r.getMessage());
        }
    }

}
