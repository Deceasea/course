package ru.decease.lesson3.tasks_3_4_5;
// Irina Veselova
public class FavoriteMovies {
    public static void main(String[] args) {
        // Объявляем массив
        Movie[] films = new Movie[3];
        //Заполняем массив фильмами
        films[0] = new Movie("Ира знает программирование", 9.3, "Фэнтези", "США", true, 2024);
        films[1] = new Movie("Ира программирует", 6.1, "Комедия", "Россия", false, 2023);
        films[2] = new Movie("Ира делает домашнее задание", 7.7, "Боевик", "Британия", false, 2024);

        // Выводим информацию
        System.out.println("Любимые фильмы:");
        for (Movie film : films) {
            System.out.println("Название: " + film.title);
            System.out.println("Рейтинг: " + film.rating);
            System.out.println("Жанр: " + film.genre);
            System.out.println("Страна: " + film.country);
            System.out.println("Есть ли оскар: " + (film.hasOscar ? "Да" : "Нет"));
            System.out.println();
        }
        //Task 5 (используя цикл, напечатайте информацию о всех фильмах из задания "задача про массив объектов" в формате "год-название-жанр-рейтинг")
        System.out.println("Информация о фильмах:");
        for (Movie film : films) {
            System.out.println(film.year + "-" + film.title + "-" + film.genre + "-" + film.rating);
        }
    }

}
