package excercise_oop_polymorphism.b01;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2, "red", false);
        Shape rectangle = new Rectangle(3, 4, "black", true);
        Shape square = new Square(3, "yelow", true);

        System.out.println("Circle: " + circle.toString());
        System.out.println("Reactangle: " + rectangle.toString());
        System.out.println("Square: " + square.toString());

    }
}
