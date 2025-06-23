import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndStuff {
    public static void main(String[] args) {
        // LocalTime data = LocalTime.now();

        // LocalDateTime dateTime= LocalDateTime.now();

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm");
        // String data= dateTime.format(formatter);

        LocalDate date1 = LocalDate.of(2025, 8, 1);
         LocalDate date2 = LocalDate.of(2026, 8, 1);
        LocalDateTime dateTime = LocalDateTime.of(2026, 1, 7, 8, 0, 0) ;

        if (date1.isBefore(date2)) {
            System.out.println("before");
        }

    }
}
