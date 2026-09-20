package pack2;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }

    // Сеттеры нужны, чтобы можно было изменить скорость точки после создания —
    // иначе проверить isSpeedEqual() на разных скоростях невозможно.
    public void setXSpeed(int xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(int ySpeed) { this.ySpeed = ySpeed; }

    @Override
    public void moveUp() { y += ySpeed; }

    @Override
    public void moveDown() { y -= ySpeed; }

    @Override
    public void moveLeft() { x -= xSpeed; }

    @Override
    public void moveRight() { x += xSpeed; }

    @Override
    public String toString() {
        return "Точка(" + x + ", " + y + "), скорость(" + xSpeed + ", " + ySpeed + ")";
    }
}