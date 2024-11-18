package hu.szamalk.modell;

public abstract class FaIdom{
    private static double fajsuly;

    public FaIdom() {
        this.fajsuly = 0.8;
    }
    public double terfogat(){
        return 0;
    }
    public double suly(){
        return terfogat() * FaIdom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
