package Point2DAnd3D;

public class Point2D {
    private int x = 0;
    private int y = 0;

    public Point2D(){
        this.x = 0;
        this.y = 0;
        System.out.println("Point2D with no value x or y added ");
    }
    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("point2D with x y added");
    }

    public int getX() {
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public  void setX(int x){
        this.x = x;
    }
    public void  setY(int y){
        this.y = y;
    }
    @Override
    public  String toString(){
        return "("+ this.x+","+this.y+")";
    }
}
