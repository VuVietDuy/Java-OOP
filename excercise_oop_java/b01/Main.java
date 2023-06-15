package excercise_oop_java.b01;

public class Main {
    /*
     * Access modifier
     * Tinh dong goi
     */
    public static void main(String[] args) {

        Circle cir = new Circle();
        cir.setRadius(4);
        cir.setColor("red");

        display(cir);
    }

    public static void display(Circle cir) {
        System.out.println("Radius: " + cir.getRadius());
        System.out.println("Color: " + cir.getColor());
        System.out.println("Area: " + cir.getArea());
    }
}
