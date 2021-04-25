package com.kaoyan.Exercise_24;

public class Exercise_24 {
    public static void main(String[] args) {
        Long sum = 0L;      //保存累加和
        Long current = 1L;  //保存当前累乘值
        for (int i = 1; i <= 20; i++) {
            current *= i;
            //System.out.print(current+"  ");
            sum += current;
        }
        System.out.println("sum = " + sum);
    }
}
