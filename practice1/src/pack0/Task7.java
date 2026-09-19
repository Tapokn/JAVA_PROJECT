package pack0;

public class Task7 {
    // Написать программу, которая с помощью метода класса, вычисляет
    //факториал числа (использовать управляющую конструкцию цикла),
    //проверить работу метода.
    public static long factorial(int n) {
        long result = 1; // начинаем с 1, потому что умножаем
        for (int i = 2; i <= n; i++) { // 1 можно пропустить — на 1 умножать бессмысленно
            result = result * i; // накапливаем произведение: 1*2*3*...*n
        }
        return result; // возвращаем результат
    }

    public static void solve() {
        int n = 5; // проверочное число
        System.out.println(n + "! = " + factorial(n)); // сразу печатаем результат вызова метода
    }

    public static void main(String[] args) {
        solve();
    }
}