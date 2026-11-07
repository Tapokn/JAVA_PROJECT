package time0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Дата получения задания (задана вручную)
        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.NOVEMBER, 7, 10, 0, 0);
        Date received = cal.getTime();

        // Дата сдачи - текущая
        Date submitted = new Date();

        System.out.println("Разработчик: Дорофеева");
        System.out.println("Получено: " + sdf.format(received));
        System.out.println("Сдано: " + sdf.format(submitted));
    }
}