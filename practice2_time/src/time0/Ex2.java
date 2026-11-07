package time0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.print("Введите дату и время (дд.мм.гггг чч:мм): ");
        Date entered = sdf.parse(scanner.nextLine());
        Date now = new Date();

        System.out.println("Текущая дата: " + sdf.format(now));
        System.out.println("Введённая дата: " + sdf.format(entered));

        if (entered.before(now)) {
            System.out.println("Введённая дата раньше текущей");
        } else if (entered.after(now)) {
            System.out.println("Введённая дата позже текущей");
        } else {
            System.out.println("Даты совпадают");
        }
    }
}