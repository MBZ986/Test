package model;

import java.util.Arrays;

//玩家
public class Player {
    //玩家唯一标识，可以是QQ号
    private String id;
    //玩家的游戏数据
    private int[] data;

    public Player(String id, int[] data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
