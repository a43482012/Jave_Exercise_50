package com.kaoyan.Exercise_30;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;//记录整除9的个数
        while (number > 1) {
            if (number % 9 == 0) //满足整除的条件
            {
                sum++;
                number /= 9;
            } else {
                System.out.println("输入的数不可以被9整除");
                return ;
            }
        }
        System.out.println("输入的数可以被 " + sum+"个9整除");
    }
}
