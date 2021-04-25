package com.kaoyan.Exercise42;

public class Exercis42 {
    public static void main(String[] args) {
        //分析：规律为1,1,2,3,5,8,13,21、、、为斐波那契数列，使用分治策略
        int fib[] = new int[20];          //假设统计20个月的兔子对数
        fib[0] = 1;                       //赋起始值
        fib[1] = 1;
        for (int i = 2; i < 20; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];   //赋值fab数组
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("第" + (i + 1) + "个月的兔子对数为：" + fib[i]);
        }
    }
}
