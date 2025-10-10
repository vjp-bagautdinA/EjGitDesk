package tema3ej7;
import java.util.Scanner;//Importo la utilidad Scanner
//@author alumno
public class Tema3Ej7 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);//Creo nuevo scanner llamado entrada
         boolean laborable;
         System.out.println("Que numero del dia de la semana es? Ej: Lunes = 1, Martes = 2");
         int diasemana = entrada.nextInt();//Introduzco una variable int dada por el usuario
         switch (diasemana) {//Compruebo si el numero es de lunes a viernes, si lo es hago un sout diciendo que se trabaja
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
             laborable = true;
             if (laborable == true) {
             System.out.println("Hoy se trabaja");
             } break;
             case 6://Si es fin de semana no se trabaja
             case 7:
             laborable =false;
             if (laborable == false) {
                  System.out.println("Hoy no se trabaja, corre al bar");
             }
            
                     
         
       
    }
    
}
}