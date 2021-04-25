package com.kaoyan.Exercise_27;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("最大值为：");
        if (a > b) {
            if (a > c) //a>b,a>c则max=a
            {
                System.out.println(a);
            } else      //c>a>b,则max=c
            {
                System.out.println(c);
            }
        } else {
            if (b > c)  //b>a,b>c,则max=b
            {
                System.out.println(b);
            } else //c>b>a,则max=c
            {
                System.out.println(c);
            }
        }
    }

}
