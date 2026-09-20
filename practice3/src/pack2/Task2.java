package pack2;

public class Task2 {
    public static void solve() {
        System.out.println("=== Задание 2: Movable ===");

        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Начальная точка: " + p);
        p.moveRight();
        p.moveUp();
        System.out.println("После moveRight и moveUp: " + p);

        MovableCircle mc = new MovableCircle(10, 10, 5, 5, 3);
        System.out.println("\nНачальный круг: " + mc);
        mc.moveLeft();
        mc.moveDown();
        System.out.println("После moveLeft и moveDown: " + mc);

        MovableRectangle mr = new MovableRectangle(0, 0, 10, 10, 1, 1);
        System.out.println("\nПрямоугольник: " + mr);
        System.out.println("Скорости точек совпадают: " + mr.isSpeedEqual());
        mr.moveRight();
        System.out.println("После moveRight: " + mr);

        // А вот теперь — реальный тест на разные скорости.
        // Через конструктор это невозможно (обе точки получают одинаковые),
        // поэтому берём точки прямоугольника и меняем скорость одной из них.
        MovableRectangle mr2 = new MovableRectangle(0, 0, 5, 5, 1, 1);
        mr2.getTopLeft().setXSpeed(10);   // ← сломали равенство скоростей
        System.out.println("\nПрямоугольник с разными скоростями: " + mr2);
        System.out.println("Скорости точек совпадают: " + mr2.isSpeedEqual());
        mr2.moveUp();                      // должно ничего не сделать
        System.out.println("После попытки moveUp (не сдвинулся): " + mr2);
    }

    public static void main(String[] args) {
        solve();
    }
}