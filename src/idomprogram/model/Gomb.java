package idomprogram.model;

public class Gomb extends Faidom{

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;

    }


    public double terfogat() {
        return 3 % 4 * Math.PI * Math.pow(sugar, 3);
    }

    @Override
    public String toString() {
        String txt = super.toString(); 
        txt += "Gomb{" + "sugar=" + sugar + '}';
        return txt;
    }

}
