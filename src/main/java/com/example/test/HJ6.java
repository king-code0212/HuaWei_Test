package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:51
 * @Description:
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 */
public class HJ6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long inputLong = sc.nextLong();

        int i = 2;
        while (inputLong >1 && i<inputLong) {

            if (inputLong % i == 0) {
                System.out.print(i + " ");
                inputLong = inputLong / i;
            } else {
                i++;
            }
        }

        if (i>=inputLong) {
            System.out.print(i + " ");
        }

    }
}
