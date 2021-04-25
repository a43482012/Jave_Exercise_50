package com.kaoyan;

public class WanShu_18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (fun(i))//判断是否是完数函数，是则输出
            {
                System.out.printf("%-5d", i);
            }
        }
    }

    public static boolean fun(int x) {
        int sum = 0;//真因子累加和
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (sum == x) //判断完数与否
        {
            return true;
        } else {
            return false;
        }
    }
}

