package intervalo.test;

import intervalo.Intervalo;
import intervalo.test.utils.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IntervaloTestData {

    private static final int[][] INTERVALO = {{-1, 1}, {0, 0}, {-5, 0}, {0, 5}, {1, 5}, {-5, -1},
            {1, 2}, {0, 2}, {-2, 0}, {-1, 0}, {0, 4}, {-1, 2}, {1, 2}, {-2, 2}, {-4, 1}, {-2, -1}, {-3, 0},
            {-1, 6}, {2, 7}, {-3, 7}};

    private static final int[] LONGITUD = {2, 0, 5, 5, 4, 4, 1, 2, 2, 1, 4, 3, 1, 4, 5, 1, 3, 7, 5,
            10};

    private static final double[] PUNTO_MEDIO = {0.0, 0.0, -2.5, 2.5, 3.0, -3.0, 1.5, 1.0, -1.0, -0.5,
            2.0, 0.5, 1.5, 0.0, -1.5, -1.5, -1.5, 2.5, 4.5, 2.0};

    private static final int[] PUNTO_INCLUIDO = {0, 0, -5, 0, 0, -1, 1, 2, -3, -1, -1, 0, 0, 1, -2, -1, 1,
            2, 0, 5};

    private static final boolean[] INCLUYE_ENTERO = {true, true, true, true, false, true, true,
            true, false, true, false, true, false, true, true, true, false, true, false, true};

    private static final int[][] INTERVALO_INCLUIDO = {{0, 1}, {0, 0}, {-1, 0}, {-1, 1}, {0, 4}, {-5, -1},
        {0, 2}, {0, 1}, {-1, 0}, {0, 2}, {0, 2}, {-1, 1}, {1, 2}, {-2, 0}, {-1, 1}, {1, 2}, {-3, -2},
        {0, 3}, {0, 3}, {-2, 2}};

    private static final boolean[] INCLUYE_INTERVALO = {true, true, true, false, false, true, false,
            true, true, false, true, true, true, true, true, false, true, true, false, true};
    
    private static final int[][] INTERVALO_INTERSECCION = {{0, 5}, {-6, 6}, {-3, 10}, {-2, 2}, {-3, 3}, {-2, 7},
        {0, 3}, {1, 1}, {-4, -1}, {0, 5}, {-1, 2}, {-1, 2}, {0, 5}, {-1, 1}, {0, 1}, {-2, 0}, {-1, 1},
        {-5, 2}, {-1, 4}, {-1, 4}};
    
    private static final int[][] INTERSECCION = {{0, 1}, {0, 0}, {-3, 0}, {0, 2}, {1, 3}, {-2, -1},
        {1, 2}, {1, 1}, {-2, -1}, {0, 0}, {0, 2}, {-1, 2}, {1, 2}, {-1, 1}, {0, 1}, {-2, -1}, {-1, 0},
        {-1, 2}, {2, 4}, {-1, 4}};


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
    
    // Intervalos incluidos
    private Iterator<Intervalo> intervalosIncluidosIterator;
    
    private Intervalo intervaloIncluido = new Intervalo(0,0);  
    
    //Incluye intervalos
    private Iterator<Boolean> incluyeIntervalosIterator;
    
    private boolean incluyeIntervalo = true;
    
    // Intersecciones
    private Iterator<Intervalo> interseccionesIterator;
    
    private Intervalo interseccion = new Intervalo(0,0);  
    
    // Intervalos iterseccion
    private Iterator<Intervalo> intervalosInterseccionIterator;
    
    private Intervalo intervaloInterseccion = new Intervalo(0,0);  
    
    
    private int numIntervalo = 0;
    
    public String message() {
        String resultado =  "\n" + "Número intervalo: " + numIntervalo + "\n" + 
                            "Intervalo: " + intervalo.getMin() + "," + intervalo.getMax() + "\n" + 
                            "Longitud: " + longitud + "\n" + 
                            "Punto medio: " + puntoMedio + "\n" + 
                            "Punto incluido: " + puntoIncluido + " -> " + incluyeEntero + "\n" +
                            "Intervalo inluido: " + intervaloIncluido.getMin() + "," + intervaloIncluido.getMax() + " -> " + incluyeIntervalo + "\n" + 
                            "Intervalo intersección: " + intervaloInterseccion.getMin() + "," + intervaloInterseccion.getMax() + "\n" + 
                            "Intersección: " + interseccion.getMin() + "," + interseccion.getMax() + "\n";
        return resultado;
    }
        
    public IntervaloTestData(){
        intervalosIterator = ArrayToListTransformer.transform(INTERVALO);
        longitudesIterator = ArrayToListTransformer.transform(LONGITUD);
        puntosMediosIterator = ArrayToListTransformer.transform(PUNTO_MEDIO);
        puntosIncluidosIterator = ArrayToListTransformer.transform(PUNTO_INCLUIDO);
        incluyeEnterosIterator = ArrayToListTransformer.transform(INCLUYE_ENTERO);
        intervalosIncluidosIterator = ArrayToListTransformer.transform(INTERVALO_INCLUIDO);
        incluyeIntervalosIterator = ArrayToListTransformer.transform(INCLUYE_INTERVALO);
        interseccionesIterator = ArrayToListTransformer.transform(INTERSECCION);
        intervalosInterseccionIterator = ArrayToListTransformer.transform(INTERVALO_INTERSECCION);
    }

    public boolean hasNextInterval() {
        List<Boolean> resultados = new ArrayList<Boolean>();
        resultados.add(intervalosIterator.hasNext());
        resultados.add(longitudesIterator.hasNext());
        resultados.add(puntosMediosIterator.hasNext());
        resultados.add(puntosIncluidosIterator.hasNext());
        resultados.add(incluyeEnterosIterator.hasNext());
        resultados.add(intervalosIncluidosIterator.hasNext());
        resultados.add(incluyeIntervalosIterator.hasNext());
        resultados.add(interseccionesIterator.hasNext());
        resultados.add(intervalosInterseccionIterator.hasNext());
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
    
    public Intervalo getIntervaloIncluido(){
        return intervaloIncluido;
    }
    
    public boolean getIncluyeIntervalo(){
        return incluyeIntervalo;
    }    
    
    public Intervalo getInterseccion() {
        return interseccion;
    }
    
    public Intervalo getIntervaloInterseccion() {
        return intervaloInterseccion;
    }

    public void nextInterval() {
        numIntervalo ++;
        intervalo = intervalosIterator.next();
        longitud = longitudesIterator.next();
        puntoMedio = puntosMediosIterator.next();
        puntoIncluido = puntosIncluidosIterator.next();
        incluyeEntero = incluyeEnterosIterator.next();
        intervaloIncluido = intervalosIncluidosIterator.next();
        incluyeIntervalo = incluyeIntervalosIterator.next();
        interseccion = interseccionesIterator.next();
        intervaloInterseccion = intervalosInterseccionIterator.next();
    }
    
    public static void main(String[] arg) {
        IntervaloTestData data = new IntervaloTestData();
        while (data.hasNextInterval()) {
            System.out.println(data.message());
            data.nextInterval();
        }
    }
}