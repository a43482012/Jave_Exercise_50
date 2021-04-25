package com.kaoyan;

public class SanJiao_TuAn {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {           //行数
            for (int j = 0; j < 3 - i; j++) {   //每行前空格数量
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {//每行图案刷领
                System.out.print("*");
            }
            for (int j = 0; j < 3 - i; j++) {   //每行尾空格数量
                System.out.print(" ");
            }
            System.out.println();               //行间空白
            System.out.println();
        }
    }
}


