public class Lekcja2Zadanie2 {
    public static void main(String[] args) {

        int tree = 7;

        for (int x = tree; x > 0; x--) {
            for (int y = x; y > 0; y--)
                System.out.print(" ");

            for (int i = 2 * (tree - x) + 1; i > 0; i--)
                System.out.print("*");
            System.out.println();
        }
        for (int a = tree; a > 0; a--) {
            for (int j = (tree - a) + 1; j > 0; j--)
                System.out.print(" ");
            for (int b = (2 * a) - 1; b > 0; b--)
                System.out.print("*");
            System.out.println();
        }
    }
}
