package tema3ej3;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno

public class Tema3Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Por favor, introduzca el primer número:");
        int numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca el segundo número");
        int numero2 = entrada.nextInt();
        System.out.println("Por último, introduzca el tercer número");
        int numero3 = entrada.nextInt();//Introduzco tres variables int dadas por el usuario
        if (numero1 > numero2 && numero1 > numero3){
        System.out.println("El número mayor de los introducidos es el "+numero1);//Compruebo si el primer numero es mayor que los otros dos y si lo es hago un sout diciendo que es el mayor
    }   else if (numero2>numero1 && numero2>numero3){
        System.out.println("El número mayor de los introducidos es el "+numero2);//Lo mismo con el segundo numero
    }   else {
            System.out.println("El número mayor de los introducidos es el "+numero3);// Si ninguno de los otros dos es el mayor se que el numero 3 lo es asi que hago sout correspondiente
        
    }
    
       
        
    
    }
    
}
