import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //работа с временем в java / Date Time DateTime UtcTimestamp
        // LocalDate, LocalTime, LocalDateTime, UTC Timestamp

        // LocalDateTime dt1 = LocalDateTime.now();
        // DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy / HH:mm:ss");
        // String dt1Formatted = dt1.format(dtFormatter);

        // System.out.println(dt1);
        // System.out.println(dt1Formatted);

        LocalDateTime dt1 = LocalDateTime.of(2025, 8, 15, 0,0,0);
        LocalDateTime dt2 = LocalDateTime.of(2025, 8, 15, 0,0,0);

        if (dt1.isBefore(dt2)) {
            System.out.println(dt1 + " dt1 is earlier than d2 " + dt2);
        } else if (dt1.isAfter(dt2)) {
            System.out.println(dt1 + " dt1 is later than d2 " + dt2);
        } else if (dt1.isEqual(dt2)) {
            System.out.println(dt1 + " dt1 = dt2 " + dt2);
        }
    }
}
