package com.kaoyan.Exercise_33;


public class Exercise_32 {
    public static void main(String[] args) {
        int square = 0;//记录数字的平方
        for (int i = 1; i < 100; i++) //1-99的平方，square的范围1<x<9801
        {
            square = i * i;
            if (square % 100 == i) //判断两位的同构数
            {
                System.out.printf("%-2d", i);
                System.out.println("\t是同构数," + "其平方为：" + i * i);
            } else if (square % 10 == i) //判断一位的同构数
            {
                System.out.print(i);
                System.out.println("\t是同构数," + "其平方为：" + i * i);
            }
        }
    }
}
