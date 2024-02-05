package ru.decease.lesson4;

public class CheckEven {
    public static void main(String[] args) {
        // Создаем переменную number типа int
        int number = 12;

        // Проверяем, является ли число четным или нечетным
        if (number % 2 == 0) {
            System.out.println("Четное число.");
        } else {
            System.out.println("Нечетное число.");
        }
        // Проверяем, является ли число четным и кратно ли 4
        if (number % 2 == 0 && number % 4 == 0) {
            System.out.println("Четное число. Кратно четырем.");
        }
        // Проверяем, является ли число нечетным и кратно ли 3
        else if (number % 2 != 0 && number % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем.");
        }
    }
}
