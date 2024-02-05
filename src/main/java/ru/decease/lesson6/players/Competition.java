package ru.decease.lesson6.players;

import java.util.HashSet;
import java.util.Set;

public class Competition {
    public static void main(String[] args) {
        // Создаем хранилище игроков
        Set<Player> playerSet = new HashSet<>();

        // Создаем и добавляем 10 игроков в хранилище
        for (int i = 1; i <= 10; i++) {
            Player player = new Player(i, "Player" + i, true);
            playerSet.add(player);
        }

        // Добавляем игрока с тем же ID (Проверка!)
        Player duplicatePlayer = new Player(5, "PlayerDubl", false);
        playerSet.add(duplicatePlayer);

        // Выводим информацию о всех игроках в хранилище
        System.out.println("All players in the base:");
        for (Player player : playerSet) {
            System.out.println("ID: " + player.getId() + ", Nickname: " + player.getNickname());
        }
    }
}
