import java.util.Scanner;

public class Percobaan627 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan Panjang: ");
        p = input27.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = input27.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input27.nextInt();

        // L = p*l;
        // System.out.println("Luas persegi panjang adalah "+L);

        // vol = p*l*t;
        // System.out.println("Volume balok adalah "+vol);

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah "+L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah "+vol);

        input27.close();
    }

    static int hitungLuas(int p, int l) {
        int luas = p*l;
        return luas;
    }

    static int hitungVolume(int p, int l, int t) {
        int volume = hitungLuas(p*l)*t;
        return volume;
    }
}