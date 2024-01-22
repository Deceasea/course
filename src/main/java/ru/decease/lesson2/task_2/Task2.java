package ru.decease.lesson2.task_2;

public class Task2 {
    public static void main(String[] args) {
        // Создаем объект типа Квартира и устанавливаем значения полей
        Flat myFlat = new Flat(13, 2, 51.6);

        // Создаем объект типа Комната и устанавливаем значения полей
        Room oneOfRoom = new Room("Sleeping room", 13.7, true);

        // Выводим общую информацию
        System.out.println("Flat Number: " + myFlat.getFlatNumber());
        System.out.println("Number of Rooms: " + myFlat.getNumberOfRooms());
        System.out.println("Total Area: " + myFlat.getTotalArea());
        System.out.println("Our flat has two rooms, now we describe one of it:");
        System.out.println("Room type: " + oneOfRoom.getRoomType());
        System.out.println("Area: " + oneOfRoom.getArea());
        System.out.println("Has Window: " + (oneOfRoom.hasWindows() ? "Yes" : "No"));
    }
}
