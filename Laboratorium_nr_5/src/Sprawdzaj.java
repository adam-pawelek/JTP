import java.util.ArrayList;

public class Sprawdzaj {


    public boolean sprzeczne(ArrayList<Kafelki> niebieskie,ArrayList<Kafelki>  czerwone,int x,int y){
        for (Kafelki k:czerwone){
            if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                return false;
                //  System.out.println("taak");
            }
        }
        for (Kafelki k:niebieskie){
            if (k.od_x < x && k.do_x > x && k.od_y < y && k.do_y > y){
                return false;
                //  System.out.println("taak");
            }
        }
        return  true;
    }

    public int bijpc(ArrayList<Kafelki> niebieskie,ArrayList<Kafelki>  czerwone,int x,int y, Kafelki pamietaj){
        int byl = 0;
        Kafelki dousun = new Kafelki();
        for (Kafelki k: niebieskie){
            if (k.od_x + k.dlugosc < x && k.do_x + k.dlugosc > x && k.od_y - k.dlugosc < y && k.do_y - k.dlugosc > y){
                byl = 1;
                dousun = k;
            }
        }
        if (byl == 0){
            return  0;
        }


        System.out.println("no dobra tutaj");
        niebieskie.remove(dousun);
        czerwone.remove(pamietaj);
        pamietaj.dodaj(2* pamietaj.dlugosc, -2* pamietaj.dlugosc);
        czerwone.add(pamietaj);
        //pamietaj.dodaj();

        return 1;

    }


    public int bijlc(ArrayList<Kafelki> niebieskie,ArrayList<Kafelki>  czerwone,int x,int y, Kafelki pamietaj){
        int byl = 0;
        Kafelki dousun = new Kafelki();
        for (Kafelki k: niebieskie){
            if (k.od_x - k.dlugosc < x && k.do_x - k.dlugosc > x && k.od_y - k.dlugosc < y && k.do_y - k.dlugosc > y){
                byl = 1;
                dousun = k;
            }
        }
        if (byl == 0){
            return  0;
        }


        System.out.println("no dobra tutaj");
        niebieskie.remove(dousun);
        czerwone.remove(pamietaj);
        pamietaj.dodaj(-2* pamietaj.dlugosc, -2* pamietaj.dlugosc);
        czerwone.add(pamietaj);
        //pamietaj.dodaj();


        return 1;
    }

    public int bijpn(ArrayList<Kafelki> niebieskie,ArrayList<Kafelki>  czerwone,int x,int y, Kafelki pamietaj){
        int byl = 0;
        Kafelki dousun = new Kafelki();
        for (Kafelki k: czerwone){
            if (k.od_x + k.dlugosc < x && k.do_x + k.dlugosc > x && k.od_y + k.dlugosc < y && k.do_y + k.dlugosc > y){
                byl = 1;
                dousun = k;
            }
        }
        if (byl == 0){
            return  0;
        }


        System.out.println("no dobra tutaj");
        czerwone.remove(dousun);
        niebieskie.remove(pamietaj);
        pamietaj.dodaj(2* pamietaj.dlugosc, 2* pamietaj.dlugosc);
        niebieskie.add(pamietaj);
        //pamietaj.dodaj();


        return 1;
    }

    public int bijln(ArrayList<Kafelki> niebieskie,ArrayList<Kafelki>  czerwone,int x,int y, Kafelki pamietaj){
        int byl = 0;
        Kafelki dousun = new Kafelki();
        for (Kafelki k: czerwone){
            if (k.od_x - k.dlugosc < x && k.do_x - k.dlugosc > x && k.od_y + k.dlugosc < y && k.do_y + k.dlugosc > y){
                byl = 1;
                dousun = k;
            }
        }
        if (byl == 0){
            return  0;
        }


        System.out.println("no dobra tutaj");
        czerwone.remove(dousun);
        niebieskie.remove(pamietaj);
        pamietaj.dodaj(-2* pamietaj.dlugosc, 2* pamietaj.dlugosc);
        niebieskie.add(pamietaj);
        //pamietaj.dodaj();


        return 1;
    }









}
