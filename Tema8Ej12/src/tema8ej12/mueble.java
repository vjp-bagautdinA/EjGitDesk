package tema8ej12;
//@author alumno

public class mueble {
    //Atributos
    private int precio;
    private String descripcion;
    //Constructores
    
    public mueble() {
        this.precio = 0;
        this.descripcion = "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Expedita sint placeat eius perferendis assumenda atque itaque rerum debitis.";
    }

    public mueble(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public mueble(int precio) {
        this.precio = precio;
        this.descripcion = "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Expedita sint placeat eius perferendis assumenda atque itaque rerum debitis.";
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "muebles{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    } 
}
