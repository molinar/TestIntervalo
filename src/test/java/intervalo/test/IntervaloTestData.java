package intervalo.test;

import intervalo.Intervalo;

import java.util.Iterator;

public class IntervaloTestData {
    
    private static final int [] MINIMO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] MAXIMO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] LONGITUD = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final double [] PUNTO_MEDIO = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 
                                                0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    
    private static final int [] PUNTO_INCLUIDO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final boolean [] INCLUYE_ENTERO = {true, true, true, true, true, true, true, true, true, true,
                                                      true, true, true, true, true, true, true, true, true, true};
    
    private static final int [] MINIMO_INCLUIDO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] MAXIMO_INCLUIDO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final boolean [] INCLUYE_INTERVALO = {true, true, true, true, true, true, true, true, true, true,
                                                      true, true, true, true, true, true, true, true, true, true};
    
    private static final int [] MINIMO_INTERSECCION_INCLUIDO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] MAXIMO_INTERSECCION_INCLUIDO = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] MINIMO_INTERSECCION = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    private static final int [] MAXIMO_INTERSECCION = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    //Intervalos
    private Iterator<Intervalo> intervaloIterator;
    
    private Intervalo intervalo;    

}
