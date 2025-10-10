package ejer26;
import java.util.Scanner; //Importo la utilidad Scanner
//@author alumno
public class Ejer26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        System.out.println("Por favor, introduzca un número de 4 cifras:"); 
        int numeroInicial = entrada.nextInt();//Introduzco una variable cuyo valor es un numero de 4 cifras que diga el usuario
  int primeraCifra = numeroInicial/1000;
  int segundaCifra = (numeroInicial/100)%10;
  int terceraCifra = (numeroInicial/10)%10;
  int cuartaCifra = numeroInicial%10;//Estas 4 lineas son los calculos necesarios para determinar cada numero, ademas de guardar los resultados en variables que usaremos en los sout
        System.out.println("La primera cifra es: "+primeraCifra);
        System.out.println("La segunda cifra es: "+segundaCifra);
        System.out.println("La tercera cifra es: "+terceraCifra);
        System.out.println("La cuarta cifra es: "+cuartaCifra);//Al final hacemos un sout diferente para cada variable diciendo su posicion en la cifra y cual es
        
        
          
          
    }
    
}
