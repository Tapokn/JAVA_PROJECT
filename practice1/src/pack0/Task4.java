package pack0;

import java.util.Scanner;

public class Task4 {
    // Написать программу, в результате которой массив чисел вводится
    //пользователем с клавиатуры считается сумма элементов целочисленного массива
    //с помощью циклов do while, while, также необходимо найти максимальный и
    //минимальный элемент в массиве, результат выводится на экран.
    public static void solve() {
        Scanner sc = new Scanner(System.in); // Scanner из пакета java.util, импорт в начале файла класса, создаём объект Scanner перед использованием

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt(); // nextInt() считывает целое число из потока ввода

        int[] numbers = new int[n]; // new обязателен, размер вычисляется на ходу (это не int[] = {1, 2, 3}, где вычиляеться сразу

        // Ввод элементов через do while
        int i = 0;
        do {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
            i++;
        } while (i < n);

        // Сумма через while
        int sumWhile = 0;
        i = 0;
        while (i < n) {
            sumWhile += numbers[i];
            i++;
        }

        // Сумма через do while
        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < n);

        // Минимум и максимум
        int min = numbers[0];
        int max = numbers[0];
        for (i = 1; i < n; i++) { // начинаем с индекса 1, нулевой уже взят
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Сумма (while):    " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    public static void main(String[] args) { // а это чтобы не запускаться из main а прямо здесь
        solve();
    }
}