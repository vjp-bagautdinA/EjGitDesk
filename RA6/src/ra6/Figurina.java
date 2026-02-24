package ra6;

import java.util.Scanner;

public class Figurina {

    //Atributos
    private String nombre;
    private double valor;
    private String colección;
    //Constructores

    public Figurina(String nombre, double valor, String colección) {
        this.nombre = nombre;
        this.valor = valor;
        this.colección = colección;
    }

    public Figurina() {
        this.nombre = "";
        this.valor = 0;
        this.colección = "";
    }
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getColección() {
        return colección;
    }

    public void setColección(String colección) {
        this.colección = colección;
    }

    //Metodos
    public static Figurina[][] rellenarVitrina() {
        Figurina[][] figurinas = new Figurina[3][3];
        Scanner input = new Scanner(System.in);
        double valor;
        String nombre, colección;
        for (int i = 0; i < figurinas.length; i++) {
            for (int j = 0; j < figurinas[i].length; j++) {
                System.out.println("Introduzca los datos de la figura en el " + (i + 1) + " estante, " + (j + 1) + " compartimento.");
                System.out.println("Nombre:");
                nombre = input.next();
                System.out.println("Valor:");
                valor = input.nextDouble();
                System.out.println("Colecci\u00f3n:");
                colección = input.next();
                figurinas[i][j] = new Figurina(nombre, valor, colección);
                
            }
        }
        return figurinas;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Valor: " + valor + ", Colección: " + colección + '.';
    }
}
