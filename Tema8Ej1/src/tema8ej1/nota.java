/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8ej1;

/**
 *
 * @author Usuario
 */
public class nota {

    //Atributos
    private String nombre;
    private float nota;

    //Constructores
    public nota() {
        this.nombre = "";
        this.nota = 0.0f;
    }

    public nota(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nota{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
