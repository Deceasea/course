package ru.decease.lesson6.movies;

import ru.decease.lesson6.movies.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public static void main(String[] args) {
        // Создаем список фильмов
        List<Movie> films = new ArrayList<>();

        // Заполняем список тремя любимыми фильмами
        films.add(new Movie("Astral", 9.2, "Comedy", "USA", false));
        films.add(new Movie("Mirrors", 7.0, "Screamer", "Great Britan", true));
        films.add(new Movie("Warcraft", 8.2, "Fantasy", "Slovakia", false));

        // Выводим информацию о фильме по индексу 1
        if (films.size() > 1) {
            Movie movieAtIndex1 = films.get(1);
            System.out.println("Information by index 1:");
            System.out.println("Title: " + movieAtIndex1.getTitle());
            System.out.println("Rating: " + movieAtIndex1.getRating());
            System.out.println("Genre: " + movieAtIndex1.getGenre());
            System.out.println("Country: " + movieAtIndex1.getCountry());
            System.out.println("Has Oskar: " + (movieAtIndex1.hasOscar() ? "Yes" : "No"));
        } else {
            System.out.println("The list of movies is too short");
        }
    }
}
