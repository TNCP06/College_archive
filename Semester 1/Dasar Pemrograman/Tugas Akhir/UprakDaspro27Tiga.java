import java.util.Scanner;

public class UprakDaspro27Tiga {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String inputString = sc27.nextLine();

        int jumlahVokal = hitungVokal(inputString);
        int jumlahKonsonan = hitungKonsonan(inputString);
        int jumlahAngka = hitungAngka(inputString);
        int jumlahKarakterKhusus = hitungKarakterKhusus(inputString);

        System.out.println("Jumlah Vokal: " + jumlahVokal);
        System.out.println("Jumlah Konsonan: " + jumlahKonsonan);
        System.out.println("Jumlah Angka: " + jumlahAngka);
        System.out.println("Jumlah Karakter Khusus: " + jumlahKarakterKhusus);

        sc27.close();
    }

    private static int hitungVokal(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                count++;
            }
        }

        return count;
    }

    private static int hitungKonsonan(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'i' && ch != 'u' && ch != 'e' && ch != 'o') {
                count++;
            }
        }

        return count;
    }

    private static int hitungAngka(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        return count;
    }

    private static int hitungKarakterKhusus(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(Character.isLetter(ch) || Character.isDigit(ch) || Character.isWhitespace(ch))) {
                count++;
            }
        }

        return count;
    }
}