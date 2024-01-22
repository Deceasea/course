package ru.decease.lesson2.task_3;

public class Task3 {
    public static void main(String[] args) {
        // Создаем объекты типа Товар
        Item item1 = new Item("Tea", "567890", 53.40, 2, "Black");
        Item item2 = new Item("Cofee", "34560", 78.5, 34, "Red");
        Item item3 = new Item("Sugar", "23456", 50.0, 20, "White");
        Item item4 = new Item("Cookies", "67890", 51, 59, "Brown");
        Item item5 = new Item("Milk", "78909", 86, 15, "White");

        // Выводим информацию о каждом товаре
        fullInfo(item1);
        fullInfo(item2);
        fullInfo(item3);
        fullInfo(item4);
        fullInfo(item5);
    }

    // Метод для вывода информации о товаре
    private static void fullInfo(Item item) {
        System.out.println(
                        "Article" + ": " + item.getArticle() + ", " +
                        "Name" + ": " + item.getName() + ", " +
                        "Price" + ": " + (item.getPrice() + " " + "RUB" + ", " +
                        "Quantity" + ": " + item.getQuantity() + ", " +
                        "Color" + ": " + item.getColor()
                ));
    }
}
