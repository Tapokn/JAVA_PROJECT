package pack2;

public class Task1 {
    public static void solve() {
        System.out.println("=== Задание 1: Shape, Circle, Rectangle, Square ===");

        // Circle через полный конструктор — можно задать всё сразу.
        Circle c = new Circle(2.5, "красный", true);
        System.out.println(c);
        System.out.printf("Площадь круга: %.3f%n", c.getArea());
        System.out.printf("Периметр круга: %.3f%n", c.getPerimeter());

        Rectangle r = new Rectangle(3.0, 4.0, "синий", false);
        System.out.println(r);
        System.out.printf("Площадь прямоугольника: %.3f%n", r.getArea());
        System.out.printf("Периметр прямоугольника: %.3f%n", r.getPerimeter());

        Square s = new Square(5.0, "зелёный", true);
        System.out.println(s);
        System.out.printf("Площадь квадрата: %.3f%n", s.getArea());
        System.out.printf("Периметр квадрата: %.3f%n", s.getPerimeter());

        // Полиморфизм: ссылка типа Shape указывает на объект подкласса.
        // Во время выполнения вызовется метод именно подкласса — Rectangle.
        Shape shape = new Rectangle(2.0, 6.0, "жёлтый", true);
        System.out.println(shape);
        System.out.printf("Площадь через Shape: %.3f%n", shape.getArea());
        System.out.printf("Периметр через Shape: %.3f%n", shape.getPerimeter());

    }

    public static void main(String[] args) {
        solve();
    }
}