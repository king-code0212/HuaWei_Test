package com.example.test;

import java.util.*;

/**
 * @Auther: steel
 * @Date: 2020/10/28 16:12
 * @Description: 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class HJ13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        System.out.println(reverse(source));

    }

    public static String reverse(String sentence) {
        String[] a = sentence.split(" ");
        String result = "";
        for (int i= a.length-1 ; i>=0 ; i--) {
            result += a[i] + " ";
        }

        return result;
    }


}
