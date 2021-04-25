package com.kaoyan;

public class Exercise_21 {
    public static void main(String[] args) {
        System.out.print("该数是：");
        for (int i = 0; i <= 100000; i++) {
            int x = (int) Math.sqrt(i + 100);
            int y = (int) Math.sqrt(i + 268);
            if (x * x == (i + 100) && y * y == (i + 268)) //判断是否为符合条件。
            {
                System.out.print(i + "\t");
            }
        }
    }
}
