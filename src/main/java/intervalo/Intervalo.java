package intervalo;
public class Intervalo {

    private int min, max;

    public Intervalo(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public int longitud() {
        return this.max - this.min;
    }

    public double puntoMedio() {
        return this.min + (double)this.longitud()/2;
    }

    public boolean incluyePunto(int punto) {
        return (this.max >= punto) && (this.min <= punto);
    }

    public boolean incluyeIntervalo(Intervalo intervalo) {
        return (this.max >= intervalo.max) && (this.min <= intervalo.min);
    }

    public Intervalo interseccion(Intervalo intervalo) {//Mirar assert
        Intervalo resultado = new Intervalo(0, 0);
        
        if (this.incluyeIntervalo(intervalo)) {
            resultado = intervalo;
        } else if (intervalo.incluyeIntervalo(this)) {
            resultado = this;
        } else if (this.incluyePunto(intervalo.max)) {
            resultado = new Intervalo(this.min, intervalo.max);
        } else if (this.incluyePunto(intervalo.min)) {
            resultado = new Intervalo(intervalo.min, this.max);
        }
        return resultado;
    }
}
