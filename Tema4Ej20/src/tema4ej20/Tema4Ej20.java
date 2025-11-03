package tema4ej20;
//@author alumno
import java.util.Scanner;
public class Tema4Ej20 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colon";
    
    public final static String PREGUNTA1 = "¿Cual es la capital de España?";
    public final static String PREGUNTA2 = "¿Quien descubrio America";
    public final static int PUNTUACION = 5;
    public static String pedirRespuesta() { //Metodo que pide una respuesta al usario y le hace un return
        Scanner input = new Scanner(System.in);
        String respuestaUsuario = input.nextLine();
        return respuestaUsuario;
    }
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) { //Metodo que comprueba la respuesta y return un boolean "correcto"
        boolean correcto;
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            correcto = true;
        }else {
            correcto = false;
        }
        return correcto;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int puntuacionFinal = 0;
        String respuesta;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        if (comprobarRespuesta(respuesta,RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        }else {
            System.out.println("No es correcto, repuesta incorrecta");
        }
        
        System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        if (comprobarRespuesta(respuesta,RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        }else {
            System.out.println("No es correcto, repuesta incorrecta");
        }
        System.out.println("Tu nota final es: "+puntuacionFinal);
    }
    
}
