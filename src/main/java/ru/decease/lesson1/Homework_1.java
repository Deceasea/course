package ru.decease.lesson1;

public class Homework_1 {
    public static void main(String[] args) {
        String cat = "Барсик";

        //Возвращает длину строки
        int result = cat.length();
        System.out.println(result);

        //Проверяем, является ли строка пустой
        var result1 = cat.isEmpty();
        System.out.println(result1);

        //Проверяем, является ли эта строка «пустой», не содержащих никаких символов, кроме пробелов, табуляций и прочих невидимых символов
        var result2 = cat.isBlank();
        System.out.println(result2);

        //Возвращает подстроку из строки
        String result3 = cat.substring(0, 4);
        System.out.println(result3);

        //Возвращает первый индекс, по которому данный элемент может быть найден в массиве
        var result4 = cat.indexOf("с");
        System.out.println(result4);

        //Возвращает индекс последнего вхождения указанного значения в строковый объект String, на котором он был вызван
        int result5 = cat.lastIndexOf("а");
        System.out.println(result5);

        //Возвращает значение строки, на которой он был вызван, преобразованное в нижний регистр.
        String result6 = cat.toLowerCase();
        System.out.println(result6);

        //Возвращает значение строки, на которой он был вызван, преобразованное в верхний регистр.
        String result7 = cat.toUpperCase();
        System.out.println(result7);

        //Возвращает новую строку с некоторыми или всеми сопоставлениями с шаблоном, заменёнными на заменитель.
        String result8 = cat.replace("Б", "М");
        System.out.println(result8);

        //Сравнивает value параметр с подстрокой в начале этой строки и возвращает значение, указывающее, равны ли они.
        boolean result9 = cat.startsWith("Бар");
        System.out.println(result9);

        //Сравнивает value параметр с подстрокой в конце этой строки и возвращает значение, указывающее, равны ли они.
        boolean result10 = cat.startsWith("чик");
        System.out.println(result10);

        //Конструирует и возвращает новую строку, содержащую указанное количество соединённых вместе копий строки, на которой он был вызван
        String result11 = cat.repeat(2);
        System.out.println(result11);

        //Позволяет проверить, содержит ли один элемент внутри себя другой
        boolean result12 = cat.contains("ар");
        System.out.println(result12);
        boolean result13 = cat.contains("ра");
        System.out.println(result13);

        //Возвращает новый массив, состоящий из массива, на котором он был вызван, соединённого с другими массивами и/или значениями
        String result14 = cat.concat(" опять наделал в тапки, паразит!");
        System.out.println(result14);

        String cat2 = " Карасик ";
        //Удаляет из текущей строки все начальные и конечные пробелы
        String result15 = cat2.trim();
        System.out.println(result15);

        //Перед созданием объекта String смотрит есть ли этот объект в пуле стрингов и возвращает его
        String result16 = cat.intern();
        System.out.println(result16);
    }

}
