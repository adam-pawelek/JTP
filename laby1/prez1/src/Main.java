public class Main {

    public static void main(String args[]){
        System.out.println("Testowanie punktu");
        //Testowanie punkt
        Point punkt = new Point(1,2);
        System.out.println(punkt.toString());
        punkt.move(1,1);
        System.out.println(punkt.toString());
        punkt.flip();
        System.out.println(punkt.toString());


        // Linia
        System.out.println("Testowanie Lini");
        Line linia = new Line(4,5,3,2);
        System.out.println(linia.toString());
        //Dodanie 1 1
        linia.move(1,1);
        System.out.println("Dodalem 1 1");
        System.out.println(linia.toString());
        // flip
        linia.flip();
        System.out.println("FLIP");
        System.out.println(linia.toString());



    }
}
