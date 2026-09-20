package pack2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();                    // вызов конструктора Shape() — задаёт цвет и заливку по умолчанию
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);       // передаём цвет и заливку в конструктор родителя
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Конкретная реализация абстрактных методов родителя.
    // Без этих двух методов класс пришлось бы пометить abstract.
    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return "Круг[радиус=" + radius + ", цвет=" + color + ", залита=" + filled + "]";
    }
}