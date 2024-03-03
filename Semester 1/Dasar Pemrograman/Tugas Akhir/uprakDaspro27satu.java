import java.util.Scanner;

public class uprakDaspro27satu {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc27.nextInt();

        System.out.println("1. binary");
        System.out.println("2. octal");
        System.out.println("3. hexadecimal");
        System.out.print("Convert to (1,2,3): ");
        int pilihan = sc27.nextInt();

        if (pilihan == 1) {
            System.out.println(ubah(angka, 2));
        } else if (pilihan == 2) {
            System.out.println(ubah(angka, 8));
        } else if (pilihan == 3) {
            System.out.println(ubah(angka, 16));
        } else {
            System.out.println("Opsi yang anda masukkan tidak tersedia!");
        }

        sc27.close();
    }

    static String ubah(int angka, int jenis) {
        int hasilBagi = angka;
        String hasilUbah = "";

        while (hasilBagi > 0) {
            int sisaBagi = hasilBagi % jenis;
            String sisaBagiHexa = "";

            if (jenis == 16) {
                switch (sisaBagi) {
                    case 10:
                        sisaBagiHexa = "A";
                        break;
                    case 11:
                        sisaBagiHexa = "B";
                        break;
                    case 12:
                        sisaBagiHexa = "C";
                        break;
                    case 13:
                        sisaBagiHexa = "D";
                        break;
                    case 14:
                        sisaBagiHexa = "E";
                        break;
                    case 15:
                        sisaBagiHexa = "F";
                        break;
                    default:
                    hasilUbah += sisaBagi;
                    break;
                }
                hasilUbah += sisaBagiHexa;
            } else {
                hasilUbah += sisaBagi;
            }
            hasilBagi /= jenis;
        }

        return hasilUbah;
    }
}