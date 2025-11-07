package salida;
//@author alumno
public class ParOImpar {
    public static void check(int num) {
        if (num%2 == 0) {//Checkeamos si el input es par o par viendo el modulo del numero dividido por 2
            System.out.println(num+ " es par");//Imprimimos resultados correspondientes
       }else {
            System.out.println(num+" es impar");
        }
    }
}
