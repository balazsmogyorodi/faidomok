package idomprogram.model;

public class Hasab extends Faidom{

    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;

    }

    public double terfogat() {
        return a * b * magassag;
    }

    @Override
    public String toString() {
        String txt = super.toString();
        txt += "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
        return txt;
    }

}
