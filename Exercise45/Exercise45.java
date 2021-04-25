package com.kaoyan.Exercise45;

public class Exercise45 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fun(a));
    }

    public static int fun(int n)//采用递归完成阶乘，出口n==1，
    {
        if (n == 1) {
            return 1;
        } else {
            return n * fun(n - 1);
        }
    }
}
