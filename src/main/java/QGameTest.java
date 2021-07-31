import consts.GameType;
import model.Player;
import model.QGame;
import model.Table;
import utils.Util;

import java.io.IOException;
import java.util.ArrayList;

public class QGameTest {
    public static void main(String[] args) throws IOException {
        int[][] numsArr = Util.genRandomNumberArray(20);
//        Util.printNumArr(numsArr);
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numsArr.length; i++) {
            if (i == 5) {
                players.add(new Player(i+"",new int[]{9,8,8}, true));
            } else if (i == 6) {
                players.add(new Player(i +"", new int[]{8,9,9}, false));
            }else if (i == 7) {
                players.add(new Player(i +"", new int[]{8,9,9}, false));
            }else if (i == 8) {
                players.add(new Player(i +"", new int[]{4,9,9}, false));
            }else{
                players.add(new Player(i +"", numsArr[i], false));
            }
        }
        QGame qGame = new QGame(players, GameType.TYPE_ONE);
        Table team = new Table(qGame);
        team.start();


    }

}
