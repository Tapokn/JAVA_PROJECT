package time0;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Год: ");
        int year = scanner.nextInt();
        System.out.print("Месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Число: ");
        int day = scanner.nextInt();
        System.out.print("Часы: ");
        int hours = scanner.nextInt();
        System.out.print("Минуты: ");
        int minutes = scanner.nextInt();

        // Calendar (месяцы с 0, поэтому month - 1)
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hours, minutes, 0);

        // Date получаем из Calendar
        Date date = cal.getTime();

        System.out.println("Date: " + date);
        System.out.printf("Calendar: %02d.%02d.%d %02d:%02d%n",
                cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE));
    }
}