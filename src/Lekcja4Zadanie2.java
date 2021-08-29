public class Lekcja4Zadanie2 {
    public static void main(String[] args) {

        int[] tab = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr = new int[tab.length];
        // wynik: 6, 5, 4, 3, 2, 1

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();

        for (int i = 0; i < tab.length; i++)
            arr[i] = tab[tab.length - 1 - i];

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
