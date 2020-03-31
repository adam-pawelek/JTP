public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){  // przesuniecie o wektor
        this.x += x;
        this.y += y;
    }

    public void flip(){
        this.x *= -1;
        this.y *= -1;
    }

    public void  wypisz(){
        System.out.println(x + " " +y);
    }


    public  String toString(){
        String pom1 =  Integer.toString(this.x);
        String pom2 =  Integer.toString(this.y);
        String wynik = "x: ";
        wynik += pom1;
        wynik += " y: ";
        wynik += pom2;

        return  wynik;
    }

}