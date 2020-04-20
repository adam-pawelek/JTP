import java.util.Scanner;

public class ThreeAttempts {

    public static float sczytaj() throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe zmiennoprzecinkowa");
        float liczba;
        liczba = scan.nextFloat();
        return liczba;

    }

    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            try {
                sczytaj();
                System.out.println("Wpisales dobra liczbe!!!!");
                break;
            } catch (Exception e) {
                System.out.println("Blad wpisales cos innego");
            }
        }

    }
}
