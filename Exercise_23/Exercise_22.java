package com.kaoyan.Exercise_23;

public class Exercise_22 {
    public static void main(String[] args) {
        //规律：前一项的分母作为后一项的分子，且后一项的分母为前两项的分母之和
        double member = 1.0;   //分子
        double deno_1 = 1.0;   //分母前两项中的第一项，初始值为1.0
        double deno_2 = 2.0;   //分母前两项中的第二项，初始值为2.0
        double sum = 2.0 / 1.0; //统计和

        for (int i = 1; i < 20; i++) {
            //计算i项的分数
            member = deno_2;
            double temp = deno_2;
            deno_2 += deno_1;
            deno_1 = temp;
            //统计num
            sum += (deno_2 / member);
        }
        System.out.println(sum);
    }
}
