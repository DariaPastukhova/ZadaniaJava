public class Lekcja2Zadanie1 {
    public static void main(String[] args) {

        int tree = 7;

        for (int x = tree; x > 0; x--) {
                System.out.print(x + ": ");
                for (int y = x; y > 0; y--)
                    System.out.print(" ");

                for (int i = 2 * (tree - x) + 1; i > 0; i--)
                    System.out.print("*");
                System.out.println();
            }
        }

    }
