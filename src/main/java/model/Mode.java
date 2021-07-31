package model;

import consts.ModeType;

import java.util.List;
//模式，当局游戏的模式、倍率、当前模式玩家
public class Mode {
    private ModeType modeType;
    private int multiply;
    private List<Player> players;

    public Mode(ModeType modeType, int multiply) {
        this.modeType = modeType;
        this.multiply = multiply;
    }

    public Mode(ModeType modeType, int multiply, List<Player> players) {
        this.modeType = modeType;
        this.multiply = multiply;
        this.players = players;
    }

    public ModeType getModeType() {
        return modeType;
    }

    public void setModeType(ModeType modeType) {
        this.modeType = modeType;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Mode{" +
                "modeType=" + modeType +
                ", multiply=" + multiply +
                ", players=" + players +
                '}';
    }
}
