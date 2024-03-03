import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan angka Penjumlahan Rekursif: ");
        int f = sc27.nextInt();

        System.out.print("Total Penjumlahan rekursif: " + penjumlahanRekursif(f));

        sc27.close();
    }

    static int penjumlahanRekursif(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + penjumlahanRekursif(f-1);
        }
    }
}