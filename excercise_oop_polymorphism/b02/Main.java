package excercise_oop_polymorphism.b02;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 1, 1, 1);
        MoveableCircle moveableCircle = new MoveableCircle(moveablePoint, 2);
        System.out.println(moveableCircle.toString());
        moveableCircle.moveUp();
        System.out.println(moveableCircle.toString());
        moveableCircle.moveLeft();
        System.out.println(moveableCircle.toString());
        moveableCircle.moveRight();
        System.out.println(moveableCircle.toString());
        moveableCircle.moveDown();
        System.out.println(moveableCircle.toString());
    }
}
