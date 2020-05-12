public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2 ,3);

        Polygon wielokat = new Polygon(p1);
        wielokat.addPoint(4,2);
        wielokat.addPoint(3,3);

        wielokat.sortuj();
        System.out.println(wielokat.toString());


        //obliczenie pola trojkata

        p1 = new Point(0,0);
        Point p3 = new Point(2,0);
        p2 = new Point(0,2);

        Polygon trojkat = new Polygon(p1);
        trojkat.addPoint(p2);
        trojkat.addPoint(p3);

        //przed kazda metoda obwod i pole wywolywany jest sortowanie katowe

       //obowd
        try {
            System.out.println("Obwod to " + trojkat.obowd());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Pole
        try {
            System.out.println("Pole to " + trojkat.pole());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println(trojkat.toString());
    }
}
