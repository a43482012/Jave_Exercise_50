package com.kaoyan.Exercise_28;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("最大值为：");
        int max;
        max = (a > b ? a : b) > c ? (a > b ? a : b) : c;//(a>b?a:b)取a和b中的最大值，记为tmp，
        // tmp>c?tmp:c;取tmp和c间的最大值
        System.out.println(max);
    }
}
