package excercise_oop_inheritance.b01;

public class Cirlce {
    private double radius;
    private String color;

    public Cirlce() {}

    public Cirlce(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "radius: " + radius + " color: " + color;
    }
}
