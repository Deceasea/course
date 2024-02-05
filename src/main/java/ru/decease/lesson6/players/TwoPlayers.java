package ru.decease.lesson6.players;

import ru.decease.lesson6.players.Player;

public class TwoPlayers {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Andrew", true);
        Player player2 = new Player(1, "Andrew", true);

        // Проверка player1 == player2
        System.out.println("Player1 = Player2: " + (player1 == player2));

        // Проверка player1.equals(player2)
        System.out.println("Player1 equal Player2:  " + player1.equals(player2));
    }
}
