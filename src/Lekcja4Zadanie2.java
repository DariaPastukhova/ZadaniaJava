public class Lekcja4Zadanie2 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6};
        // wynik: { 6, 5, 4, 3, 2, 1 }

        for (int i = 0; i < tab.length; i++){
        }
            for (int i = tab.length - 1; i >= 0; i--) {
                System.out.print(tab[i] + " ");
        }
            System.out.println();
    }
}

