package model;

import model.Player;

import java.util.List;

public class QGame {
//    本局玩家
    private List<Player> players;
//    游戏类型
    private int gameType;

    public QGame() {
    }

    public QGame(List<Player> players, int gameType) {
        this.players = players;
        this.gameType = gameType;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

    @Override
    public String toString() {
        return "model.QGame{" +
                "players=" + players +
                ", gameType=" + gameType +
                '}';
    }
}

