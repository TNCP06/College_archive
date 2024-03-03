import java.util.Scanner;

public class deretDecendingRekursif {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc27.nextInt();

        System.out.print("Deret Decending Rekursif: ");
        DecendingRekursif(n);

        System.out.println();

        System.out.print("Deret Decending Iteratif: ");
        DecendingIteratif(n);

        sc27.close();
    }

    static void DecendingRekursif(int x) {
        if (x >= 0) {
            System.out.print(x + " ");
            DecendingRekursif(x-1);
        }
    }

    static void DecendingIteratif(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}