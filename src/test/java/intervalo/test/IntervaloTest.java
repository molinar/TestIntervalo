package intervalo.test;

import static org.junit.Assert.*;
import intervalo.Intervalo;

import org.junit.Before;
import org.junit.Test;

public class IntervaloTest {
    
    private IntervaloTestData data;
    
    @Before
    public void init(){
        data = new IntervaloTestData();
    }
    
    @Test
    public void testIntervalo(){
        while(data.hasNextInterval()){    
            data.nextInterval();            
            Intervalo intervalo = new Intervalo(data.getIntervalo().getMin(), data.getIntervalo().getMax());
            assertEquals(data.message(),data.getIntervalo().getMax(), intervalo.getMax());
            assertEquals(data.message(),data.getIntervalo().getMin(), intervalo.getMin());
        }
    }
    
    @Test
    public void testLongitud(){
        while(data.hasNextInterval()){
            data.nextInterval();
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getLongitud(), intervalo.longitud());
        }
    }
   
    @Test
    public void testPuntoMedio(){
        while(data.hasNextInterval()){
            data.nextInterval();
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getPuntoMedio(), intervalo.puntoMedio(), intervalo.puntoMedio());
        }
    }
    
    @Test
    public void testPuntoIncluido(){
        while(data.hasNextInterval()){
            data.nextInterval();
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getIncluyeEntero(), intervalo.incluyePunto(data.getPuntoIncluido()));
        }
    }
    
    @Test
    public void testIntervaloIncluido(){
        while(data.hasNextInterval()){
            data.nextInterval();
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getIncluyeIntervalo(), intervalo.incluyeIntervalo(data.getIntervaloIncluido()));
        }
    }
    
    @Test
    public void testInterseccion(){
        while (data.hasNextInterval()){
            data.nextInterval();
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getInterseccion().getMin(), intervalo.interseccion(data.getIntervaloInterseccion()).getMin());
            assertEquals(data.message(), data.getInterseccion().getMax(), intervalo.interseccion(data.getIntervaloInterseccion()).getMax());
        }
    }

}