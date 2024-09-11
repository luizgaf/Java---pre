import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Fuso{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Hora em utc:      "+ utc.format(formatter));

        ZonedDateTime bsb = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Hora em Brasilia: "+ bsb.format(formatter));

        ZonedDateTime jpn = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Hora em Tokyo:    "+ jpn.format(formatter));
    }
}