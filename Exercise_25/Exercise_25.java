package com.kaoyan.Exercise_25;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        int sum = 0;//用于计算奇数和
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
