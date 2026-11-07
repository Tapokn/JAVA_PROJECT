package time0;

import java.text.DateFormat;
import java.util.Calendar;

public class Ex3 {
    public static void solve() {
        Calendar cal = Calendar.getInstance();
        cal.set(2004, Calendar.MARCH, 15);

        Student student = new Student("Иванова Анна", cal.getTime());

        System.out.println(student);
        System.out.println("Короткий: " + student.getBirthDate(DateFormat.SHORT));
        System.out.println("Средний: " + student.getBirthDate(DateFormat.MEDIUM));
        System.out.println("Длинный: " + student.getBirthDate(DateFormat.LONG));
        System.out.println("Полный: " + student.getBirthDate(DateFormat.FULL));
    }

    public static void main(String[] args) {
        solve();
    }
}
