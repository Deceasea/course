package ru.decease.lesson6.players;

import java.util.*;

public class PlayersRating {
    public static void main(String[] args) {
        // Создаем Map
        Map<Player, Integer> points = new HashMap<>();

        // Создаем 10 игроков и присваиваем каждому 0 очков
        for (int i = 1; i <= 10; i++) {
            Player player = new Player(i, "Player" + i, true);
            points.put(player, 0);
        }

        // Устанавливаем определенные очки для нескольких игроков
        setPoints(points, 4, 10);
        setPoints(points, 7, 12);
        setPoints(points, 8, 11);
        setPoints(points, 9, 13);
        setPoints(points, 10, 5);

        // Выводим 3 игроков с наивысшими очками
        List<Map.Entry<Player, Integer>> sortedList = getTopPlayers(points);
        System.out.println("Top-3 players:");
        for (int i = 0; i < Math.min(3, sortedList.size()); i++) {
            Player player = sortedList.get(i).getKey();
            int playerPoints = sortedList.get(i).getValue();
            System.out.println("Place " + (i + 1) + ": " + player.getNickname() + " (ID " + player.getId() + ") - " + playerPoints + " points");
        }
    }

    private static void setPoints(Map<Player, Integer> points, int playerId, int playerPoints) {
        Player player = new Player(playerId, "Player" + playerId, true);
        points.put(player, playerPoints);
    }

    private static List<Map.Entry<Player, Integer>> getTopPlayers(Map<Player, Integer> points) {
        List<Map.Entry<Player, Integer>> sortedList = new ArrayList<>(points.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return sortedList;
    }
}
