package utils;

import java.util.Arrays;
import java.util.Random;

public class Util {
    //生成一个的随机数组
    public static int[] genRandomNumbers(int bit) {
        int[] nums = new int[bit];
        Random random = new Random();
        for (int i = 0; i < bit; i++) {
            nums[i] = random.nextInt(10);
        }
        return nums;
    }

    public static int[][] genRandomNumberArray(int bit) {
        int[][] arrays = new int[bit][3];
        for (int i = 0; i < bit; i++) {
            arrays[i] = genRandomNumbers(3);
        }
        return arrays;
    }

    public static void printNumArr(Object arr){
        if (arr instanceof int[]){
            int[] arr1 = (int[]) arr;
            System.out.println(Arrays.toString(arr1));
        }else if(arr instanceof int[][]){
            int[][] arr2 = (int[][]) arr;
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(Arrays.toString(arr2[i]));
            }
        }else{
            System.out.println("不支持类型");
        }
    }
}

