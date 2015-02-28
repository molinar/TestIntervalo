package intervalo.test;

import intervalo.Intervalo;
import intervalo.test.utils.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IntervaloTestData {

    private static final int[][] INTERVALO = {{-1, 1}, {0, 0}, {-5, 0}, {0, 5}, {1, 5}, {-5, -1},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {-3, 7}};//Solucionar por qué no coge el último y se inventa el primero

    private static final int[] LONGITUD = {2, 0, 5, 5, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            10};

    private static final double[] PUNTO_MEDIO = {0.0, 0.0, -2.5, 2.5, 3.0, -3.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0};

    private static final int[] PUNTO_INCLUIDO = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 5};

    private static final boolean[] INCLUYE_ENTERO = {true, true, true, true, false, false, true,
            true, true, true, true, true, true, true, true, true, true, true, true, true};

    private static final int[][] INTERVALO_INCLUIDO = { {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
        {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
        {0, 0}, {0, 0}, {0, 0}};

    private static final boolean[] INCLUYE_INTERVALO = {true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true, true, true, true, true};


    // Intervalos
    private Iterator<Intervalo> intervalosIterator;

    private Intervalo intervalo = new Intervalo(0, 0);
    
    // Longitudes
    private Iterator<Integer> longitudesIterator;
    
    private int longitud = 0;
    
    // Puntos medios
    private Iterator<Double> puntosMediosIterator;
    
    private double puntoMedio = 0.0;
    
    // Puntos incluidos
    private Iterator<Integer> puntosIncluidosIterator;
    
    private int puntoIncluido = 0;
    
    // Incluye puntos
    private Iterator<Boolean> incluyeEnterosIterator;
    
    private boolean incluyeEntero = true;
    
    
    private int numIntervalo = 0;
    
    public String message() {
        String resultado = "Intervalo: " + numIntervalo + "\n" + "intervalo: " + intervalo + "\n" + "longitud: " + longitud;
        return resultado;
    }
        
    public IntervaloTestData(){
        intervalosIterator = ArrayToListTransformer.transform(INTERVALO);
        longitudesIterator = ArrayToListTransformer.transform(LONGITUD);
        puntosMediosIterator = ArrayToListTransformer.transform(PUNTO_MEDIO);
        puntosIncluidosIterator = ArrayToListTransformer.transform(PUNTO_INCLUIDO);
        incluyeEnterosIterator = ArrayToListTransformer.transform(INCLUYE_ENTERO);
    }

    public boolean hasNextInterval() {
        List<Boolean> resultados = new ArrayList<Boolean>();
        resultados.add(intervalosIterator.hasNext());
        resultados.add(longitudesIterator.hasNext());
        resultados.add(puntosMediosIterator.hasNext());
        resultados.add(puntosIncluidosIterator.hasNext());
        resultados.add(incluyeEnterosIterator.hasNext());
        boolean primerResultado = resultados.remove(0);
        for (Boolean resultado : resultados){
            assert (primerResultado == resultado);
        }
        return primerResultado;
    }
    
    public Intervalo getIntervalo() {
        return intervalo;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public double getPuntoMedio(){
        return puntoMedio;
    }
    
    public int getPuntoIncluido(){
        return puntoIncluido;
    }
    
    public boolean getIncluyeEntero(){
        return incluyeEntero;
    }

    public void nextInterval() {
        numIntervalo ++;
        intervalo = intervalosIterator.next();
        longitud = longitudesIterator.next();
        puntoMedio = puntosMediosIterator.next();
        puntoIncluido = puntosIncluidosIterator.next();
        incluyeEntero = incluyeEnterosIterator.next();
    }
    
    public static void main(String[] arg) {
        IntervaloTestData data = new IntervaloTestData();
        while (data.hasNextInterval()) {
            System.out.println(data.message());
            data.nextInterval();
        }
    }

}