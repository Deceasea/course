package ru.decease.lesson7.timestamp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(5);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        HumanReadableTimestampImpl formatter = new HumanReadableTimestampImpl();
        String result = formatter.format(timestamp);
        System.out.println(result);
    }
}

class HumanReadableTimestampImpl implements HumanReadableTimestamp {

    @Override
    public String format(LocalDateTime timestamp) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(timestamp, now);

        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();

        if (minutes < 60) {
            return formatMinutes(minutes);
        } else if (hours < 24) {
            return formatHours(hours);
        } else if (days == 1) {
            return "опубликовано вчера";
        } else {
            return formatDays(days);
        }
    }

    private String formatMinutes(long minutes) {
        String unit = getUnit(minutes);
        return "опубликовано " + minutes + " " + unit + " назад";
    }

    private String formatHours(long hours) {
        String unit = getUnit(hours);
        return "опубликовано " + hours + " " + unit + " назад";
    }

    private String formatDays(long days) {
        String unit = getUnit(days);
        return "опубликовано " + days + " " + unit + " назад";
    }

    private String getUnit(long value) {
        if (value == 1) {
            return "день";
        } else if (value >= 2 && value <= 4 || value >= 22 && value <= 24) {
            return "дня";
        } else {
            return "дней";
        }
    }
}
