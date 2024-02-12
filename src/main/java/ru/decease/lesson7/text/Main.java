package ru.decease.lesson7.text;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Copier.copyTextFile("tasks.txt", "destination.txt");
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }
    }
}
