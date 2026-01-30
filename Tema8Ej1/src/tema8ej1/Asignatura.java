  package tema8ej1;
//@author alumno

public class Asignatura {
    //Atributos
    private String nombre;
    private double nota;
    
    //Constructores
    
    public Asignatura() {
        this.nombre ="";
        this.nota = 0;
    }

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    } 
}
