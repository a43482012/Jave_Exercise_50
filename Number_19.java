package com.kaoyan;

public class Number_19 {
    public static void main(String[] args) {
        int sum = 0;//统计个数
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i == j || i == k || j == k) {   //三层循环，求符合条件（没有重复数字）的三位数。
                    } else {
                        sum++;
                        System.out.printf("%-5d", i * 100 + j * 10 + k);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("共有："+sum+"个。");
    }
}
