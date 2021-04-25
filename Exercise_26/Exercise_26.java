package com.kaoyan.Exercise_26;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        //星期日Sunday,星期一Monday...Tuesday,Wednesday,Thursday,Friday,Saturday
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期几的首位大写字母：");
        String str = sc.nextLine();
        switch (str.charAt(0)) {
            case 'S': {
                System.out.println("输入星期几的第二个小写字母：");
                str = sc.nextLine();
                switch (str.charAt(0)) {
                    case 'u':
                        System.out.println("星期日");
                        break;
                    case 'a':
                        System.out.println("星期六");
                        break;
                    default:
                        System.out.println("输入有误");
                        break;
                }
                break;
            }
            case 'M':
                System.out.println("星期一");
                break;
            case 'T': {
                System.out.println("输入星期几的第二个字母：");
                str = sc.nextLine();
                switch (str.charAt(0)) {
                    case 'u':
                        System.out.println("星期二");
                        break;
                    case 'h':
                        System.out.println("星期四");
                        break;
                    default:
                        System.out.println("输入有误");
                        break;
                }
                break;
            }
            case 'W':
                System.out.println("星期三");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
