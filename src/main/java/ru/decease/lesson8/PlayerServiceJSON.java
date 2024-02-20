package ru.decease.lesson8;

import java.util.Collection;
import java.util.HashMap;

public class PlayerServiceJSON implements PlayerService {
    private final HashMap<Integer, Player> playersMap = new HashMap<>();

    public PlayerServiceJSON(String filename) {
        loadFromFile(); // Загружаем данные из файла при создании сервиса
    }

    private void loadFromFile() {
    }

    @Override
    public Player getPlayerById(int id) {
        return playersMap.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return playersMap.values();
    }

    @Override
    public int createPlayer(String nickname) {
        int newId = playersMap.size() + 1;
        Player newPlayer = new Player(newId, nickname, 0, false);
        playersMap.put(newId, newPlayer);
        saveToFile(); // Сохраняем данные после создания нового игрока
        return newId;
    }

    @Override
    public Player deletePlayer(int id) {
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) {
        return 0;
    }

    private void saveToFile() {
    }
}
