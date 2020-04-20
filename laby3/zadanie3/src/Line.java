public class Line implements Figure {
    public Point p1,p2;

    @Override
    public void move(double x, double y){
        p1.move(x,y);
        p2.move(x,y);
    }

    @Override
    public void flip(){
        p1.flip();
        p2.flip();
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Line linia = (Line) o;
        if(this.p1 == linia.p1 && this.p2 == linia.p2){
            return true;
        }
        else if(this.p1 == linia.p2 && this.p2 == linia.p1){
            return true;
        }
        return false;
    }

    public String toString(){
        String wynik = "";
        wynik += "Pierwszy Punkt";
        wynik += p1.toString();
        wynik += "Drugi Punkt";
        wynik += p2.toString();
        return wynik;
    }


    //konstruktor

    public Line(double x1, double y1, double x2, double y2){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
    }
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }


}
