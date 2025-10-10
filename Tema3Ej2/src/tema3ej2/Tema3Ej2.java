package tema3ej2;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
        int resultado;
        System.out.println("Por favor, introduzca un número");
        int numero1 = entrada.nextInt();
        System.out.println("Por favor, introduzca un segundo número");
        int numero2 = entrada.nextInt();//Introducimos dos variables int dadas por el usuario y la variable resultado
        if (numero1 > 10) { //Comprobamos si el primer numero es mayor de 10, si lo es la variable resultado es el producto de los dos numeros
            resultado = numero1*numero2;
            System.out.println("La operacion que se realizo fue un producto y el resultado es "+resultado);            
        }else {
            resultado = numero1+numero2;//Si no lo es la variable resultado es la suma y se pone en el sout correspondiente
            System.out.println("La operacion que se realizo fue una suma y el resultado es "+resultado);
        }
    }   
}

