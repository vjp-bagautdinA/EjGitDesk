package tema3ej16;
//@author alumno
public class Tema3Ej16 {
    public static void main(String[] args) {
        int i;
        int impares =0;//Declaramos variables
        for (i=20;i<=160;i++) {//Empezamos el bucle en 20 y acabamos en 160 sumando 1 cada vez
            if (i%2 !=0) { //Comprobamos que sea impar, si lo es lo imprimimos y sumamos 1 a "impares"
                System.out.println("-"+i+"-");
                impares++;
            }
        }
        System.out.println("Hay "+impares+" números impares entre 20 y 160");//Imprimimos resultado
    }
    
}
