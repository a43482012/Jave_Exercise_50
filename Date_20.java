package com.kaoyan;

import java.util.Scanner;

public class Date_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();// 输入年、月、日
        int sum = 0;          //用于统计天数
        for (int i = 1; i < month; i++) //循环计算month的前几个月的总天数。
        {
            sum += everyMonth(i);   //全部按照非闰年计算
        }
        sum += day;                   //加上day天数
        if (isLeap(year)) //若为闰年，+1天
        {
            sum++;
        }
        System.out.println("本年的第："+sum+"天");
    }

    //isLeap()判断是否为闰年
    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    //判断每个月的天数
    public static int everyMonth(int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;//按照非闰年计算
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            default:
                return 0;
        }
        //return 0;
    }
}
