package az.edu.turing.module02.part01.lesson18;

import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateApp {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2002, 7, 15);
        LocalDate currentDate = LocalDate.now();
        Long period = (ChronoUnit.DAYS.between(birthDate, currentDate));
        System.out.println(period);

    }
}