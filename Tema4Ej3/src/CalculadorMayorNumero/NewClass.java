package CalculadorMayorNumero;
//@author alumno
public class NewClass {
    public static int Calculador(int num1, int num2, int num3) {
    int mayor = num1;
    if (mayor<num2) {
        mayor = num2;
    }if (mayor<num3){
    mayor = num3;
    }
    return mayor;
}
}
