package com.kaoyan.Exercise16;

public class Exercise16 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {            //行数
            for (int j = 0; j < 3 - i; j++) {    //每行*前空格数量
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) { //每行*图案数量
                System.out.print("*");
            }
            for (int j = 0; j < 3 - i; j++) {     //每行*后空格数量
                System.out.print(" ");
            }
            System.out.println();                 //行间空白
            System.out.println();
        }
    }
}
