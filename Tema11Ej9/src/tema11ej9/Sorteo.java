package tema11ej9;

import java.time.LocalDate;

public class Sorteo {
    //Atributos
    LocalDate fecha;
    int[] numerosGanadores = new int[4];
    
    //Constructores
    public Sorteo(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public Sorteo() {
        this.fecha = LocalDate.now();
    }
    
    //Getters Y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getNumerosGanadores() {
        return numerosGanadores;
    }

    public void setNumerosGanadores(int[] numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }
    
    //toString
    @Override
    public String toString() {
        return "Sorteo{" + "fecha=" + fecha + ", numerosGanadores=" + numerosGanadores + '}';
    }
    
}
