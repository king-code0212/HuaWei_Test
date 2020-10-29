package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:51
 * @Description:
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 */
public class HJ7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int i = a.indexOf('.');
        String b = a.substring(i + 1);
        String result = a.substring(0, i);

        if (b.compareTo("5") >= 0) {
            System.out.println(Integer.parseInt(result) + 1);
        } else {
            System.out.println(result);
        }

    }
}
