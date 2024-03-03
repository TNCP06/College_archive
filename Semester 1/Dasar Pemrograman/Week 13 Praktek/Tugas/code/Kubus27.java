import java.util.Scanner;

public class Kubus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang Sisi kubus: ");
        int sisi = sc.nextInt();

        int v = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + v);

        int LP = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus adalah " + LP);

        sc.close();
    }

    static int hitungVolume(int p) {
        int vol = p*p*p;
        return vol;
    }

    static int hitungLuasPermukaan(int p) {
        int LP = (p*p) * 6;
        return LP;
    }
}