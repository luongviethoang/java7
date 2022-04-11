package Point2DAnd3D;

public class Pont3D extends Point2D {
    private int z;
    public Pont3D(){
        super();
        this.z=0;
    }

    public Pont3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}

