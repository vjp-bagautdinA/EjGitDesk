package tema4ej9;
//@author alumno
import java.util.Scanner;
public class Tema4Ej9 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;//inicializimos y declaramos las variables
        int n3 = 0;
        n1 = input.salida(n1);
        n2 = input.salida(n2);//Llamamos al primer metodo tres veces para pedir tres numeros
        n3 = input.salida(n3);
        input.menor(n1, n2, n3, n3);//Llamamos al otro para imprimir el menor
    }
    
}
