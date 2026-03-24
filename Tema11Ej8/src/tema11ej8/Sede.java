package tema11ej8;

public class Sede {

    //Atributos
    private String nombre;
    private float ingresos;

    //Constructores
    public Sede(String nombre, float ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    //toString
    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }

}
