package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2025-05-18");
        LocalTime time = LocalTime.parse("16:05:27");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);
        System.out.println(ltd1);
        System.out.println(ltd2);
    }
}
