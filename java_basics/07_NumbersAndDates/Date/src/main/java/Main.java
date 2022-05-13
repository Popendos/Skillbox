import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 13;
        int month = 04;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        String text = "";

        int i = 0;

        while (true) {
            if (birthday.isAfter(today)) {
                break;
            } else {
                text = text + i++ + " - " + birthday.format(formatter) + System.lineSeparator();
                birthday = birthday.plusYears(1);
            }
        }
        return text;


    }
}





