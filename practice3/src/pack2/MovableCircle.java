package pack2;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;    // композиция: круг «содержит» точку-центр

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Движение круга = движение его центра?
    @Override
    public void moveUp() { center.moveUp(); }

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "Движущийся круг[радиус=" + radius + ", центр: " + center + "]";
    }
}