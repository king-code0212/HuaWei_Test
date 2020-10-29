package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:50
 * @Description:
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class HJ4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();

        String line2 = sc.nextLine();


        change(line1);
        change(line2);

    }


    public static void change(String source) {
        int length = source.length();

        String temp = "";
        if (length % 8 != 0) {
            for (int i=0 ; i<8-length%8 ; i++) {
                temp += "0";
            }
        }

        source = source + temp;

        for (int j=0 ; j < source.length()/8 ; j++) {
            System.out.println(source.substring(j*8, (j+1)*8));
        }

    }

}
