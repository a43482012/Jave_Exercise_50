package com.kaoyan;

public class DaYin9_917 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=");
                System.out.printf("%-5d", i * j);
                //System.out.printf("%5d",i*j),格式控制，%-5d左对齐，输出宽度为5
            }
            System.out.println();
        }
    }
}
