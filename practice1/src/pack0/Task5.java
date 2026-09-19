package pack0;

public class Task5 {
    // Написать программу, в результате которой выводятся на экран аргументы
    //командной строки в цикле for.
    public static void solve(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }

    public static void main(String[] args) {
        solve(args); // передаём args из main в solve, так же в intelij IDEA МОЖНО ВЫБРАТЬ КОНФИГУРАЦИЮ ЗАПУСКА ЧЕРЕЗ КОНТЕКСТНОЕ МЕНЮ ПРЯМ ИЗ ЭТОГО ФАЙЛА.
    }
}