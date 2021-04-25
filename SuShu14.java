package com.kaoyan;

//import static java.lang.StrictMath.sqrt;

public class SuShu14 {
    public static void main(String[] args) {
        boolean flag;
        int sum = 0;//统计个数
        for (int i = 101; i < 201; i++) {
            flag = true;//标志
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;//只要一次可以整除，则不是素数，并跳出循环
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
                sum++;
            }

        }
        System.out.println();
        System.out.println(sum + "个");
    }
}

