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
            Intervalo intervalo = new Intervalo(data.getIntervalo().getMin(), data.getIntervalo().getMax());
            System.out.println(data.getIntervalo().getMax());
            System.out.println(intervalo.getMax());
            assertEquals(data.message(),data.getIntervalo().getMax(), intervalo.getMax());
            assertEquals(data.message(),data.getIntervalo().getMin(), intervalo.getMin());
            data.nextInterval();
        }
    }
    
    @Test
    public void testLongitud(){
        while(data.hasNextInterval()){
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getLongitud(), intervalo.longitud());
            data.nextInterval();
        }
    }
   
    @Test
    public void testPuntoMedio(){
        while(data.hasNextInterval()){
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.message(), data.getPuntoMedio(), intervalo.puntoMedio(), intervalo.puntoMedio());
            data.nextInterval();
        }
    }
    
    @Test
    public void testPuntoIncluido(){
        while(data.hasNextInterval()){
            Intervalo intervalo = data.getIntervalo();
            assertEquals(data.getIncluyeEntero(), intervalo.incluyePunto(data.getPuntoIncluido()));
            data.nextInterval();
        }
    }

}