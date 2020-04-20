import java.util.ArrayList;

public class Group implements Figure{
    ArrayList<Polygon>grupa;

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


}
