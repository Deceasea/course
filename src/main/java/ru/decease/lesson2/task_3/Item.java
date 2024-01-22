package ru.decease.lesson2.task_3;

public class Item {
    final String name;
    final String article;
    final double price;
    final int quantity;
    final String color;

    // Конструктор класса
    public Item(String name, String article, double price, int quantity, String color) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }
}

