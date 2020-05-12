public class Kafelki {
    int od_x;
    int od_y;
    int do_x;
    int do_y;
    int numer;
    Character slowo;
    public Kafelki (int od_x,int od_y,int do_x,int do_y, int numer,Character slowo){
        this.od_x = od_x;
        this.od_y = od_y;
        this.do_x = do_x;
        this.do_y = do_y;
        this.numer = numer;
        this.slowo = slowo;
    }
    @Override
    public String toString(){

        return ("Numer pola  " + numer + "" + slowo);
    }
}
