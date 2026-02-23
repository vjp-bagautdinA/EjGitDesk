package tema8ej6;

public class Empleado {
    //Atributos
    private String nombre;
    private int horas;
    private double tarifaNormal = 15;
    private double tarifaExtra = 22.5;
    private double sueldo;
    //Constructores
    
    public Empleado() {
        this.nombre = null;
        this.horas = 0;
    }

    public Empleado(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
    //Getters y Setters

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifaNormal() {
        return tarifaNormal;
    }

    public void setTarifaNormal(double tarifaNormal) {
        this.tarifaNormal = tarifaNormal;
    }

    public double getTarifaExtra() {
        return tarifaExtra;
    }

    public void setTarifaExtra(double tarifaExtra) {
        this.tarifaExtra = tarifaExtra;
    }
    //ToString

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifaNormal=" + tarifaNormal + ", tarifaExtra=" + tarifaExtra + '}';
    }
    
    
}
