/***
 * Klasa jest stworzona do obliczen 2 watkow
 */

public class Obliczenia {

    /***
     *  Metoda liczy calke
     * @param poczatek - poczatek przedzialu
     * @param koniec - koniec przedzialu
     * @param przedzialy - ilos przedzialow
     * @param suma - zmienna sumujaca
     */

    public void licz_watki(double poczatek, double koniec, int przedzialy,Sumuj suma){

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

    }
}
