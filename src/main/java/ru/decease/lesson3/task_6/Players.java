package ru.decease.lesson3.task_6;
// Irina Veselova
public class Players {
    public static void main(String[] args) {
        // Создаем массив строк
        String[] playerNames = new String[10];

        // Заполняем массив
        for (int i = 0; i < 10; i++) {
            playerNames[i] = "Имя " + (i + 1);
        }

        // Выводим только первые три имена
        System.out.println("Первые три игрока:");
        for (int i = 0; i < 3; i++) {
            System.out.println(playerNames[i]);
        }
    }
}
