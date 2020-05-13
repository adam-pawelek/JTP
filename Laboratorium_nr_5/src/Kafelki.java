import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kafelki {
    int od_x;
    int od_y;
    int do_x;
    int do_y;
    int numer;
    Character slowo;
    int dlugosc;
    int kolor;
    public Kafelki (int od_x,int od_y,int do_x,int do_y, int numer,Character slowo){
        this.od_x = od_x;
        this.od_y = od_y;
        this.do_x = do_x;
        this.do_y = do_y;
        this.numer = numer;
        this.slowo = slowo;
    }

    public Kafelki (int od_x,int od_y,int do_x,int do_y, int dlugosc){
        this.od_x = od_x;
        this.od_y = od_y;
        this.do_x = do_x;
        this.do_y = do_y;
        this.dlugosc = dlugosc;
    }


    public Kafelki (int od_x,int od_y,int do_x,int do_y, int numer,Character slowo, int dlugosc, int kolor){
        this.od_x = od_x;
        this.od_y = od_y;
        this.do_x = do_x;
        this.do_y = do_y;
        this.numer = numer;
        this.slowo = slowo;
        this.dlugosc = dlugosc;
        this.kolor = kolor;  // 0 niebieskie 1 czerwone
    }
    public Kafelki(){

    }

    public  boolean cruchp(int x, int y){
        if (this.od_x + dlugosc < x && this.od_y - dlugosc < y && this.do_x + dlugosc > x && this.do_y - dlugosc > y){
            return true;
        }
        return false;
    }

    public  boolean cruchl(int x, int y){
        if (this.od_x - dlugosc < x && this.od_y - dlugosc < y && this.do_x - dlugosc > x && this.do_y - dlugosc > y){
            return true;
        }
        return false;
    }

    public  boolean nruchp(int x, int y){
        if (this.od_x + dlugosc < x && this.od_y + dlugosc < y && this.do_x + dlugosc > x && this.do_y + dlugosc > y){
            return true;
        }
        return false;
    }

    public  boolean nruchl(int x, int y){
        if (this.od_x - dlugosc < x && this.od_y + dlugosc < y && this.do_x - dlugosc > x && this.do_y + dlugosc > y){
            return true;
        }
        return false;
    }



    public  void dodaj(int x,int y){
        this.od_x += x;
        this.od_y += y;
        this.do_x += x;
        this.do_y += y;
    }


    @Override
    public String toString(){

        return ("Numer pola  " + numer + "" + slowo);
    }
}
