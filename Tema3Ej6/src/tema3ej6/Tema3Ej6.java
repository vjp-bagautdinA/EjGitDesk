package tema3ej6;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        int nota;
        System.out.println("Introduzca tu nota del 1 al 10");
        nota = entrada.nextInt(); //Introduzco una variable int dada por el usuario
        
        switch (nota) { //Compruebo cada posible caso que el numero puede ser y lo relaciono con su resultado correspondiente
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Estas suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Estas aprobado");
                break;
            case 7:
            case 8:
                System.out.println("Tienes un notable");
                break;
            case 9:
            case 10:
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                System.out.println("El numero es invalido"); //Si el numero no esta entre 0 y 10 no es valido, por lo que pongo un default
            
              
            
                    
        }
    }
    
}
