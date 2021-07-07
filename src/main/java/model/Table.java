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

    public void start(){
        System.out.println("---------游戏开始---------");
        System.out.println("游戏玩法："+qGame.getGameType());
        System.out.println("玩家数量："+qGame.getPlayers().size());
        for (int i = 0; i < qGame.getPlayers().size(); i++) {
            sequence(qGame.getPlayers().get(i).getData());
//            sum(qGame.getPlayers().get(i).getData());
        }
    }

    //相加和
    private void sum(int[] nums) {
        System.out.println("第一位是" + nums[0] + "后位相加是" + (nums[1] + nums[2]));
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
