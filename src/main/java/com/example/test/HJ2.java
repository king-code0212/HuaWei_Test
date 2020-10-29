package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:48
 * @Description: 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class HJ2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String line1 = sc1.nextLine().toLowerCase();

        String line2 = sc1.nextLine().toLowerCase();

        char[] chars = line1.toCharArray();

        int count = 0;
        for (char v : chars) {
            if (v == line2.charAt(0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
