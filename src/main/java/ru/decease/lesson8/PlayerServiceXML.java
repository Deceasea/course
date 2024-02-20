package ru.decease.lesson8;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class PlayerServiceXML implements PlayerService {
    private final HashMap<Integer, Player> playersMap = new HashMap<>();
    private final String filename;

    public PlayerServiceXML(String filename) {
        this.filename = filename;
        loadFromFile(); // Загружаем данные из файла при создании сервиса
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
        Player removedPlayer = playersMap.remove(id);
        saveToFile(); // Сохраняем данные после удаления игрока
        return removedPlayer;
    }

    @Override
    public int addPoints(int playerId, int points) {
        Player player = playersMap.get(playerId);
        if (player != null) {
            player.setPoints(player.getPoints() + points);
            saveToFile(); // Сохраняем данные после обновления очков игрока
            return player.getPoints();
        }
        return -1; // Игрок с указанным ID не найден
    }

    private void saveToFile() {
        try (XMLEncoder encoder = new XMLEncoder(new FileOutputStream(filename))) {
            encoder.writeObject(playersMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        try (XMLDecoder decoder = new XMLDecoder(new FileInputStream(filename))) {
            Object obj = decoder.readObject();
            if (obj instanceof HashMap) {
                playersMap.putAll((HashMap<Integer, Player>) obj);
            }
        } catch (IOException e) {
            // Файл не существует или произошла ошибка при чтении
        }
    }
}
