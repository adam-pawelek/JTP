import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
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
            this.sortuj();
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

    //zadanie 4
    //zakladam ze wielokat wypukly i wierzcholki sa podawane po koleji

    public  double obowd() throws Exception{
        this.sort_punkty();
        if (punkty.size() < 3){
            throw new Exception("za mala liczba punktow");
        }
        double sum = 0;
        for(int i = 0; i < punkty.size(); i++){
            sum += punkty.get(i).odl(punkty.get((i+1)%punkty.size()));
            System.out.println(sum);
        }

        return  sum;
    }

    public  double pole() throws Exception{
        this.sort_punkty();
        if (punkty.size() < 3){
            throw new Exception("za mala liczba punktow");
        }
        double sum = 0;
        double wyn1;
        double wyn2;
        for (int i = 0; i < punkty.size(); i++){
            wyn1 = punkty.get((i + 1) % punkty.size()).x + punkty.get(i).x;
            wyn2 = punkty.get((i+ 1)% punkty.size()).y - punkty.get(i).y;
            sum+= wyn1 * wyn2;
        }
        sum /= 2;
        return Math.abs(sum);
    }


    public Point znajdz_srodek(){

        int x = 0;
        int y = 0;
        for (Point p : punkty) {
            x += p.x;
            y += p.y;
        }
        Point center = new Point(0, 0);
        center.x = x / punkty.size();
        center.y = y / punkty.size();
        return center;
    }

    public ArrayList<Point> sort_punkty() {
        // get centroid
        Point center = znajdz_srodek();
        Collections.sort(punkty, (a, b) -> {
            double a1 = (Math.toDegrees(Math.atan2(a.x - center.x, a.y - center.y)) + 360) % 360;
            double a2 = (Math.toDegrees(Math.atan2(b.x - center.x, b.y - center.y)) + 360) % 360;
            return (int) (a1 - a2);
        });
        return punkty;
    }







}


