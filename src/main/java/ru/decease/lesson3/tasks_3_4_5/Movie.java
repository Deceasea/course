package ru.decease.lesson3.tasks_3_4_5;
// Irina Veselova
public class Movie {

    String title;
    double rating;
    String genre;
    String country;
    boolean hasOscar;
    int year;

    // Конструктор класса
    public Movie(String title, double rating, String genre, String country, boolean hasOscar, int year) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
        this.year = year;
    }
}
