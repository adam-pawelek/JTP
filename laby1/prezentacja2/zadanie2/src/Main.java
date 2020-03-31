import java.util.List;
import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String args[]){
    Person osoba = new Person("Ada","Kot");

        List<Person> personList = new LinkedList<>();
    Names lista = new Names();
    lista.add(osoba);

    osoba = new Person("Adam","Pawelek");
    lista.add(osoba);

    System.out.println(lista.chose());



    }
}