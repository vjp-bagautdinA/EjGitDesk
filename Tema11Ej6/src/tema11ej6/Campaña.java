package tema11ej6;

import java.util.HashSet;
import java.util.Set;



public class Campaña {
    
    //Atributos
    private Set<String> donaciones = new HashSet<>();
    private String nombre;
    
    //Constructores

    public Campaña(String nombre) {
        this.nombre = nombre;
    }
    
    public Campaña() {
        this.nombre = "";
    }
}
