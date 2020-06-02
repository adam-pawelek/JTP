/***
 *  Jest to klasa w ktorej tworzy sie watek
 *
 */

public class trapez implements Runnable{
    double poczatek;
    double koniec;
    int przedzialy;
    Sumuj sumuj;

    /***
     *Konstruktor Klasy
     *
     * @param poczatek  - poczatek przedzialu
     * @param koniec  - koniec przedzialu
     * @param przedzialy - ilosc przedzialow
     * @param sumuj - zmienna synchronizujaca dodawanie miedzy watkami
     */
    public trapez(double poczatek, double koniec, int przedzialy, Sumuj sumuj) {
        this.poczatek = poczatek;
        this.koniec = koniec;
        this.przedzialy = przedzialy;
        this.sumuj = sumuj;
    }


    /***
     *  Metoda liczy przybliżenie całki
     */
    @Override
    public void run() {

        double yi;
        double przyblizenie = (koniec - poczatek) / przedzialy;
        double wyn = 0;
        for (int i = 1; i < przedzialy; i++){
            yi = sumuj.licz_wielomian(poczatek + przyblizenie * i);
            wyn+= yi;
        }
        wyn = wyn * 2;
        wyn +=  sumuj.licz_wielomian(poczatek);
        wyn +=  sumuj.licz_wielomian(koniec);
        wyn =  wyn * (koniec - poczatek) / (2 * przedzialy);
        sumuj.dodaj(wyn);


    }
}
