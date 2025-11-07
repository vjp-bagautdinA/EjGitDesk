package tema4ej1;
//@author alumno
import java.util.Scanner;
public class Tema4Ej1 {
    
    public static void PosoNeg (int n){ //Metodo que, con el numero del usuario, comprueba si es postivo o negativo y lo imprime
    if (n <0) { //Check para ver si es postivo o negativo
        System.out.println("Numero es negativo");//Resultados
    }else {
        System.out.println("Numero es positivo");
    }
}
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Introduzca un numero:");//Pedimos el numero al usuario 
        n = inp.nextInt();
        Tema4Ej1.PosoNeg(n);//Llamamos al metodo
    }
    
}
