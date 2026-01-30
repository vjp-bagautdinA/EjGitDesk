package tema8ej1;
<<<<<<< HEAD
//@author alumno
import java.util.Scanner;
public class Tema8Ej1 {
    
    public static void arrayAsignaturas() {
        Scanner input = new Scanner(System.in);
        Asignatura[] AsignaturasDAW = new Asignatura[6];
        double nota;
        String[] listasAsignaturas = {"Programación","LMSGI","Bases de Datos","Entornos de Desarollo","Sistemas Informáticos","Orientacion Laboral"};
        for (int i= 0; i < AsignaturasDAW.length;i++) {
            System.out.println("Introduzca la nota de "+listasAsignaturas[i]+":");
            nota = input.nextDouble();
            AsignaturasDAW[i] = new Asignatura(listasAsignaturas[i],nota);
     }
        notaMedia(AsignaturasDAW);
    }
    public static void notaMedia(Asignatura[] AsignaturasDAW){
        double aux = 0;
        double media = 0;
        for ( int i= 0; i < AsignaturasDAW.length;i++) {
            aux = aux + AsignaturasDAW[i].getNota();
            media = aux / 6;
        }
        System.out.println("Su nota media del curso es de: "+media);
    }

    public static void main(String[] args) {
        arrayAsignaturas();
}
=======
//@author Usuario
import java.util.Scanner;
public class Tema8Ej1 {
    
    public static void pedirNotas() {
        Scanner input = new Scanner(System.in);
        nota[] notas = new nota[6];
        for (int i = 0;i < notas.length;i++) {
            notas[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
      
    }
>>>>>>> 432d591c7577bbbc515d48fd814cf04adad7014f
}
