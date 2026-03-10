package tema10ej16;

public class Producto {
    //Atributos
    private String nombre;
    private float precio;
    private int stock;
    
    //Constructores
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
        
        //Getters y Setters
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //toString

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock;
    }
    
}
