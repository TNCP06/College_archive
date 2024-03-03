import java.util.Scanner;

public class LatihanMandiriWeek13 {
    public static void main(String[] args) {
        inputData();
        outputNilai();
        nilaiTertinggi();
        System.out.println(cetakNilaiTertinggi());
    }

    static int[][] nilai;
    static int nilaiTertinggi = 0, minggu = 0;

    static void inputData() {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        byte n = sc27.nextByte();
        System.out.print("MAsukkan Jumlah tugas: ");
        byte x = sc27.nextByte();

        nilai = new int[n][x];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-"+(j+1)+": ");
                nilai[i][j] = sc27.nextInt();
            }
            System.out.println();
        }

        sc27.close();
    }

    static void outputNilai() {
        System.out.print("Minggu ke:");
        for (int i = 0; i < 7; i++) {
            System.out.print("\t"+(i+1));
        }
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mhs ke-"+(i+1)+":\t");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void nilaiTertinggi() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    minggu = j+1;
                }
            }
        }
    }
    
    static String cetakNilaiTertinggi() {
        return "Nilai Tertinggi adalah "+nilaiTertinggi+" pada Minggu ke-"+minggu;
    }
}