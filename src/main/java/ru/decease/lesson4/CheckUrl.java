package ru.decease.lesson4;

public class CheckUrl {
    public static void main(String[] args) {
        // Создаем переменную url типа String
        String url = "http://vk.com";
        // Проверяем, начинается ли адрес на "https://"
        if (url.startsWith("https://")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопасно. Не указывайте логины, пароли и данные банковских карт");
        }
    }
}
