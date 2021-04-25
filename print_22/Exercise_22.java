package com.kaoyan.print_22;

import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 0;
        int reverseNumber = 0;
        while (x != 0) {
            reverseNumber *= 10;      //逆式的每一位扩大10倍
            reverseNumber += x % 10;    //逆式加上个位
            x /= 10;                  //x缩小10倍
            num++;                  //统计位数
        }
        System.out.println("它是" + num + "位数");
        System.out.println("它的逆序为：" + reverseNumber);
    }

}
