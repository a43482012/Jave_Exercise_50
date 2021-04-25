package com.kaoyan;

import java.util.Scanner;

public class switch分支12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("输入错误");
            return;
        }
        score /= 10;
        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");//0~60分不合格，不包括60分
                break;
            case 6:
                System.out.println("及格");//60~70分及格，不包括70分
                break;
            case 7:
                System.out.println("中");//70~80分中，不包括80分
                break;
            case 8:
                System.out.println("良");//80~90分良，不包括90分
                break;
            case 9:
            case 10:
                System.out.println("优");//90~100分和100分 及格，包括100分
                break;
            default:
        }
    }
}
