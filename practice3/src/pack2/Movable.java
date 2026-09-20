package pack2;

// interface — набор абстрактных методов без реализации.
// Класс, реализующий интерфейс, обязан реализовать все его методы.
// В отличие от абстрактного класса, интерфейсов у класса может быть много.
public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}