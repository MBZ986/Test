package model;

import consts.GameType;
import model.Player;
import utils.ModeSwitchUtil;

import java.util.List;

public class QGame {
//    本局玩家
    private List<Player> players;
//    游戏类型
    private GameType gameType;
    public QGame() {
    }

    public QGame(List<Player> players, GameType gameType) {
        this.players = players;
        this.gameType = gameType;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }


    //模式选择,根据玩家数据选择游戏模式，能够进入模式的玩家会成为本局剩余玩家，不能进入模式的玩家被剔除
    public Mode modeSwitch(){
        return new ModeSwitchUtil(gameType,players).getMode();
    }

    @Override
    public String toString() {
        return "model.QGame{" +
                "players=" + players +
                ", gameType=" + gameType +
                '}';
    }
}

