import java.util.Scanner;

public class Lekcja2Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Ile gwiazdek Ci wydrukowac: ");
        int starMax = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 1; i++) {
            for (int j = 0; j < starMax - i; j++) ;
            for (int j = 0; j < starMax; j++) System.out.print("*");
            System.out.println();
        }
    }
}
