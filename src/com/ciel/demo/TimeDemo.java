package com.ciel.demo;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.jupiter.api.Test;

/**
 * @author 韦康 date 2021/7/24
 */
public class TimeDemo {
    @Test
    public void test1() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        LocalDate parse = LocalDate.parse("2021-05-21", dtf);
        System.out.println(parse);

        System.out.println("_____________");
        Instant it = Instant.now();//默认是UTC（慢8个小时）时区
        System.out.println(it);
        OffsetDateTime offsetDateTime = it.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        System.out.println(it.toEpochMilli());
    }
    @Test
    public void test2() throws InterruptedException {
        //Duration 时间之间的间隔
        //Period  日期之间的间隔
        Instant it1 = Instant.now();
        Thread.sleep(1000);
        Instant it2 = Instant.now();
        Duration duration = Duration.between(it1, it2);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toMillis());
        System.out.println("**********");
        LocalTime now1 = LocalTime.now();
        Thread.sleep(2000);
        LocalTime now2 = LocalTime.now();
        Duration duration2 = Duration.between(now1, now2);
        System.out.println(duration2);
        System.out.println(duration2.getSeconds());
        System.out.println(duration2.toMillis());
    }

}
