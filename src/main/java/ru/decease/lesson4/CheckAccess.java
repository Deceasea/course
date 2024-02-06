package ru.decease.lesson4;

public class CheckAccess {
    public static void main(String[] args) {
        // Создаем переменную password типа String
        String password = "Qwerty0987654321";

        // Проверяем пароль
        if (password.equals("Qwerty0987654321")) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
