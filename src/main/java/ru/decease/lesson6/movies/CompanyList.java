package ru.decease.lesson6.movies;

import ru.decease.lesson6.movies.Company;
import ru.decease.lesson6.movies.Movie;

import java.util.ArrayList;
import java.util.List;

public class CompanyList {
    public static void main(String[] args) {
        // Создаем три кинокомпании
        List<Company> companies = new ArrayList<>();

        // Создаем портфолио для каждой компании
        List<Movie> portfolio1 = new ArrayList<>();
        portfolio1.add(new Movie("Film 1", 9.3, "Drama", "Russia", true));
        portfolio1.add(new Movie("Film 2", 7.0, "Fantasy", "USA", false));
        portfolio1.add(new Movie("Film 3", 6.2, "Documential", "Slovakia", false));

        List<Movie> portfolio2 = new ArrayList<>();
        portfolio2.add(new Movie("Film 4", 8.7, "Criminal", "Germany", true));
        portfolio2.add(new Movie("Film 5", 7.8, "Comedy", "Spain", false));
        portfolio2.add(new Movie("Film 6", 6.5, "Thriller", "Italy", false));

        List<Movie> portfolio3 = new ArrayList<>();
        portfolio3.add(new Movie("Film 7", 9.0, "Horror", "Japan", true));
        portfolio3.add(new Movie("Film 8", 8.2, "Documential", "Sweden", false));
        portfolio3.add(new Movie("Film 9", 7.5, "Comedy", "USA", false));

        // Создаем три кинокомпании с портфолио
        companies.add(new Company("Company 1", 2010, portfolio1));
        companies.add(new Company("Company 2", 2005, portfolio2));
        companies.add(new Company("Company 3", 1992, portfolio3));

        // Выводим информацию о каждой компании
        for (Company company : companies) {
            System.out.print(company.getName() + ": ");
            List<Movie> filmPortfolio = company.getFilmPortfolio();
            for (int i = 0; i < filmPortfolio.size(); i++) {
                System.out.print(filmPortfolio.get(i).getTitle());
                if (i < filmPortfolio.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
