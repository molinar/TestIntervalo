package intervalo.test.utils;

import intervalo.Intervalo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayToListTransformer {

    public static Iterator<Intervalo> transform(int[][] intervalos) {
        List<Intervalo> resultado = new ArrayList<Intervalo>();
        for (int i = 0; i < intervalos.length; i++){
            Intervalo intervalo = null;
            if(intervalos[i] != null){
                intervalo = new Intervalo(intervalos[i][0], intervalos[i][1]);
            }
            resultado.add(intervalo);
        }
        return resultado.iterator();
    }
    
    public static Iterator<Integer> transform(int[] array){
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            resultado.add(array[i]);
        }
        return resultado.iterator();
    }
    
    public static Iterator<Boolean> transform(boolean[] array) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result.iterator();
    }

    public static Iterator<String> transform(String[] array) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result.iterator();
    }

    public static Iterator<Double> transform(double[] array) {
        List<Double> resultado = new ArrayList<Double>();
        for (int i = 0; i < array.length; i++){
            resultado.add(array[i]);
        }
        return resultado.iterator();
    }

}
