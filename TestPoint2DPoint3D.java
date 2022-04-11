package Point2DAnd3D;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(3,4);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        Pont3D p3a = new Pont3D(1,2,3);
        System.out.println(p3a);
        Pont3D p3b = new Pont3D();
        System.out.println(p3b);
        p2a.setX(1);
        p2a.setY(2);
        System.out.println(p2a);
        p2b.setX(4);
        p2b.setY(5);
        System.out.println(p2b);
        p3a.setX(1);
        p3a.setY(2);
        p3a.setZ(3);
        System.out.println(p3a);
    }
}
