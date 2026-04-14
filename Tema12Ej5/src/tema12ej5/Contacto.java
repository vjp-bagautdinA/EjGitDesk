package tema12ej5;

public class Contacto {

    //Atributos
    private String nombre;
    private String edad;
    private String numero;

    //Constructores
    public Contacto() {
        this.nombre = null;
        this.edad = null;
        this.numero = null;
    }

    public Contacto(String nombre, String edad, String numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    //Getters Y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre: "+nombre + "\nEdad: "+ edad +"\nNumero: "+numero;
    }

}
