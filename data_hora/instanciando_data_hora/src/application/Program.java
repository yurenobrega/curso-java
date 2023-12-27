package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // Formatador de data e hora;
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Data de agora;
        LocalDate d01 = LocalDate.now();
        // Data e hora de agora;
        LocalDateTime d02 = LocalDateTime.now();
        // Data e hora de agora, mas com fuso horário de Londres;
        Instant d03 = Instant.now();

        // Parse converte de texto para objeto;
        LocalDate d04 = LocalDate.parse("2023-12-27");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-27T11:48:10");
        Instant d06 = Instant.parse("2023-12-27T11:48:10Z");
        Instant d07 = Instant.parse("2023-12-27T11:48:10-03:00");

        // Formato de data padrão no Brasil;
        LocalDate d08 = LocalDate.parse("17/12/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("17/12/2023 11:57", fmt2);

        LocalDate d10 = LocalDate.of(2023, 12, 27);
        LocalDateTime d11 = LocalDateTime.of(2023, 12, 27, 12, 1);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
