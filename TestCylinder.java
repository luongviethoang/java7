package CircleAndCylinder;

public class TestCylinder {
    public static  void  main(String[] args){
        Cylinder cy1 = new Cylinder();
        System.out.println("radius is "+ cy1.getRadius()
        + "height is " + cy1.getHeight()
        + "color is "+ cy1.getColor()
        + "Base area is " + cy1.getArea());
        Cylinder cy2 = new Cylinder(5.0,2.0, "blue");
        System.out.println("Radius is "+ cy2.getRadius()
        + "height is "+ cy2.getHeight()
        + "color is "+ cy2.getColor()
        + "base area is "+ cy2.getArea());
    }
}
