package excercise_oop_polymorphism.b01;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    public  double getPerimete() {
        return width + height;
    }

    public String toString() {
        return width + " - " 
        + height + " + " 
        + color + " - " 
        + filled + " - " 
        + getArea() + " - " 
        + getPerimete();
    }
}
