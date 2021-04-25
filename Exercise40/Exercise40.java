package com.kaoyan.Exercise40;

import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double sum = 0;                  //分数累加和
        if (number < 1) {
            System.out.println("输入有误");
        }
        if (number % 2 == 0) {
            for (int i = 2; i <= number; i += 2) {
                sum += (1.0 / i);       //输入number为偶数时，调用函数求1/2+1/4+...+1/n
            }
        } else {
            for (int i = 1; i <= number; i += 2) {
                sum += (1.0 / i);       //当输入number为奇数时，调用函数1/1+1/3+...+1/n
            }
        }
        System.out.println("累加和为：" + sum);
    }
}
