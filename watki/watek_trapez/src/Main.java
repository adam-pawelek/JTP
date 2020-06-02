import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * Główna klasa wykonują się w niej 2 wątki i liczą przybliżenie całki
 */

public class Main {


    public static void main(String[] args) {
        int stopien = 0;
        ArrayList<Integer> tablica = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj stopień wielomianu: ");
        stopien = scan.nextInt();
        for (int i = stopien; i >= 0; i--){
            System.out.println("podaj współczynnik przy x^" + i + ": ");
            tablica.add(scan.nextInt());
        }

       // System.out.println(tablica);

        Sumuj suma = new Sumuj(tablica);

        System.out.println("Podaj poczatek przedzialu");
        double poczatek = scan.nextDouble();
        System.out.println("Podaj koniec przedzialu");
        double koniec = scan.nextDouble();

        int przedzialy =  100;
        double przyblizenie = (koniec - poczatek) / przedzialy;


        Thread t1 = new Thread(new trapez(poczatek ,poczatek + przyblizenie * (przedzialy / 2) ,przedzialy/2,suma));
        Thread t2 = new Thread(new trapez(poczatek + przyblizenie * (przedzialy / 2)  ,koniec,przedzialy/2,suma));


        t1.start();
        t2.start();



        try {
            t1.join();
            t2.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("wynik "+ suma.get());


    }
}
