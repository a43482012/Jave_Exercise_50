package com.kaoyan.Exercise_38;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int temp = number_1;                     //用于记录每一项的值
        int s = temp;                            //用于统计和s
        for (int i = 2; i <= number_2; i++) {
            temp = temp * 10 + number_1;         //i=2(temp=22),i=3(temp=222)...
            s += temp;
            //System.out.println(temp);
        }
        System.out.println("输入数字求和结果为：" + s);

    }
}
