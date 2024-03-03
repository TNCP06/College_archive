import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenBuku;
        int jumBuku;
        double jumDiskon = 0, harga=100;

        System.out.print("Masukkan jenis buku(kamus/novel): ");
        jenBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumBuku = input.nextInt();

        if (jenBuku.equalsIgnoreCase("kamus")) {
            jumDiskon += 10;
            harga -= jumDiskon;
            if (jumBuku > 2) {
                jumDiskon += (harga * 0.02);
                System.out.println(jumDiskon+"%");
            } else {
                System.out.println(jumDiskon+"%");
            }
        } else if (jenBuku.equalsIgnoreCase("novel")&&jumBuku>3) {
            jumDiskon += 7;
            harga -= jumDiskon;
            jumDiskon += (harga * 0.02);
            System.out.println(jumDiskon+"%");
        } else if (jenBuku.equalsIgnoreCase("novel")) {
            jumDiskon += 7;
            harga -= jumDiskon;
            jumDiskon += (harga * 0.01);
            System.out.println(jumDiskon+"%");
        } else {
            if (jumBuku > 3) {
                jumDiskon += 5;   
                System.out.println(jumDiskon+"%");
            } else {
                System.out.println(jumDiskon+"%");
            }
        }

        input.close();
    }
}