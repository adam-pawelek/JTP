import java.util.ArrayList;

/***
 * Klasa która synchronizuje sumowanie wątków
 */

public class Sumuj {
    private double wynik = 0;
    ArrayList<Integer> tablica = new ArrayList<Integer>();


    /***
     *  Konstruktor klasy
     * @param tablica - tablica wspólczynnikow wielomianu
     */
    public Sumuj(ArrayList<Integer> tablica){
        this.tablica = tablica;
    }

    /***
     * dodaje liczbę do wyniku
     * @param liczba - liczba która chcemy dodać
     */
    public synchronized void dodaj(double liczba){
        wynik += liczba;
    }

    /***
     * Odejmuję liczbę od wyniku
     * @param liczba - liczba która chcemy odjąć
     */
    public synchronized void odejmij(double liczba){
        wynik -= liczba;
    }

    /***
     *
     * @return - zwrca wynik działania wątków
     */
    public synchronized double get(){
        return  wynik;
    }

    /***
     * Liczy liczbę podniesioną do odpowiedniej potęgi
     * @param x - liczba
     * @param ktora - do ktorej potegi
     * @return - zwraca wynik
     */
    public  synchronized double potega(double x, int ktora){
        double wyn  = 1;
        for(int i = 0; i < ktora; i++){
            wyn = wyn * x;
        }
        return wyn;
    }

    /***
     * Liczy dunkcję dla podanego x
     * @param x - liczba na osi x
     * @return - zwraca wynik
     */
    public synchronized double licz_wielomian( double x){
        double pomwyn = 0;
        for (int i = tablica.size() - 1; i >= 0; i--){
            pomwyn += potega(x,i) * tablica.get(i);
        }
        return  pomwyn;
    }
}
