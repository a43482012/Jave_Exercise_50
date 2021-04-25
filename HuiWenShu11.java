package com.kaoyan;

import java.util.Scanner;

public class HuiWenShu11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 10000 || a > 99999) {
            System.out.println("不是一个5为数");//临界判断
            return;
        }
        if ((a / 10000 == a % 10) && ((a / 1000) % 10 == (a % 100) / 10))
        //a/10000==a%10判断个位和最高位
        // a/1000)%10==(a%100)/10  判断十位和次高位
        {
            System.out.println("a是回文数");
        } else
            System.out.println("a不是回文数");
    }
}
