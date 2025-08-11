package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class atividade1 {
    public static void main(String[] args) {
        

        // https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/HH/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
        Instant d06 = Instant.parse("2025-03-12T01:03:25-03:00");
        Instant d07 = Instant.parse("2025-03-12T01:03:25Z");
        LocalDate d08 = LocalDate.parse("07/06/2025" , fmt1);
        LocalDateTime d09 = LocalDateTime.parse("07/06/2025 22:22" , fmt2);
        LocalDate d10 = LocalDate.of(2022, 11, 29);
        LocalDateTime d11 = LocalDateTime.of(2025, 9, 21, 12, 30, 45);
        LocalDate ss = LocalDate.now();


        System.out.println("Date: " + d01);
        System.out.println("\nDate Hour: " + d02);
        System.out.println("\nInstant 'GreenWich': " + d03);
        System.out.println("\nLocal Date Parse: " + d04);
        System.out.println("\nLocal Date Time Parse: " + d05);
        System.out.println("\nInstant Parse: " + d06);
        System.out.println("\nInstant Parse original 'Sem +/-' : " + d07);
        System.out.println("\nLocalDateFormat: " + d08);
        System.out.println("\nLocalDateTimeFormat: " + d09);
        System.out.println("\nLocalDate: " + d10);
        System.out.println("\nLocalDateTimeOF: " + d11);
        System.out.println("\nLocal Default Format DateFormatter: " + fmt3);

        System.out.println(ss);
        
        


    }
}
