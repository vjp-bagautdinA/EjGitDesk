package tema4ej4;
//@author alumno
public class Menor {
    public static int Calculador(int num1, int num2, int num3) {
    int menor = num1;
    if (menor>num2) {
        menor = num2;
    }if (menor>num3){
    menor = num3;
    }
    return menor;
}
}