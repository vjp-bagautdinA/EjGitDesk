package tema3ej12;
//@author alumno
public class Tema3Ej12 {
    public static void main(String[] args) {
        int i=11; //Empezamos la variable en 11 y aumentamos por 1 cada vez que se repite el bucle
        do {
            if (i%2 == 0) { //Comprobamos si el numero es par, si lo es lo imprimimos
                System.out.println(i);
            }
        i++;}
        while (i <= 133); //Ponemos como condicion que i llegue a 133
        
    }
    
}