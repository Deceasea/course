package ru.decease.lesson8;

public class TestClass {
    public static void main(String[] args) {
        PlayerService service = new PlayerServiceJSON("players.json");

        // Создание игроков
        int playerId1 = service.createPlayer("Player1");
        int playerId2 = service.createPlayer("Player2");
        int playerId3 = service.createPlayer("Player3");

        // Получение игрока по id
        Player player = service.getPlayerById(playerId1);
        System.out.println("Player with id " + playerId1 + ": " + player);

        // Добавление очков игроку
        service.addPoints(playerId1, 100);

        // Удаление игрока
        Player removedPlayer = service.deletePlayer(playerId2);
        System.out.println("Removed player: " + removedPlayer);

        // Получение всех игроков
        System.out.println("All players:");
        service.getPlayers().forEach(System.out::println);

//        PlayerService service = new PlayerServiceXML("players.xml");
    }
}
