package com.kaoyan.Exercise48;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数的个数：");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("请输入n个整数：");
        for (int i = 0; i < n; i++) {   //输入n个数字
            arr[i] = sc.nextInt();
        }
        System.out.print("请输入m：");
        int m = sc.nextInt();
        //分析 eg：1,2,3,4,5,6,7，m=4,可以整体逆置，变为7,6,5,4,3,2,1.再对前4位进行逆置，后面数字逆置，得到结果
        //故可以设置逆置函数，将数组整体逆置一次，前m位逆置一次，余下数再次逆置，得到结果。
        fun(arr, 0, arr.length - 1);
        fun(arr, 0, m - 1);
        fun(arr, m, arr.length - 1);
        System.out.print("结果为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");  //输出数组元素
        }
    }

    private static void fun(int[] arr, int m, int i) { //逆置函数
        int tmp = 0;
        for (int j = m; j <= (i - 1) / 2; j++) {
            tmp = arr[j];
            arr[j] = arr[i - j];
            arr[i - j] = tmp;
        }
    }
}
