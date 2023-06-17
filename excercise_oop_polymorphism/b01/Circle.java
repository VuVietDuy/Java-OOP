package excercise_oop_polymorphism.b01;

public class Circle extends Shape{
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimete() {
        return radius * Math.PI;
    }

    public String toString() {
        return radius + " - " 
        + color + " - " 
        + filled + " - " 
        + getArea() + " - " 
        + getPerimete();
    }
}
