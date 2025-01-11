package az.edu.turing.module02.part01.lesson18;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Cari tarixi əldə edir
        LocalDate specificDate = LocalDate.of(2024, Month.JANUARY, 1); // Müəyyən tarix
        LocalDate parsedDate = LocalDate.parse("2024-12-25"); // String-dən çevrilir


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter); // Tarixi string-ə çevirir
        System.out.println("Formatlanmış tarix: " + formattedDate);

        // Tarixi dəyişmək üçün:
        LocalDate nextWeek = today.plusWeeks(1); // Bir həftə əlavə edir
        LocalDate lastMonth = today.minusMonths(1); // Bir ay çıxır
        LocalDate nextYear = today.plusYears(1); // Bir il əlavə edir

        // Tarixlər arasında müqayisə:
        boolean isBefore = today.isBefore(specificDate); // Bugün spesifik tarixdən əvvəldir?
        boolean isAfter = today.isAfter(parsedDate); // Bugün parsedDate-dən sonradır?

        // Həftənin günü və ilin ayı:
        DayOfWeek dayOfWeek = today.getDayOfWeek(); // Həftənin günü
        int dayOfMonth = today.getDayOfMonth(); // Ayın günü
        Month month = today.getMonth(); // Ayın adı

        System.out.println("Bu gün: " + today);
        System.out.println("Bir həftə sonra: " + nextWeek);
        System.out.println("Keçən ay: " + lastMonth);
        System.out.println("Bir il sonra: " + nextYear);
        System.out.println("Ayın günü: " + dayOfMonth);
        System.out.println("Həftənin günü: " + dayOfWeek);
        System.out.println("Ay: " + month);
        System.out.println("Spesifik tarixdən əvvəl? " + isBefore);



        LocalTime now = LocalTime.now(); // Cari vaxt
        LocalTime specificTime = LocalTime.of(14, 30, 15); // Müəyyən vaxt
        LocalTime parsedTime = LocalTime.parse("18:45:30"); // String-dən çevrilir

        // Vaxt dəyişmək:
        LocalTime oneHourLater = now.plusHours(1); // Bir saat əlavə edir
        LocalTime tenMinutesEarlier = now.minusMinutes(10); // 10 dəqiqə çıxır

        // Vaxt fərqini hesablamaq:
        long minutesBetween = ChronoUnit.MINUTES.between(specificTime, parsedTime); // Dəqiqə fərqi
        long secondsBetween = ChronoUnit.SECONDS.between(specificTime, parsedTime); // Saniyə fərqi

        System.out.println("Cari vaxt: " + now);
        System.out.println("Bir saat sonra: " + oneHourLater);
        System.out.println("10 dəqiqə əvvəl: " + tenMinutesEarlier);
        System.out.println("Dəqiqə fərqi: " + minutesBetween);
        System.out.println("Saniyə fərqi: " + secondsBetween);




        LocalDateTime now2 = LocalDateTime.now(); // Cari tarix və vaxt
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 31, 23, 59); // Müəyyən tarix və vaxt
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-12-25T18:30:00"); // String-dən çevrilir

        // Tarix və vaxtı dəyişmək:
        LocalDateTime tomorrow = now2.plusDays(1); // Bir gün əlavə edir
        LocalDateTime nextHour = now2.plusHours(1); // Bir saat əlavə edir
        LocalDateTime lastYear = now2.minusYears(1); // Bir il çıxır

        // Tarix və vaxtı bölmək:
        System.out.println("Tarix: " + now2.toLocalDate()); // Tarixi ayırır
        System.out.println("Vaxt: " + now2.toLocalTime()); // Vaxtı ayırır

        // Tarixlər arasında müqayisə:
        boolean isBefore2 = now2.isBefore(specificDateTime); // İndi specificDateTime-dən əvvəlmi?
        boolean isEqual = now2.isEqual(parsedDateTime); // Bərabərdirmi?

        System.out.println("Cari tarix və vaxt: " + now2);
        System.out.println("Sabah: " + tomorrow);
        System.out.println("Bir saat sonra: " + nextHour);
        System.out.println("Keçən il: " + lastYear);
        System.out.println("Spesifik vaxtdan əvvəl? " + isBefore2);


        ZonedDateTime currentTime = ZonedDateTime.now(); // Cari vaxt zaman zonası ilə
        ZonedDateTime specificZoneTime = ZonedDateTime.now(ZoneId.of("America/New_York")); // Müəyyən zaman zonasında

        // Zaman zonasını dəyişmək:
        ZonedDateTime convertedTime = currentTime.withZoneSameInstant(ZoneId.of("Asia/Baku"));

        System.out.println("Cari zaman zonası vaxtı: " + currentTime);
        System.out.println("New York vaxtı: " + specificZoneTime);
        System.out.println("Bakı vaxtı: " + convertedTime);


        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 14);
        Period period = Period.between(startDate, endDate); // Tarixlər arasındakı fərq

        System.out.println("İllər: " + period.getYears());
        System.out.println("Aylar: " + period.getMonths());
        System.out.println("Günlər: " + period.getDays());

        // Duration ilə işləmək:
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(14, 45);
        Duration duration = Duration.between(startTime, endTime); // Vaxtlar arasındakı fərq

        System.out.println("Saatlar: " + duration.toHours());
        System.out.println("Dəqiqələr: " + duration.toMinutes());

    }
}
