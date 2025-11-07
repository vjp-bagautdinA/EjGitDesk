package tema4ej4;
//@author alumno
public class Menor {
    public static int Calculador(int num1, int num2, int num3) {
    int menor = num1;//Metemos los 3 numeros y un auxiliar que sera el numero menor y igualamos el aux al primer numero
    if (menor>num2) {
        menor = num2;
    }if (menor>num3){//Comparamos el auxuliar a los otros dos y sustituimos si son menores que el aux
    menor = num3;
    }
    return menor;//Devolvemos aux
}
}