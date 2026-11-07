package time0;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // style: DateFormat.SHORT, MEDIUM, LONG или FULL
    public String getBirthDate(int style) {
        DateFormat df = DateFormat.getDateInstance(style, Locale.forLanguageTag("ru"));
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return name + ", дата рождения: " + getBirthDate(DateFormat.MEDIUM);
    }
}
