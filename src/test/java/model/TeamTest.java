package model;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TeamTest {
    @Test
    public List test() throws IOException {
//        System.out.println("请输入一个字符");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        List<String> list = new ArrayList<String>();
//        list.add("2");
//        list.add("23");
//        System.out.println(list.toString());

        String str = "a,b,c,d";
        List<String> list = Arrays.asList(str.split(","));
        System.out.println(list.toString());
        return list;
    }

}