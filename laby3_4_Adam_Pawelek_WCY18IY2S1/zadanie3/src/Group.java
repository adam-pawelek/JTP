import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Group implements Figure{
    ArrayList<Polygon>grupa = new ArrayList<>();

    @Override
    public void move(double x, double y) {
        for(Polygon p: grupa) {
            p.move(x, y);
        }
    }

    @Override
    public void flip(){
        for(Polygon p: grupa){
            p.flip();
        }
    }

    @Override
    public boolean equals(Object o){
        Collections.sort(grupa);
        int takie_same = 1;
        Group pomocniczy = (Group) o;
        for (int i = 0; i < grupa.size(); i++){
            if (! pomocniczy.grupa.get(i).equals(grupa.get(i))){
                    takie_same = 0;
            }
        }
        if(takie_same == 1){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        String wynik ="";
        for(int i = 0; i < grupa.size(); i++){
            wynik += "Teraz Polygon nr ";
            wynik += Integer.toString(i);
            wynik += grupa.get(i).toString();
            wynik += "\n";
        }
        return wynik;
    }


}
