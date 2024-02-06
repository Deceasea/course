package ru.decease.lesson6.todolist;
import java.util.ArrayList;
import java.util.List;
public class ToDoList {
    public static void main(String[] args) {
        // Создаем список
        List<String> taskList = new ArrayList<>();

        // Добавляем 5 задач в список
        for (int i = 1; i <= 5; i++) {
            taskList.add("Текст задачи " + i);
        }

        // Выводим задачи
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println("Задача" + (i + 1) + ": " + taskList.get(i));
        }
    }
}
