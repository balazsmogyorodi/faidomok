package idomprogram.view;

import idomprogram.model.Faidom;
import idomprogram.model.Gomb;
import idomprogram.model.Hasab;
import java.util.ArrayList;
import java.util.List;

public class Faidomok {

    private ArrayList<Faidom> idomok;

    public Faidomok() {
        idomok = new ArrayList<>();
        idomok.add(new Gomb(2));
        idomok.add(new Hasab(2, 6, 8));
        idomok.add(new Hasab(8, 10, 12));
        run();

    }

    public void run() {
        for (int i = 0; i < idomok.size(); i++) {
            System.out.println(idomok.get(i));
            
        }
        System.out.println(osszSuly());
        System.out.println(osszGombSuly());
        System.out.println(minV());
        System.out.println(maxV());
        osszSuly();
        osszGombSuly();
        minV();
        maxV();

    }

    public double osszSuly() {
        double sum = 0;
        for (Faidom faidom : idomok) {
            sum += faidom.suly();
        }
        return sum;
    }

    public double osszGombSuly() {
        double sum = 0;
        for (Faidom faidom : idomok) {
            if (faidom instanceof Gomb) {
                sum += faidom.suly();
            }
        }
        return sum;
    }

    public Faidom minV() {
        Faidom aktualis = idomok.get(0);
        for (int i = 1; i < idomok.size(); i++) {
            if (aktualis.terfogat() > idomok.get(i).terfogat()) {
                aktualis = idomok.get(i);
            }
        }
        return aktualis;
    }

    public Faidom maxV() {
        Faidom aktualis = idomok.get(0);
        for (int i = 1; i < idomok.size(); i++) {
            if (aktualis.terfogat() < idomok.get(i).terfogat()) {
                aktualis = idomok.get(i);
            }
        }
        return aktualis;

    }

}
