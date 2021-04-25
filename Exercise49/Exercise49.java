package com.kaoyan.Exercise49;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        //采用一个循环控制报数，采用一个循环控制序号的递进，当人数为1时，停止。采用数组完成该题
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;  //用于计数1-3
        int surplus = n;//用于记录剩余人数
        int arr[] = new int[n];//采用数组记录序号,若值变为0，则表示该人已经退出圈子
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        do {
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {  //值不为0时，才计数
                    num++;
                    if (num == 3) { //num=3时，将该人退出圈子
                        arr[i] = 0;
                        //System.out.print(i+"\t");
                        surplus--;
                        num = 0;
                        if (surplus == 1) {
                            break; //剩余1人时，结束循环
                        }
                    }
                }
            }
        } while (surplus > 1);//剩余1人时，结束循环
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("最后留下的是原来的第" + (i + 1) + "位");
            }
        }
    }
}
