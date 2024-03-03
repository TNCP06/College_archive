import java.util.Scanner;
public class Gaji27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTidakMasuk, totGaji, potGaji, gaji;
        
        System.out.print("Berapa Gaji Anda: Rp");
        gaji = input.nextInt();
        System.out.print("Masukkan Potongan Gaji Anda Setiap Tidak Masuk Kerja: Rp");
        potGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda: ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTidakMasuk = input.nextInt();

        totGaji = (jmlMasuk*gaji)-(jmlTidakMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah: Rp"+totGaji);

        input.close();
    }
}