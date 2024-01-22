package ru.decease.lesson2.task_2;

public class Flat {
    int flatNumber;
    int numberOfRooms;
    double totalArea;

    // Конструктор класса
    public Flat(int flatNumber, int numberOfRooms, double totalArea) {
        this.flatNumber = flatNumber;
        this.numberOfRooms = numberOfRooms;
        this.totalArea = totalArea;
    }

    //Геттеры
    public int getFlatNumber() {
        return flatNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getTotalArea() {
        return totalArea;
    }

}



