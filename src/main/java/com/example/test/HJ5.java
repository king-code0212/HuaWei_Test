package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:50
 * @Description: 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class HJ5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.next();
            a = a.substring(2);
            System.out.println(Long.parseLong(a, 16));
        }

    }
}
