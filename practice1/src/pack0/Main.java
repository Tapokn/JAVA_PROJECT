package pack0;

public class Main {
    public static void main(String[] args) {
        System.out.println("ОТЛАДКА: Используется несколько классов, а вызываются они в Main");
        System.out.println("Выполнение задач 3-7:");

        System.out.println("\n=== Задание 3 ===");
        Task3.solve();

        System.out.println("\n=== Задание 4 ===");
        Task4.solve();

        System.out.println("\n=== Задание 5 ===");
        Task5.solve(args); // передаём args из Main в Task5, чтобы аргументы командной строки дошли до задачи

        System.out.println("\n=== Задание 6 ===");
        Task6.solve();

        System.out.println("\n=== Задание 7 ===");
        Task7.solve();
    }
}