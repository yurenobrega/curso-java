package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-12-27");
        LocalDateTime d02 = LocalDateTime.parse("2023-12-27T15:56:26");
        Instant d03 = Instant.parse("2023-12-27T15:56:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);

        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
        System.out.println("t4 = " + t4.toDays());
    }
}
