package com.kaoyan.Exercise_41;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;                                       //用于记录最大最小元素下标。
        System.out.println("请输入int数组中元素的个数：");
        int n = sc.nextInt();                             //数组中元素个数
        int arr[] = new int[n];
        System.out.println("请输入int数组中的元素：");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;                                   //记录最小元素下标
            } else if (arr[i] > arr[max]) {
                max = i;                                   //记录最大元素下标
            }
        }
        int tempMin = arr[min];       //保存最小元素
        int tempMax = arr[max];       //保存最大元素
        arr[min] = arr[arr.length - 1];
        arr[max] = arr[0];
        arr[arr.length - 1] = tempMin;
        arr[0] = tempMax;               //实现交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
