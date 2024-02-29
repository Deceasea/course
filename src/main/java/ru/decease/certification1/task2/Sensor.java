package ru.decease.certification1.task2;

public class Sensor {
    // Метод для генерации влажности воздуха
    public static int generateHumidity() {
        // случайное число от 0 до 100
        return (int) (Math.random() * 100);
    }
}
