import java.util.List;
import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String args[]){
        Person osoba = new Person("Ada","Kot");

       // List<Person> personList = new LinkedList<>();
        FrequentNames lista = new FrequentNames();
        lista.add(osoba);

        osoba = new Person("Ola","Pawelek");
        lista.add(osoba);

        osoba = new Person("Adam","Pawelek");
        lista.add(osoba);
        osoba = new Person("Adam","Pawelek");
        lista.add(osoba);
        osoba = new Person("Ada","Pawelek");
        lista.add(osoba);

        osoba = new Person("Ada","Pawelek");
        lista.add(osoba);

        System.out.println(lista.chose());
        System.out.println(lista.chose());
        System.out.println(lista.chose());



    }
}