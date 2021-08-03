public class PierwszeZadanie {
    public static void main(String[] args) {
        int age = 50;

        if (age > 49) {
            System.out.println("Osoba jest stara");
            if (age == 50) {
                System.out.println("Osoba jest średniego wieku");
                if (age < 49) {
                    System.out.println("Osoba jest młoda lub dzieckiem");

                } else {
                    System.out.println("Osoba jest młoda lub dzieckiem");
                }
            }
        }
    }
}
