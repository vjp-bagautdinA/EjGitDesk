package CalculadorMayorNumero;
//@author alumno
public class NewClass {
    public static int Calculador(int num1, int num2, int num3) {
    int mayor = num1;//Metemos los 3 numeros y un auxiliar que sera el numero mayor y igualamos el aux al primer numero
    if (mayor<num2) {
        mayor = num2;
    }if (mayor<num3){//Comparamos el auxuliar a los otros dos y sustituimos si son mayores que el aux
    mayor = num3;
    }
    return mayor;//Devolvemos aux
}
}
