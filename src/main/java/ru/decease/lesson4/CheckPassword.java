package ru.decease.lesson4;

public class CheckPassword {

    public static void main(String[] args) {
        // Создаем переменную password типа String
        String password = "zTh1h3&g";

        // Проверяем длину пароля
        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        }
        // Проверяем наличие цифр в пароле
        else if (!containsDigit(password)) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        // Проверяем наличие спецсимволов в пароле
        else if (!containsSpecialCharacter(password)) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
        // Если все условия соблюдены
        else {
            System.out.println("Пароль принят");
        }
    }

    // Метод для проверки цифр
    private static boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    // Метод для проверки спецсимволов
    private static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*№";
        for (char ch : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(ch))) {
                return true;
            }
        }
        return false;
    }
}
