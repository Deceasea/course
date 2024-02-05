package ru.decease.lesson6.movies;

public class Movie {
    private final String title;
    private final double rating;
    private final String genre;
    private final String country;
    private final boolean hasOscar;

    // Конструктор класса
    public Movie(String title, double rating, String genre, String country, boolean hasOscar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public boolean hasOscar() {
        return hasOscar;
    }
}




