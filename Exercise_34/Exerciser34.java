package com.kaoyan.Exercise_34;

import java.util.Scanner;

public class Exerciser34 {
    public static void main(String[] args) {
        // 声明一个整型x (范围-2147483648——2147483647)
        System.out.println("请输入一个不小于7位的整数(范围1000000~2147483647)：");
        int x = new Scanner(System.in).nextInt();
        if (x < 10000000) {
            System.out.println("输入有误");
            return;
        }
        x = x / 1000;
        x = x % 10000;
        System.out.println("原数从右端开始的4~7位为：" + x);
    }
}
