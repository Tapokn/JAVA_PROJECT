package pack2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft     = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Геттеры — чтобы из драйвера можно было изменить скорость точки
    // и проверить работу isSpeedEqual() на разных значениях.
    public MovablePoint getTopLeft()     { return topLeft; }
    public MovablePoint getBottomRight() { return bottomRight; }

    public boolean isSpeedEqual() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        if (!isSpeedEqual()) return;
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (!isSpeedEqual()) return;
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (!isSpeedEqual()) return;
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (!isSpeedEqual()) return;
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Движущийся прямоугольник[верх-лево: " + topLeft
                + ", низ-право: " + bottomRight + "]";
    }
}