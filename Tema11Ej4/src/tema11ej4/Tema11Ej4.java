package tema11ej4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tema11Ej4 {

    public static void main(String[] args) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Set<String> hs = new HashSet<String>();
        for (int i = 0; i < meses.length; i++) {
            hs.add(meses[i]);
        }
        System.out.println(hs);

        Set<String> lhs = new LinkedHashSet<String>();
        for (int i = 0; i < meses.length; i++) {
            lhs.add(meses[i]);
        }
        System.out.println(lhs);
    }

}
