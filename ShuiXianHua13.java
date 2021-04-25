package com.kaoyan;

import java.util.Scanner;

public class ShuiXianHua13 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int num = 0, tmp = i, n;
            while (tmp != 0) {
                n = tmp % 10;//n为个位数值
                tmp /= 10;//tmp缩小10倍
                num += n * n * n;//累计n的立方和
            }
            if(num==i)//判断是否为水仙花数
                System.out.print(i+" ");
        }
    }
}
