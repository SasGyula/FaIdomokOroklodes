package hu.szamalk.modell;

public abstract class FaIdom{
    private double fajsuly;

    public FaIdom() {
        this.fajsuly = 0.8;
    }
    public double terfogat(){
        return 0;
    }
    public double suly(){
        return 0;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
