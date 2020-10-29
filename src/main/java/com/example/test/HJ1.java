package com.example.test;

import java.util.Scanner;

/**
 * @Auther: steel
 * @Date: 2020/10/29 10:47
 * @Description: 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class HJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        System.out.println(arr[arr.length-1].length());
    }

}
