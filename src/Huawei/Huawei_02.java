package Huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，输出这个字符在字符串中的个数。不区分大小写。
 */
public class Huawei_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = "";
        String one = "";
        char[] ac;
        char temp;
        int num = 0;
        while (sc.hasNext()) {
            all = sc.nextLine();
            one = sc.nextLine();
            ac = all.toCharArray();
            for (int i = 0; i < ac.length; i++) {
                if (one.equalsIgnoreCase(String.valueOf(ac[i]))) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
