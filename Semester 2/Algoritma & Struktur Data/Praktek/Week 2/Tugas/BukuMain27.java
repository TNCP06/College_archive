public class BukuMain27 {

    public static void main(String[] args) {
        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71_000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60_000);
        System.out.println();
        bk1.tampilInformasi();

        System.out.println();
        Buku27 bk2 = new Buku27("Self Reward", "Maheera Ayesha", 160, 29, 59_000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.println("Harga Total: Rp" + bk2.hitungHargaTotal(11));
        System.out.println("Diskon: Rp" + bk2.hitungDiskon(11));
        System.out.println("Harga Bayar: Rp" + bk2.hitungHargaBayar(11));

        System.out.println();
        Buku27 bukuTio = new Buku27("Buku Tulis MatDas", "Tionusa", 50, 2, 3500);
        bukuTio.terjual(2);
        bukuTio.tampilInformasi();
        System.out.println("Harga Total: Rp" + bukuTio.hitungHargaTotal(2));
        System.out.println("Diskon: Rp" + bukuTio.hitungDiskon(2));
        System.out.println("Harga Bayar: Rp" + bukuTio.hitungHargaBayar(2));
    }
}