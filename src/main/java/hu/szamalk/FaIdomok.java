package hu.szamalk;

import hu.szamalk.modell.FaIdom;
import hu.szamalk.modell.Gomb;
import hu.szamalk.modell.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;
    public FaIdomok() {
        idomok = new ArrayList<FaIdom>();
    }
    public void run(){
        System.out.println();
        idomok.add(new Gomb(1.0));
        idomok.add(new Hasab(1,1,1));
        System.out.println("A programban használt hengerek:");
        System.out.println(idomok.get(0).toString());
        System.out.println(idomok.get(1).toString());
        System.out.println("Idomok összes súlya:");
        System.out.println("Gömbök összes súlya:");
        System.out.println("Minimum térfogat:");
        System.out.println("Maximum térfogat:");
    }
    public double osszSuly(){
        return 0;
    }
    public double osszGombSuly(){
        return 0;
    }
    public FaIdom minV(){
        return idomok.get(0);
    }
    public FaIdom maxV(){
        return idomok.get(0);
    }

}
