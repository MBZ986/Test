package utils;

import consts.GameType;
import consts.ModeType;
import model.Mode;
import model.Player;

import java.util.ArrayList;
import java.util.List;

//根据玩家数据选择模式
public class ModeSwitchUtil {
    private GameType gameType;
    private List<Player> playerList;

    public ModeSwitchUtil(GameType gameType, List<Player> playerList) {
        this.gameType = gameType;
        this.playerList = playerList;
    }

    public Mode getMode() {
        Mode mode = null;
        switch (gameType) {
            case TYPE_ONE:
                mode = gameTypeOneModeSwitch();
                break;
            default:
                System.out.println("无");
        }
        return mode;
    }

    private Mode gameTypeOneModeSwitch() {
        Mode mode = null;
        List<Player> tmpPlayers = new ArrayList<Player>();

        if ((tmpPlayers = sanWeiShu()).size() > 0) {
            mode = new Mode(ModeType.SHUANGWEI, 20, tmpPlayers);
        } else if ((tmpPlayers = sunZi()).size() > 0) {
            mode = new Mode(ModeType.SHUANGWEI, 15, tmpPlayers);
        } else if ((tmpPlayers = shuangWei()).size() > 0) {
            mode = new Mode(ModeType.SHUANGWEI, 20, tmpPlayers);
        }
        return mode;
    }

    private List<Player> sanWeiShu() {
        List<Player> players = new ArrayList<>();
        for (Player player : playerList) {
            int[] data = player.getData();
            if (data[0] == data[1] && data[1] == data[2]) {
                players.add(player);
            }
        }
        return players;
    }

    private List<Player> sunZi() {
        List<Player> players = new ArrayList<>();
        for (Player player : playerList) {
            int[] data = player.getData();
            if (data[0] > data[1] && data[1] > data[2]) {
                if (data[0] - data[1] == 1 && data[1] - data[2] == 1) {
//                    987
                    players.add(player);
                }
            } else if (data[0] < data[1] && data[1] < data[2]) {
                if (data[2] - data[1] == 1 && data[1] - data[0] == 1) {
//                    789
                    players.add(player);
                }
            }
        }
        return players;
    }

    private List<Player> shuangWei() {
        List<Player> players = new ArrayList<>();
        for (Player player : playerList) {
            int[] data = player.getData();
            if (data[1] == data[2]) {
                players.add(player);
            }
        }
        return players;
    }


}
