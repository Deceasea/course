package ru.decease.certification1.task2;
import java.time.LocalDate;
import java.time.Month;

public class Cactus {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate currentDate = LocalDate.now();

        // Текущая влажность
        int humidity = Sensor.generateHumidity();

        // Проверка на время года
        int wateringFrequency;
        if (currentDate.getMonth().getValue() >= 12 || currentDate.getMonth().getValue() <= 2) {
            // Зима(раз в месяц)
            wateringFrequency = 30;
        } else if (currentDate.getMonth().getValue() >= 3 && currentDate.getMonth().getValue() <= 5 ||
                currentDate.getMonth().getValue() >= 9 && currentDate.getMonth().getValue() <= 11) {
            // Осень или весна(раз в неделю)
            wateringFrequency = 7;
        } else {
            // Лето(раз в два дня при влажности менее 30%)
            wateringFrequency = 2;
        }

        // Выводим информацию
        if (humidity < 30 || currentDate.getDayOfMonth() % wateringFrequency == 0) {
            System.out.println("Полей меня, кожаный мешок, прямо сегодня, " + currentDate + "!");
        } else {
            System.out.println("Кожаный мешок, сегодня " + currentDate + " мне не нужна вода, свободен.");
        }
    }
}
