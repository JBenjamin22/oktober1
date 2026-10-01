public class MatrixKiiratas {
    public static void main(String[] args) {
        int meret = 4;

        for (int i = 1; i <= meret; i++) {
            for (int j = 1; j <= meret; j++) {
                System.out.print(i + ". sor " + j + ". oszlop");
                if (j < meret) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}