package corelink;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Corelink {

    public static ArrayList<String> leerFichero(ArrayList<String> sospechosos) throws IOException {

        try (
                FileReader fr = new FileReader("datos_empleados.txt"); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            while (linea != null) {
                if (linea.contains("Zona Cero")) {
                    linea = linea.replace(";", "");
                    System.out.println(linea);
                    sospechosos.add(linea);
                }
                linea = br.readLine();

            }
        }
        return sospechosos;
    }

    public static void escribirFichero(ArrayList<String> sospechosos) throws IOException {
        int i = 0;
        try (
                FileWriter fw = new FileWriter("sospechosos_zona_cero.txt"); PrintWriter pw = new PrintWriter(fw);) {
            Iterator<String> it = sospechosos.iterator();
            String aux;
            while (it.hasNext()) {
                aux = it.next();
                pw.println(aux + ";");
                i++;
            }
        }
        System.out.println("Numero de empleados:" + i);
    }

    public static void leerSospechosos() throws FileNotFoundException, IOException {
        try (
                FileReader fr = new FileReader("sospechosos_zona_cero.txt"); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();

            }
        }
    }

    public static void leerCodigos() throws IOException {
        boolean numeros = false;
        try (
                FileReader fr = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt"); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();
            int i = 1;
            int j = 9;
            String aux;
            while (linea != null) {
                while (j < 7715) {
                    aux = linea.substring(i, j);
                    numeros = soloDigitos(aux);
                    if (numeros == true) {
                        System.out.println(aux);
                    }
                    i = i + 8;
                    j = j + 8;
                }
                linea = br.readLine();
            }
        }
    }
    
    public static void escribirCodigos(ArrayList<String> codigos) throws IOException {
        try (
                FileWriter fw = new FileWriter("codigos.txt"); PrintWriter pw = new PrintWriter(fw);) {
            Iterator<String> it = codigos.iterator();
            String aux;
            while (it.hasNext()) {
                aux = it.next();
                pw.println(aux + ";");
            }
        }
    }

    public static boolean soloDigitos(String aux) {
        for (int i = 0; i < aux.length(); i++) {
            if (!Character.isDigit(aux.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> sospechosos = new ArrayList();
        ArrayList<String> codigos = new ArrayList();
        FileReader fr = null;
        BufferedReader br = null;
        boolean numeros = false;
        try {
            //leerSospechosos();
            
            fr = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt");
            br = new BufferedReader(fr);
            {
                String linea = br.readLine();
                int i = 1;
                int j = 9;
                int i1 = 2;
                int j1 = 10;
                int i2 = 3;
                int j2 = 11;
                int i3 = 4;
                int j3 = 12;
                int i4 = 5;
                int j4 = 13;
                int i5 = 6;
                int j5 = 14;
                int i6 = 7;
                int j6 = 15;
                int i7 = 8;
                int j7 = 16;
                String aux, aux2, aux3, aux4, aux5, aux6, aux7, aux8;
                while (linea != null) {
                    while (j < 7717) {
                        aux = linea.substring(i, j);
                        aux2 = linea.substring(i1, j1);
                        aux3 = linea.substring(i2, j2);
                        aux4 = linea.substring(i3, j3);
                        aux5 = linea.substring(i4, j4);
                        aux6 = linea.substring(i5, j5);
                        aux7 = linea.substring(i6, j6);
                        aux8 = linea.substring(i7, j7);
                        numeros = soloDigitos(aux);
                        if (numeros == true) {
                            System.out.println(aux);
                            codigos.add(aux);
                            
                        }
                        numeros = soloDigitos(aux2);
                        if (numeros == true) {
                            System.out.println(aux2);
                            codigos.add(aux2);
                        }
                        numeros = soloDigitos(aux3);
                        if (numeros == true) {
                            System.out.println(aux3);
                            codigos.add(aux3);
                        }
                        numeros = soloDigitos(aux4);
                        if (numeros == true) {
                            System.out.println(aux4);
                            codigos.add(aux4);
                        }
                        numeros = soloDigitos(aux5);
                        if (numeros == true) {
                            System.out.println(aux5);
                            codigos.add(aux5);
                        }
                        numeros = soloDigitos(aux6);
                        if (numeros == true) {
                            System.out.println(aux6);
                            codigos.add(aux6);
                        }
                        numeros = soloDigitos(aux7);
                        if (numeros == true) {
                            System.out.println(aux7);
                            codigos.add(aux7);
                        }
                        numeros = soloDigitos(aux8);
                        if (numeros == true) {
                            System.out.println(aux8);
                            codigos.add(aux8);
                        }
                        i = i + 8;
                        j = j + 8;
                        i1 = i1 + 8;
                        j1 = j1 + 8;
                        i2 = i2 + 8;
                        j2 = j2 + 8;
                        i3 = i3 + 8;
                        j3 = j3 + 8;
                        i4 = i4 + 8;
                        j4 = j4 + 8;
                        i5 = i5 + 8;
                        j5 = j5 + 8;
                        i6 = i6 + 8;
                        j6 = j6 + 8;
                        i7 = i7 + 8;
                        j7 = j7 + 8;
                    }
                }
            }
            //escribirCodigos(codigos);
        } catch (IOException e) {
            input.nextLine();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("gv");
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException r) {
                    System.out.println("f");
                }
            }
        }
    }

}
