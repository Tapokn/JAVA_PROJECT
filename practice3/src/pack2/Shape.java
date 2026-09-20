package pack2;

// abstract — класс нельзя инстанцировать через new Shape().
// Он существует только как шаблон для подклассов.
public abstract class Shape {
    // protected: поле видно подклассам и классам того же пакета,
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "белый";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    // abstract без тела — конкретную реализацию дадут подклассы.
    // У круга площадь одна, у прямоугольника — другая, универсальной формулы нет.
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Фигура[цвет=" + color + ", залита=" + filled + "]";
    }
}