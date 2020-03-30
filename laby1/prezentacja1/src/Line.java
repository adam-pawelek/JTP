public class Line {
    Point p1;
    Point p2;

    public Line(int x1, int y1,int x2, int y2){
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }


    public void move(int x, int y){  // przesuniecie o wektor
        this.p1.move(x,y);
        this.p2.move(x,y);
    }
    public void flip(){
        this.p1.flip();
        this.p2.flip();
    }

    public void wypisz(){
        System.out.println("punk 1 to" );
    }

    public String toString(){
        String wynik = "Punkt 1 \n";
        wynik += p1.toString();
        wynik +="\n";
        wynik += "Punkt 2 \n";
        wynik += p2.toString();
        return wynik;
    }





}
