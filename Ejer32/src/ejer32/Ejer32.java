package ejer32;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Ejer32 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Por favor, indique una cantidad de dinero:");
        int cantidad = entrada.nextInt(); //Variable original de dinero dado por el usuario
        int original = cantidad;//Variable auxiliar que guarda la cantidad original de dinero
        int billetes50 = cantidad/50;//En todos estos calculos dividimos la cantidad original por la cantidad del billetes y guardamos el resto en la variable original para calcular con el siguiente hasta llegar a 0
        cantidad = cantidad%50;
        int billetes20 = cantidad/20;
        cantidad = cantidad%20;
        int billetes10 = cantidad/10;
        cantidad = cantidad%10;
        int billetes5 = cantidad/5;
        cantidad = cantidad%5;
        int monedas2 = cantidad/2;
        cantidad = cantidad%2;
        int monedas1 = cantidad;
        System.out.println(original+" euros se descomponen en "+billetes50+" billetes de 50, "+billetes20+" billetes de 20, "+billetes10+" billetes de 10, "+billetes5+" billetes de 5, "+monedas2+" monedas de 2 euros y "+monedas1+" monedas de 1 euro.");
        //Sout final con todas las variables calculadas anteriormente
                
                
                
                
                
                
                
                
                
    }
    
}
