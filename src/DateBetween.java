import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateBetween {
    public static void main(String[] args) {
        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
        System.out.print((long) ChronoUnit.DAYS.between(dateFrom, dateTo));
            }
    }

