import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Sicko sicko = new Sicko();
        sicko.ahoj();
        Fein fein = new Fein();
        String slovicko = sc.nextLine();
        fein.slovo(slovicko);
        Cheese cheese = new Cheese();
        int cislo = sc.nextInt();
        cheese.cisla(cislo);
        Martin martin = new Martin();
        martin.nasobky();
        Pohled pohled = new Pohled();

        pohled.vetsi();


    }
}