package tema3ej1;
import java.util.Scanner;//Importo la utilidad Scanner
//author alumno
public class Tema3Ej1 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
         System.out.println("Por favor, introduzca un número"); 
         int numero = entrada.nextInt(); //Inicializo una variable cuyo valor es el input del usuario
         if (numero < 0)//Compruebo que sea menor que 0 y si lo es hago un sout diciendo que es positivo 
             System.out.println("El numero introducido es negativo");
         else//Si es mayor que 0 siempre es positivo
             System.out.println("El numero introducido es positivo");
         
         
    }
    
}
