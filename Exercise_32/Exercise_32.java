package com.kaoyan.Exercise_32;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//输入4位数
        int change = 0;               //用于记录代替后的数字
        while (number != 0) //第一位和第四位交换，第二位和第三位交换，相当于逆置，在逆置的同时，进行每位的变换操作。
        {
            change *= 10;
            change += ((number % 10 + 5) % 10);//每位加5，取模10
            number /= 10;
        }
        System.out.printf("%04d", change);//%4d控制输出4位，0用于补足前面的0
    }
}
