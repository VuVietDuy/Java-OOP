package excercise_oop_inheritance.b01;

public class Cylinder extends Cirlce {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);// goi Constructor cua class cha
        this.height =  height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
