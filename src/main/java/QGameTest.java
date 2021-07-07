import model.Player;
import model.QGame;
import model.Table;
import utils.Util;

import java.io.IOException;
import java.util.ArrayList;

public class QGameTest {
    public static void main(String[] args) throws IOException {
        int[][] numsArr = Util.genRandomNumberArray(20);
        Util.printNumArr(numsArr);
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numsArr.length; i++) {
            players.add(new Player("13434"+i+"3"+i,numsArr[i]));
        }
        QGame qGame = new QGame(players,1);
        Table team =new Table(qGame);
        team.start();


    }

}
