import java.util.Scanner;

public class PyramidReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a piramis nagysagat: ");
        int szam = scanner.nextInt();
        for (int i = szam; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
