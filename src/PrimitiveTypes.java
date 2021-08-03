public class PrimitiveTypes {
    public static void main(String[] args) {
       int x = 5;
       int y = 1;
        System.out.println("x = " + x);
        // tutaj chciałam coś osiągnąć ale nie wiem co
        x = 8;
        System.out.println("x = " + x);

        x = x / y;
        System.out.println("x = " + x);

        x = 2147483647;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
    }
}
