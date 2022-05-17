import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(1990, 02, 25);
        LocalDate secondDate = LocalDate.now();
        System.out.println(getPeriodFromBirthday(firstDate, secondDate));


    }


    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {



       Period period = Period.between(firstDate, secondDate);
return "years: " + period.getYears() + " Month: " + period.getMonths() + " Days: " + period.getDays();
    }


}
