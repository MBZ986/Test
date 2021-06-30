package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Team {

    public List list() throws IOException {
//        System.out.println("请输入一个字符");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str="123,332,233,333,444";
        List<String> list = Arrays.asList(str.split(","));
        int[] a= new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = Integer.parseInt(list.get(i));
            System.out.println(a[i]);
        }
        return list;
    }
//    相加和
    public void sum(){
        int r,sum=0;
        int a=023;
        System.out.println("次数为"+a);
        int ss=0;
        while(a!=0){
            ss++;
            r=a%10;
            a=a/10;
            sum=sum+r;
            if (ss>2){
                ss=r;
            }
        }
        sum=sum-ss;
        System.out.println("第一位是"+ss+"后位相加是"+sum);
    }
//    是否有序
    public void sequence(){
        int a=012;
        int bai = a/100%10;//百位除以100%10
        int shi = a%100/10;//十位%100/10
        int ge  = a%10;//个位直接%10
        System.out.println("百位是"+bai+"十位是"+shi+"个位数是"+ge);
            if(bai<shi&&shi<ge){
                System.out.println("是大顺"+a);
        }else {
                System.out.println("非大顺"+a);
            }
    }


}
