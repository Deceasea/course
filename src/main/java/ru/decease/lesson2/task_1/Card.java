package ru.decease.lesson2.task_1;

public class Card {
    // Выводим замаскированный номер карты
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String hiddenCard = hideCardNumber(cardNumber);
        System.out.println(hiddenCard);

        // Проверяем ввод без пробелов
        String cardNumberWithoutSpaces = "1234567890123456";
        String hiddenCardWithoutSpaces = hideCardNumber(cardNumberWithoutSpaces);
        System.out.println(hiddenCardWithoutSpaces);
    }

    // Маскируем номер карты
    public static String hideCardNumber(String cardNumber) {
        // Убираем пробелы из номера карты
        cardNumber = cardNumber.replace(" ", "");

        // Проверка,номер карты должен содержать хотя бы 4 символа
        if (cardNumber.length() >= 4) {
            // Данная строка получает последние 4 символа
            String lastFourNumbers = cardNumber.substring(cardNumber.length() - 4);

            // Заменяем остальные символы на "*"
            String replacedCardNumber = "**** **** **** " + lastFourNumbers;

            return replacedCardNumber;
        } else {
            // Проверка на исходный номер карты, если он введен неверно
            return cardNumber;
        }
    }
}


