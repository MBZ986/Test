package model;

import utils.Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//牌桌，玩家+玩法=上牌桌开局
public class Table {
    private QGame qGame;

    public Table(QGame qGame) {
        this.qGame = qGame;
    }

    public void start() {
        System.out.println("---------游戏开始---------");
        System.out.println("游戏玩法：" + qGame.getGameType());
        System.out.println("玩家数量：" + qGame.getPlayers().size());
//        System.out.println("本局参赛玩家：");
//        for (Player player : qGame.getPlayers()) {
//            System.out.println(player);
//        }
        Mode mode = qGame.modeSwitch();

        //平局玩家
        ArrayList<Player> tiePlayers = new ArrayList<>();
        //假设第一个玩家数据最大
        Player max = qGame.getPlayers().get(0);
        //第一个玩家的数据
        int[] maxData = sum(qGame.getPlayers().get(0).getData());
        for (int i = 1; i < qGame.getPlayers().size(); i++) {
//            sequence(qGame.getPlayers().get(i).getData());
            Player currentPlayer = qGame.getPlayers().get(i);
            int[] sum = sum(currentPlayer.getData());
            System.out.println(currentPlayer);
            System.out.println(Arrays.toString(sum));
            if (sum[1] > maxData[1]) {
                max = currentPlayer;
                maxData = sum;
                tiePlayers.clear();
            } else if (sum[1] == maxData[1]) {
                if (sum[0] > maxData[0]) {
                    max = currentPlayer;
                    maxData = sum;
                    tiePlayers.clear();
                }else if(sum[0] == maxData[0]){
                    if (currentPlayer.isMaker()){
                        max = currentPlayer;
                        maxData = sum;
                        tiePlayers.clear();
                    }else if(max.isMaker()){
                        continue;
                    }else{
                        if (tiePlayers.size()==0){
                            tiePlayers.add(max);
                            tiePlayers.add(currentPlayer);
                        }else{
                            tiePlayers.add(currentPlayer);
                        }
                    }
                }
            }
        }

        if (tiePlayers.size()>0){
            System.out.println("本局产生了"+tiePlayers.size()+"位平局玩家");
            for (int i = 0; i < tiePlayers.size(); i++) {
                System.out.println(tiePlayers.get(i));
            }
        }else{
            System.out.println("本局获胜玩家：");
            System.out.println(max);
        }
    }



    //相加和
    private int[] sum(int[] nums) {
        int[] num = new int[2];
//        System.out.println("第一位是" + nums[0] + "后位相加是" + (nums[1] + nums[2]));
        num[0] = nums[0];
        num[1] = (nums[1] + nums[2]);

        return num;
    }

    //金牛
    private boolean taurus(int[] nums) {
        return nums[0] == nums[1] && nums[1] == nums[2];
    }

//    public int[] taurusVictory(int[][] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            if (taurus(nums[i])) {
//                nums[i][0] =
//            }
//        }
//    }

    //双位
    private boolean doublePos(int[] nums) {
        return nums[1] == nums[2];
    }

    //是否有序
    private boolean sequence(int[] nums) {
        System.out.println("百位是" + nums[0] + "十位是" + nums[1] + "个位数是" + nums[2]);
        if (nums[0] < nums[1] && nums[1] < nums[2]) {
            System.out.println("是大顺" + Arrays.toString(nums));
            return true;
        } else {
            System.out.println("非大顺" + Arrays.toString(nums));
            return false;
        }

    }


}
