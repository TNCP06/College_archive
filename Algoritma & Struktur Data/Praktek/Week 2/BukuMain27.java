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
    }
}