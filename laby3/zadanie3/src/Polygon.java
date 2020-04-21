import java.util.ArrayList;
import java.util.Comparator;

public class Polygon implements  Figure, Comparable<Polygon> {
    public ArrayList<Point>  punkty = new ArrayList<>();

    @Override
    public void move(double x, double y){
        for(Point p: punkty){
            p.move(x,y);
        }
    }

    @Override
    public  void flip(){
        for (Point p: punkty){
            p.flip();
        }
    }

    public void sortuj(){
        punkty.sort(new Comparator<Point>() {
            @Override
            public int compare(Point point, Point t1) {
                if (point.x > t1.x){
                    return 1;
                }
                else if(point.x == t1.x){
                    if(point.y > t1.y){
                        return 1;
                    }
                    else {
                        return -1;
                    }
                }
                else {
                    return -1;
                }
            }
        });
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Polygon polygon = (Polygon) o;
        this.sortuj();
        polygon.sortuj();
        if(this.punkty.size() != polygon.punkty.size()){
            return false;
        }
        int takie_same = 1;

        for(int i = 0; i < this.punkty.size(); i++){
            if(punkty.get(i) != polygon.punkty.get(i)){
                takie_same = 0;
            }
        }
        if(takie_same == 1){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString(){
        String wynik = "Punkty wielokata to \n";
        for(Point p: punkty){
            wynik += p.toString();
            wynik+= "\n";
        }
        return wynik;
    }

    public Polygon(Point p1){
        punkty.add(p1);
    }

    public Polygon(ArrayList<Point>  punkty){
        this.punkty = punkty;
    }

    public void addPoint(Point p1){
        punkty.add(p1);
    }

    public  void addPoint(double x ,double y){
        Point p1 = new Point(x,y);
        punkty.add(p1);
    }


    @Override
    public int compareTo(Polygon polygon) {
        if (this.punkty.size() > polygon.punkty.size()){
            return 1;
        }
        else if(this.punkty.size() < polygon.punkty.size()){
            return -1;
        }
        else{
            this.sortuj();;
            polygon.sortuj();
            for(int i = 0; i < this.punkty.size(); i++){
                Point point = this.punkty.get(i);
                Point t1 = polygon.punkty.get(i);
                if (point.x > t1.x){
                    return 1;
                }
                else if(point.x == t1.x){
                    if(point.y > t1.y){
                        return 1;
                    }
                    else {
                        return -1;
                    }
                }
                else {
                    return -1;
                }
            }
        }
        return 0;
    }
}


