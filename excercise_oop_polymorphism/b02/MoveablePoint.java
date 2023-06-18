package excercise_oop_polymorphism.b02;

public class MoveablePoint implements Moveable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return x + " - " 
        + y + " - " 
        + xSpeed + " - " 
        + ySpeed;
    }

    @Override
    public void moveUp() {
        this.x = x + xSpeed;
    }

    public void moveDown() {
        this.x = x - xSpeed;
    }

    public void moveLeft() {
        this.y = y - ySpeed;
    }

    public void moveRight() {
        this.y = y + ySpeed;
    }
}
