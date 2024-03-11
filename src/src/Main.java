import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");


        //modi per formattare una data
        String dateTimeString = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateTimeString2 = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateTimeString3 = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Date time 1: " + dateTimeString);
        System.out.println("Date time 2: " + dateTimeString2);
        System.out.println("Date time 3: " + dateTimeString3);
    }
}