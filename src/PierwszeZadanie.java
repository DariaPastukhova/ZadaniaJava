public class PierwszeZadanie {
    public static void main(String[] args) {
        int age = 80;

        if (age <= 18) return;
        if (age > 95) return;

        if (age < 18) {
            System.out.println("Osoba jest dzieckiem");
        } else if (age <= 35) {
            System.out.println("Osoba jest młoda");
        } else if (age <= 59) {
            System.out.println("Osoba jest średniego wieku");
        } else {
            System.out.println("Osoba jest stara");
        }

    }
}