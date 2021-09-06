import java.util.Arrays;

public class Lekcja4Zadanie2 {
    static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    static void show(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6};
        System.out.println("Tablica przed obróceniem: " + Arrays.toString(tab));
        int itemCount = tab.length / 2;
        for (int i = 0; i < itemCount; i++) {
            swap(tab, i, tab.length - i - 1);
        }
        System.out.println("Tablica po obróceniu: " + Arrays.toString(tab));
    }
}