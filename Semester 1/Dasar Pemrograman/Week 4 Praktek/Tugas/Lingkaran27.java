import java.util.Scanner;

public class Lingkaran27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double keliling, luas, phi=3.14;
        int r;

        System.out.print("Masukkan Jari-jari Lingkaran: ");
        r = input.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);

        input.close();
    }
}