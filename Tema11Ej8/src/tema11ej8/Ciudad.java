package tema11ej8;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import static tema11ej8.Tema11Ej8.pedirFloat;
import static tema11ej8.Tema11Ej8.pedirString;

public class Ciudad {

    //Atributos
    private String nombre;
    private Set<Sede> sedes;

    //Constructores
    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new LinkedHashSet<>();
    }

    //Getters Y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }

    //Metodo
    public void añadirSede() {
        do {
            System.out.println("Introduzca el nombre de la sede");
            String nombreSede = pedirString();
            System.out.println("Introduzca los ingresos de la sede");
            float ingresos = pedirFloat();
            Sede sede1 = new Sede(nombreSede, ingresos);
            sedes.add(sede1);
            System.out.println("Quieres añadir otra sede?");
        } while (pedirString().equalsIgnoreCase("si") || pedirString().equalsIgnoreCase("sí"));
    }

    public void ingresosSedes() {
        Iterator<Sede> it = sedes.iterator();
        Sede aux;
        while (it.hasNext()) {
            aux = it.next();
            aux.getIngresos();
            if (aux.getIngresos() < (mediaIngresosSedes())) {
                System.out.println(aux.getIngresos());
            }
        }
    }

    public float mediaIngresosSedes() {
        Iterator<Sede> it = sedes.iterator();
        Sede aux;
        float ingresos = 0;
        int numeroSedes = 0;
        float media = 0;
        while (it.hasNext()) {
            aux = it.next();
            ingresos = ingresos + aux.getIngresos();
            numeroSedes++;
        }
        media = ingresos/numeroSedes;
        return media;
        

    }

    //toString
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }

}
