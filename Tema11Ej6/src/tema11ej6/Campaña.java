package tema11ej6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Campaña  {
    
    //Atributos
    private Set<Donacion> donaciones;
    private String nombre;
    
    //Constructores

    public Campaña(String nombre) {
        this.nombre = nombre;
        this.donaciones = new HashSet<>();
    }
    
    public Campaña() {
        this.nombre = "";
        this.donaciones = new HashSet<>();
    }
    
    //Getters y Setters

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    
    public void añadirDonacion() {
        System.out.println("Introduzca su nombre:");
        String nombre = pedirString();
        System.out.println("Introduzca la cantidad que quiere donar");
        int cantidad = pedirInt();
        Donacion donacion = new Donacion(nombre, cantidad);
        donaciones.add(donacion);       
    }
    
    public void mostrarDonaciones() {
        System.out.println(donaciones);
    }
    
    public void mostrarDonacionesPorNombre () {
        String nombre = pedirString();
        Iterator<Donacion> it = donaciones.iterator();
        Donacion aux;
        while (it.hasNext()) {
            aux = it.next();
            if(aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(aux);
            }
        }
    }
    
    public void mostrarDonacionesTotales() {
        System.out.println(donaciones.size());
    }
    //
    
    public void mostrarDineroRecaudado() {
        Iterator<Donacion> it = donaciones.iterator();
        int dinero = 0;
        Donacion aux;
        while (it.hasNext()) {
            aux = it.next();
            dinero = dinero + aux.getCantidad();
        }
        System.out.println(dinero);
    }
    
    public void ordenar(TreeSet treeSet) {
        Iterator<Donacion> it = donaciones.iterator();
        ArrayList<Donacion> donacionesOrdenadas = new ArrayList(donaciones);
        donacionesOrdenadas.sort((donacion1,donacion2) -> Integer.compare(donacion1.getCantidad(), donacion2.getCantidad()));
    }
    
    public static String pedirString() {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        return string;
    }
    
    public static int pedirInt() {
        Scanner input = new Scanner(System.in);
        int int1 = input.nextInt();
        return int1;
    }
    
    //toString

    @Override
    public String toString() {
        return "Campa\u00f1a{" + "donaciones=" + donaciones + ", nombre=" + nombre + '}';
    }
    
}
