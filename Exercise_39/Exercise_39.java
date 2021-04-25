package com.kaoyan.Exercise_39;

import java.util.Scanner;

public class Exercise_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int gcd;        //gcd记录最大公约数
        if (m <= n) {
            gcd = m;
            fun(gcd, n);
        } else {
            gcd = n;
            fun(gcd, m);
        }
    }
    public static void fun(int gcd, int m) //求最大公约数,与最小公倍数函数
    {
        int mul = gcd * m;
        while (m % gcd != 0) {
            int tmp = m % gcd;
            m = gcd;
            gcd = tmp;
        }
        System.out.println("最大公约数是：" + gcd);
        System.out.println("最小公倍数是：" + mul / gcd);//最小公倍数等于m*n/gcd(m,n)
    }
}
