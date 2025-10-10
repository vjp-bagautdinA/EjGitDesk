package tema3ej4;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Por favor, introduzca el primer número:");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número");
        int numero2 = entrada.nextInt();
        System.out.println("Por último, introduzca el tercer número");
        int numero3 = entrada.nextInt();
        if (numero1 < numero2 && numero1 < numero3){
        System.out.println("El número menor de los introducidos es el "+numero1);
    }   else if (numero2<numero1 && numero2<numero3){
        System.out.println("El número menor de los introducidos es el "+numero2);//Lo mismo que el 3 pero comprobamos cual es el menor
    }   else {
            System.out.println("El número menor de los introducidos es el "+numero3);
        
    }
    
       
        
    
    }
    
}
