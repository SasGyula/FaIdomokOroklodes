package hu.szamalk.modell;

public class Hasab extends FaIdom{
    private double a,b,magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }
    public double terfogat(){
        return a*b*magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", magassag=" + magassag +
                '}';
    }
}