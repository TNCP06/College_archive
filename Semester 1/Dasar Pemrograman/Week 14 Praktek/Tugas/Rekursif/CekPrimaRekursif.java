import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan angka untuk cek apakah bilangan prima: ");
        int n = sc27.nextInt();

        boolean hasil = CekPrima(n, n/2);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " Bukanlah bilangan prima");
        }

        sc27.close();
    }

    static boolean CekPrima(int n, int x) {
        if (x <= 1) {
            return true;
        }

        if (n % x == 0) {
            return false;
        } else {
            return CekPrima(n, x-1);
        }
    }
}