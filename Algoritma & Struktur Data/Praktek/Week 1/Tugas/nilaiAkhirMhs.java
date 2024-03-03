import java.util.Scanner;

public class nilaiAkhirMhs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir = 0;
        String nilaiHuruf = "";
        boolean isLulus = true;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=====================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("=====================");
        
        nilaiAkhir = (nilaiTugas*0.2) + (nilaiKuis*0.2) + 
        (nilaiUTS*0.3) + (nilaiUAS*0.4);
        
        System.out.println("=====================");
        if (nilaiTugas > 100 || nilaiTugas < 0 || nilaiKuis > 100 || nilaiKuis < 0 
        || nilaiUTS > 100 || nilaiUTS < 0 || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("nilai tidak valid");
            System.out.println("=====================");
            System.out.println("=====================");
        } else {
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                isLulus = false;
            } else if (nilaiAkhir >= 0) {
                nilaiHuruf = "E";
                isLulus = false;
            }
            System.out.println("nilai akhir\t: " + nilaiAkhir);
            System.out.println("nilai Huruf\t: " + nilaiHuruf);
            System.out.println("=====================");
            System.out.println("=====================");
            if (isLulus) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
        
        sc.close();
    }
}