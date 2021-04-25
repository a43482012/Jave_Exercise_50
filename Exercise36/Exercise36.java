package com.kaoyan.Exercise36;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        for (int i = 0; i < 7; i++) //接收7个数，循环7次
        {
            number = sc.nextInt();
            if (number < 1 || number > 50) {
                System.out.println("输入有误");
                return;
            }
            for (int j = 0; j < number; j++) //number个*
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
