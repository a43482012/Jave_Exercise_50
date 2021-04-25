package com.kaoyan.Exercise_29;

public class Exercise_29 {
    public static void main(String[] args) {
        double sum = 100.0;//记录经过的距离,初始为100
        double high = 100.0;//记录每次落地前球的反弹高度
        for (int i = 0; i < 9; i++) //循环计算从第1次落地到第10次落地之间，之间球经过的距离。
        {
            high /= 2;//反弹高度缩小一半
            sum += high * 2;//落地之前，+两倍的反弹高度
//            System.out.println(num+"\t");
        }
        System.out.println("第10次落地时，经过：" + sum + "米");
        System.out.println("第10次反弹：" + high / 2 + "米高");
    }
}
