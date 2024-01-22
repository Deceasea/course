package ru.decease.lesson2.task_2;

public class Room {
    String roomType;
    double area;
    boolean hasWindow;

    // Конструктор класса
    public Room(String roomType, double area, boolean hasWindow) {
        this.roomType = roomType;
        this.area = area;
        this.hasWindow = hasWindow;
    }

    // Геттеры
    public String getRoomType() {
        return roomType;
    }

    public double getArea() {
        return area;
    }

    public boolean hasWindows() {
        return hasWindow;
    }

}


