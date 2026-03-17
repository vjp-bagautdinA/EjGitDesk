package tema11ej3;

public class Conductor {
    
    //Atributos
    private String DNI;
    private String Nombre;
    
    //Constructores

    public Conductor(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }
    public Conductor() {
        this.DNI = "";
        this.Nombre = "";
        
        //Getter y setters
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    //toString

    @Override
    public String toString() {
        return "Conductor{" + "DNI=" + DNI + ", Nombre=" + Nombre + '}';
    }
    
}
