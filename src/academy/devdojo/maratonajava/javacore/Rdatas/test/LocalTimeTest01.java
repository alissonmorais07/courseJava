package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 14, 40);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(timeNow.withNano(0)); //Pegar a hora sem os nanos-segundos
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
