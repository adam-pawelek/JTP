import java.util.List;
import java.util.Random;
import java.util.*;
import java.util.Objects;

public class Names {


    public List<Person>names = new LinkedList<>();

    public Names(){

    }


    public void add(Person osoba){
        names.add(osoba);
    }

    public String chose(){
        Random rand = new Random();
        int ktory = rand.nextInt(names.size());
        Person osoba = names.get(ktory);
        names.remove(ktory);
        return osoba.nazwisko;

    }


}
