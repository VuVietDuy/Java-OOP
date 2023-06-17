package excercise_oop_polymorphism.b01;

public class Square extends Rectangle{
    
    public Square() {}

    public Square(double side) {
        this.width = side;
        this.height = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return height;
    }

    public void setSide(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public String toString() {
        return width + " - " 
        + color + " - " 
        + filled + " - " 
        + getArea() + " - " 
        + getPerimete();
    }
}
