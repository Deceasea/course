package ru.decease.lesson6.players;

import java.util.Objects;

public class Player {
    private final int id;
    private final String nickname;
    private final boolean isOnline;

    // Конструктор класса
    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return id == player.id &&
                isOnline == player.isOnline &&
                Objects.equals(nickname, player.nickname);
    }

    // Переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
