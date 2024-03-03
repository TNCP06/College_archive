public class uprakDaspro27 {

    public static void main(String[] args) {
        int limit = 500;

        for (int genap = 4; genap <= limit; genap += 2) {
            if (cekGenap(genap)) {
                int[] goldBack = cariGoldBack(genap);
                System.out.println(goldBack[0] + " + " + goldBack[1] + " = " + genap);
            }
        }
    }

    private static boolean cekPrima(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean cekGenap(int genap) {
        for (int prima = 2; prima < genap; prima++) {
            int complement = genap - prima;
            if (cekPrima(prima) && cekPrima(complement)) {
                return true;
            }
        }
        return false;
    }

    private static int[] cariGoldBack(int genap) {
        int[] goldBackPair = new int[2];
        for (int prima = 2; prima < genap; prima++) {
            int complement = genap - prima;
            if (cekPrima(prima) && cekPrima(complement)) {
                goldBackPair[0] = prima;
                goldBackPair[1] = complement;
                break;
            }
        }
        return goldBackPair;
    }
}
