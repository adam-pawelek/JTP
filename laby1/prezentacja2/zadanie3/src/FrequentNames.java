import java.util.*;

public class FrequentNames {

    public List<Person> names = new ArrayList<>();

    public FrequentNames(){

    }


    public void add(Person osoba){
        names.add(osoba);
    }

    public String chose(){

        String imie = new String();
        Person osoba = new Person();
        Person pom = new Person();
        int ile = 0;
        int maxx = 0;
        for(int i = 0; i < names.size(); i++){
            osoba = names.get(i);
            ile = 0;
            for(int j = 0; j < names.size(); j++){
                pom = names.get(j);
                if (osoba.imie == pom.imie){
                    ile++;
                }
            }
            if (ile > maxx){
                maxx = ile;
                imie = osoba.imie;
            }
        }

        for(int i = 0; i < names.size(); i++){
            osoba = names.get(i);
            if (osoba.imie == imie){
                names.remove(i);
                i--;
               // System.out.println(i);
            }

        }


        return imie;
    }



}
