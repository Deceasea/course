package ru.decease.lesson7.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Copier {
    public static void copyTextFile(String tasksPath, String destinationPath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(tasksPath));
        Files.write(Path.of(destinationPath), lines);
    }
}
