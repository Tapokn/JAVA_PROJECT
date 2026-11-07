package time0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex5 {
    static final int N = 50000;

    public static void main(String[] args) {
        test(new ArrayList<Integer>(), "ArrayList");
        test(new LinkedList<Integer>(), "LinkedList");
    }

    static void test(List<Integer> list, String name) {
        System.out.println("--- " + name + " ---");

        // Добавление в конец
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        System.out.println("Добавление в конец: " + (System.nanoTime() - start) / 1000000 + " мс");

        // Вставка в начало
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(0, i);
        }
        System.out.println("Вставка в начало: " + (System.nanoTime() - start) / 1000000 + " мс");

        // Поиск по значению
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.contains(-1); // такого элемента нет, перебор идёт до конца
        }
        System.out.println("Поиск: " + (System.nanoTime() - start) / 1000000 + " мс");

        // Удаление из начала
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.remove(0);
        }
        System.out.println("Удаление из начала: " + (System.nanoTime() - start) / 1000000 + " мс");
    }
}