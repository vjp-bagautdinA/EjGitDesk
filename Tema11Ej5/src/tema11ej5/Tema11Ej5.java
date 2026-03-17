package tema11ej5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tema11Ej5 {

    public static void main(String[] args) {
        String[] meses = {"Diciembre","Noviembre","Octubre","Septiembre","Agosto","Julio","Junio","Mayo","Abril","Marzo","Febrero","Enero"};
        Map<Integer,String> mapHash = new HashMap<Integer,String>();
        for (int i = 0;i  < meses.length;i++) {
            mapHash.put(i, meses[i]);
        }   
        System.out.println(mapHash);
        
        Map<Integer,String> LinkedMap = new LinkedHashMap<Integer,String>();
        for (int i = 0;i  < meses.length;i++) {
            LinkedMap.put(i, meses[i]);
        }
        System.out.println(LinkedMap);
    }
    
}
