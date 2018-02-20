package de.mhaeusser.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        go1();
        go2();
        go3();
    }
    
    public static void go1() {
        String date = LocalDate.parse("2015-05-04")
                .format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
    
    public static void go2() {
        String date = LocalDateTime.parse("2015-05-04T12:23:45")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
    
    // throws java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay 
    public static void go3() {
        String date = LocalDate.parse("2015-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
