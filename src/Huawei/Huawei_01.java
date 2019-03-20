package Huawei;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词之间用空格隔开
 */
public class Huawei_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] strings = string.split(" ");
        int length = strings.length;
        System.out.println(strings[length - 1].length());
    }
}
