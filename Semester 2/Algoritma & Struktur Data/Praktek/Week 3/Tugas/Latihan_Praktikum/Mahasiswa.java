package Latihan_Praktikum;

import java.util.Scanner;

public class Mahasiswa {
    String nama, nim, jenisKelamin;
    double IPK;

    Mahasiswa(String nama, String nim, String jk, double ipk) {
        this.nama = nama;
        this.nim = nim;
        jenisKelamin = jk;
        IPK = ipk;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jk = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mhs[i] = new Mahasiswa(nama, nim, jk, ipk);
        }

        System.out.println();

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mhs[i].IPK);
        }
        sc.close();
    }
}