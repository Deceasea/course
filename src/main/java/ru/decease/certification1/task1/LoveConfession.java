package ru.decease.certification1.task1;
import java.util.Scanner;

public class LoveConfession {
    public static void main(String[] args) {
        // Создаем объект Scanner
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длину забора
        System.out.print("Введите длину забора (в см): ");
        int fenceLength = scanner.nextInt();

        // Закрываем Scanner
        scanner.close();

        // Рассчитываем длину надписи на заборе
        int loveMessageLength = 15 * 3 * 62 + 3 * 12;

        // Проверяем, поместится ли надпись на заборе
        if (fenceLength >= loveMessageLength) {
            System.out.println("Надпись мальчика \"Я люблю Лену\" поместится на заборе.");
        } else {
            System.out.println("Надпись мальчика \"Я люблю Лену\" не поместится на заборе.");
        }
    }
}
