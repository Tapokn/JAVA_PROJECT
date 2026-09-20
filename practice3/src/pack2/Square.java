package pack2;

// Квадрат — частный случай прямоугольника с равными сторонами,
// поэтому наследуемся от Rectangle, а не от Shape напрямую.
public class Square extends Rectangle {

    public Square() {
        super();                    // сторона = 1.0 по умолчанию из Rectangle()
    }

    public Square(double side) {
        super(side, side);          // ширина = длина = side
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return width; }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    // Переопределяем сеттеры родителя: у квадрата нельзя менять
    // ширину и длину по отдельности — они всегда равны.
    @Override
    public void setWidth(double side) { setSide(side); }

    @Override
    public void setLength(double side) { setSide(side); }

    @Override
    public String toString() {
        return "Квадрат[сторона=" + getSide()
                + ", цвет=" + color + ", залита=" + filled + "]";
    }
}