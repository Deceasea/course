package ru.decease.lesson6.movies;

import ru.decease.lesson6.movies.Movie;

import java.util.List;

public class Company {
    private final String name;
    private final int foundingYear;
    private final List<Movie> filmPortfolio;

    // Конструктор класса
    public Company(String name, int foundingYear, List<Movie> filmPortfolio) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.filmPortfolio = filmPortfolio;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public List<Movie> getFilmPortfolio() {
        return filmPortfolio;
    }
}
