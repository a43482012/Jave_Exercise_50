package com.kaoyan;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.printf("星期一");
                break;
            case 2:
                System.out.printf("星期二");
                break;
            case 3:
                System.out.printf("星期三");
                break;
            case 4:
                System.out.printf("星期四");
                break;
            case 5:
                System.out.printf("星期五");
                break;
            case 6:
                System.out.printf("星期六");
                break;
            case 7:
                System.out.printf("星期日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
