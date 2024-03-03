package ArrayBalok;
import java.lang.Math;

public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public int hitungKeliling() {
        double t = tinggi;
        double a = alas;
        double sisi = Math.hypot(t, a);
        return (int) (sisi + alas + tinggi);
    }
}