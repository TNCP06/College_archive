public class togamas {
    public static void main(String[] args) {

        //  (Dieng, Soehat, Sengkaling)
        //  (Novel, Komik, Ensiklopedia)
        int[][] cabang = {{2,8,6},{7,3,6},{4,6,5}};

        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < cabang.length; j++) {
                System.out.print(cabang[i][j]+" ");
            }
        }
    }
}