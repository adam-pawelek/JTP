import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Klasa do testowania watkow
 */
class ObliczeniaTest {

    final double BLAD = .1;  //Dopuszczalny blad

    @Test
    void licz_watki() {
        pierwszy_test();
        drugi_test();
    }


    /***
     * x + 1 -> wynik 60
     */
    void pierwszy_test(){
        Obliczenia obliczenia = new Obliczenia();
        double wyn = 0;
        ArrayList<Integer> tablica = new ArrayList<Integer>();
        tablica.add(1);
        tablica.add(1);
        Sumuj sumatest = new Sumuj(tablica);
        obliczenia.licz_watki(0,10,1000,sumatest);
        assertEquals(true,sumatest.get() - 60.0 < BLAD && 60.0 - sumatest.get() < BLAD);
    }

    /***
     * x^2 -> wynik 333.333
     */
    void drugi_test(){
        Obliczenia obliczenia = new Obliczenia();
        double wyn = 0;
        ArrayList<Integer> tablica = new ArrayList<Integer>();
        tablica.add(1);
        tablica.add(0);
        tablica.add(0);
        Sumuj sumatest = new Sumuj(tablica);
        obliczenia.licz_watki(0,10,10000,sumatest);
        assertEquals(true,sumatest.get() - 333.33 < BLAD && 333.333 - sumatest.get() < BLAD);
    }


    /***
     * Wynik -> 20333,3333
     */
    void trzeci_test(){
        Obliczenia obliczenia = new Obliczenia();
        double wyn = 0;
        ArrayList<Integer> tablica = new ArrayList<Integer>();
        tablica.add(1);
        tablica.add(0);
        tablica.add(1);
        tablica.add(0);
        tablica.add(0);
        Sumuj sumatest = new Sumuj(tablica);
        obliczenia.licz_watki(0,10,10000,sumatest);
        assertEquals(true,sumatest.get() - 20333.3333 < BLAD && 20333.3333 - sumatest.get() < BLAD);
    }




}