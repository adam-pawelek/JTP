public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(2 ,3);

        Polygon wielokat = new Polygon(p1);
        wielokat.addPoint(4,2);
        wielokat.addPoint(3,3);

        wielokat.sortuj();
        System.out.println(wielokat.toString());

    }
}
