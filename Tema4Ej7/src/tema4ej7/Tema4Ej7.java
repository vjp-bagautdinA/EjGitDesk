package tema4ej7;
//@author alumno
import java.util.Scanner;
public class Tema4Ej7 {
    public static void MenorMayor(int num1, int num2, int num3, int num4, int aux) {//Metodo para ordenor los numeros de menor a mayor
        if(num1<num2){
         aux=num1;num1=num2;num2=aux;
     }
        if(num1<num3) {
            aux=num1;num1=num3;num3=aux;
        }
        if(num1<num4) {
            aux=num1;num1=num4;num4=aux;//Vamos comparando los valores el uno al otro y vamos cambiandolos de sitio dependiendo de su valor
        }
        if(num2<num3) {
            aux=num2;num2=num3;num3=aux;
        }
        if(num2<num4) {
            aux=num2;num2=num4;num4=aux;
        }
        if(num3<num4) {
            aux=num3;num3=num4;num4=aux;
        }
        System.out.println("El orden de menor a mayor es: "+num4+"-"+num3+"-"+num2+"-"+num1);//Imprimimos los numeros ordenados
    }
    public static void main(String[] args) {
        int num1,num2,num3,num4,aux;
        aux = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num1= input.nextInt();
        System.out.println("Introduzca el segundo numero");//Pedimos 4 numeros
        num2= input.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3= input.nextInt();
        System.out.println("Introduzca el cuarto numero");
        num4= input.nextInt();
        Tema4Ej7.MenorMayor(num1, num2, num3, num4, aux);//Llamamos al metodo
    }
    
}
