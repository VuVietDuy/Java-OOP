package excercise_oop_polymorphism.b02;

public class MoveableCircle implements Moveable{
    public int radius;
    public MoveablePoint center;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        return radius + " - "
        + center.toString();
    }

    @Override
    public void moveUp() {
        this.center.x = center.x + center.xSpeed;
    }

    public void moveDown() {
        this.center.x = center.x - center.xSpeed;
    }

    public void moveLeft() {
        this.center.y = center.y - center.ySpeed;
    }

    public void moveRight() {
        this.center.y = center.y + center.ySpeed;
    }
}
