import java.util.Scanner;

public class Fibonacci27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan bulan ke: ");
        int bulan = sc27.nextInt();

        int jumlahPasangan = hitungPasanganMarmut(bulan);

        System.out.println("Bulan ke-"+bulan+", pasangan marmut berjumlah "+jumlahPasangan);

        sc27.close();
    }

    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan-1) + hitungPasanganMarmut(bulan-2);
        }
    }
}