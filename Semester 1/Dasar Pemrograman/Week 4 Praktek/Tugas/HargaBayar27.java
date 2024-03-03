import java.util.Scanner;
public class HargaBayar27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkBuku;
        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukkan merk Buku yang dibeli: ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku yang dibeli: ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: Rp");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan persentase diskon barang: %");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*(dis/100);
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan: Rp" + jmlDis);
        System.out.println("Jumlah yang harus dibayar untuk "+jumlah+" buah Buku merk \""+ merkBuku +"\" yang berjumlah "+ jmlHalBuku +" halaman adalah: Rp" + bayar);

        input.close();
    }
}