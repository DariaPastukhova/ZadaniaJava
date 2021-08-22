public class Lekcja3Arrays {
    public static void main(String[] args) {
        int tabLength[] = {8, 6, 5, 3, 9, 5, 8, 1}; //8 elements
        int min = tabLength[0];
        int max = tabLength[0];

        for (int i = 0; i < 8; i++) {
            if (tabLength[i] < min) min = tabLength[i];
            if (tabLength[i] > max) max = tabLength[i];
        }
        System.out.println("Najmniejsza liczba w tabeli to: " + min);
        System.out.println("Najwięjsza liczba w tabeli to: " + max);

        }
    }

