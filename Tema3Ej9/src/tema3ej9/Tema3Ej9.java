package tema3ej9;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Por favor, introduca el primer número:");
        int n1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo número:");
        int n2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número");
        int n3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto número");
        int n4 = entrada.nextInt();//Introduzco 4 variables int dadas por el usuario
        int aux;//Auxiliar
        if(n1>n2){aux=n1;n1=n2;n2=aux;}//Compruebo si el primer numero es mayor que el segundo, si lo es
        if(n1>n3){aux=n1;n1=n3;n3=aux;}
        if(n1>n4){aux=n1;n1=n4;n4=aux;}
        if(n2>n3){aux=n2;n2=n3;n3=aux;}
        if(n2>n4){aux=n2;n2=n4;n4=aux;}
        if(n3>n4){aux=n3;n3=n4;n4=aux;}
        System.out.println("El orden de los números introducidos es el "+n1+"-"+n2+"-"+n3+"-"+n4);
        
        }
        
        
    }
    

