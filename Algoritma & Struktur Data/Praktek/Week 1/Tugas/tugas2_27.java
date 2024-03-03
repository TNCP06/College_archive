import java.util.Scanner;
public class tugas2_27 {
    static Scanner sc = new Scanner(System.in);
    static int pilihanMenu;

    public static void main(String[] args) {
        pilihMenu();
    }

    public static void pilihMenu() {
        do {
            System.out.println("--------------------------------");

            System.out.println("1. Program Hitung Kecepatan");
            System.out.println("2. Program Hitung Jarak");
            System.out.println("3. Program Hitung Waktu");
            System.out.println("4. Keluar\n");

            do {
                System.out.print("Pilih Menu : ");
                pilihanMenu = sc.nextInt();
            } while (pilihanMenu < 1 || pilihanMenu > 4);

            switch(pilihanMenu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
            }
        } while (pilihanMenu != 4);

    }

    public static void hitungKecepatan() {
        System.out.print("Masukkan Jarak (km) : ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan Waktu (jam) : ");
        double waktu = sc.nextDouble();

        double Kecepatan = jarak / waktu;
        System.out.printf("Hasil Kecepatan : %.2f", Kecepatan);
        System.out.println(" ");
    }

    public static void hitungJarak() {
        System.out.print("Masukkan Kecepatan (km) : ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan Waktu(jam) : ");
        double waktu = sc.nextDouble();

        double Jarak = kecepatan * waktu;
        System.out.printf("Hasil Jarak : %.2f", Jarak);
        System.out.println(" ");
    }

    public static void hitungWaktu() {
        System.out.print("Masukkan Jarak (km) : ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan Kecepatan (km) : ");
        double kecepatan = sc.nextDouble();

        double Waktu = jarak / kecepatan;
        System.out.printf("Hasil Waktu : %.2f", Waktu);
        System.out.print("Hasil Waktu : " + Waktu);
        System.out.println(" ");
    }
}