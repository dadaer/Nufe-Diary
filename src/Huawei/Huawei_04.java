package Huawei;

import java.util.Scanner;

/**
 * 连续输入字符串，请按长度为8拆分每个字符串后输入到新的字符串数组
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
 */
public class Huawei_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.length() % 8 != 0) {
                str = str + "00000000";
                while (str.length() >= 8) {
                    System.out.println(str.substring(0, 8));
                    str = str.substring(8);
                }
            }
        }
    }
}
