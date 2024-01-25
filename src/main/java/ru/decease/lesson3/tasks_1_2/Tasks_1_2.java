package ru.decease.lesson3.tasks_1_2;
// Irina Veselova
public class Tasks_1_2 {
    public static void main(String[] args) {
        // Создаем массив todoList
        String[] todoList = new String[5];

        // Заполняем массив
        todoList[0] = "Погулять с собакой";
        todoList[1] = "Покормить кота";
        todoList[2] = "Прогреть машину";
        todoList[3] = "Посетить совещание на работе";
        todoList[4] = "Сходить на тренировку";

        // Выводим содержимое массива
        System.out.println("Список дел на день:");
        for (int i = 0; i < todoList.length; i++) {
            System.out.println((i + 1) + ". " + todoList[i]);
        }

        // Создаем массив numbers
        double[] numbers = new double[3];

        // Заполняем массив значениями чисел π, e и единицей
        numbers[0] = Math.PI;
        numbers[1] = Math.E;
        numbers[2] = 1.0;

        // Выводим содержимое массива с точностью до 5 знаков после запятой
        System.out.println("Массив дробных чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.5f%n", numbers[i]);
        }
    }
}
