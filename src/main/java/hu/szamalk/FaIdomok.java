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
        System.out.println("Idomok összes súlya:" + osszSuly());
        System.out.println("Gömbök összes súlya:" + osszGombSuly());
        System.out.println("Minimum térfogat:" + minV().terfogat());
        System.out.println("Maximum térfogat:" + maxV().terfogat());
    }
    public double osszSuly(){
        double ossz = 0;
        for (FaIdom idom : idomok) {
            ossz += idom.suly();
        }
        return ossz;
    }
    public double osszGombSuly(){
        double ossz = 0;
        for (FaIdom idom : idomok) {
            if(idom instanceof Gomb){
                ossz += idom.suly();
            }
        }
        return ossz;
    }
    public FaIdom minV(){
        double max = 0;
        int index = 0;
        for (int i = 0; i<idomok.size(); i++){
            if(idomok.get(i).terfogat() > max){
                max = idomok.get(i).terfogat();
                index = i;
            }
        }
        return idomok.get(index);
    }
    public FaIdom maxV(){
        double min = 0;
        int index = 0;
        for (int i = 0; i<idomok.size(); i++){
            if(idomok.get(i).terfogat() < min){
                min = idomok.get(i).terfogat();
                index = i;
            }
        }
        return idomok.get(index);
    }

}
