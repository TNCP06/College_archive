package Latihan_Praktikum;

import java.lang.Math;

public class Kerucut {
    public double jariJari;
    public double sisiMiring;

    Kerucut(double r, double s) {
        jariJari = r;
        sisiMiring = s;
    }

    double hitungLuasPermukaan() {
        double lp = 0;
        lp = 22.0/7.0*jariJari*(jariJari+sisiMiring);
        return lp;
    }
    
    double hitungVolume() {
        double vol = 0;
        double luasAlas = 22.0/7.0*Math.pow(jariJari, 2);
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2)-Math.pow(jariJari, 2));
        vol = (1.0/3.0)*(luasAlas*tinggi);
        return vol;
    }

    public static void main(String[] args) {
        Kerucut krc = new Kerucut(5, 10);

        System.out.println(krc.hitungLuasPermukaan());
        System.out.println(krc.hitungVolume());
    }
}