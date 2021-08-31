import java.util.Arrays;

public class Lekcja4Zadanie1 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tablica przed obróceniem: " + Arrays.toString(tab));
        swap(tab, 0, 6);
        System.out.println("Tablica po obróceniu: " + Arrays.toString(tab));
    }

    public static void swap(int[] tab, int a, int b) {
        int tempValue = 6;
        tempValue = tab[a];
        tab[a] = tab[b];
        tab[b] = tempValue;
    }
}
