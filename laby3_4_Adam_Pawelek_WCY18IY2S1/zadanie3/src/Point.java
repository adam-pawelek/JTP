public class Point implements Figure {
    public     double x;
    public     double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public void flip(){
        this.x *= -1;
        this.y *= -1;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Point punkt = (Point) o;
        if(this.x == punkt.x && this.y == punkt.y){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString(){
        return ("x: " + this.x +" y: "+ this.y);
    }


    public double odl (Point p) {
        double x = this.x - p.x;
        double y = this.y - p.y;
        return Math.sqrt(x*x + y*y);
    }

}
