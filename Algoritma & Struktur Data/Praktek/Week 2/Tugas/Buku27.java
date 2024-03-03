public class Buku27 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku27() {

    }
    public Buku27(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    void terjual(int jml) {
        if (stok >= 0 && stok >= jml) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }

    int hitungHargaTotal(int jml) {
        return harga*jml;
    }

    int hitungDiskon(int jml) {
        int hargaTotal = hitungHargaTotal(jml);
        int totalDiskon = 0;

        if (hargaTotal > 150_000) {
            totalDiskon = (int) (hargaTotal * 0.12);
        } else if (hargaTotal > 75_000) {
            totalDiskon = (int) (hargaTotal * 0.5);
        }
        return totalDiskon;
    }

    int hitungHargaBayar(int jml) {
        int hargaBayar = hitungHargaTotal(jml) - hitungDiskon(jml);
        return hargaBayar;
    }
}