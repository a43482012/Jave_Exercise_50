package com.kaoyan.Exercise47;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        //不妨假设已经排好序的数组为 1,2,3,4,7,8,9，依次测试插入0,1,10
        int arr[] = new int[]{1, 2, 3, 4, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int insertNumber = sc.nextInt();
        int tmp[] = new int[arr.length + 1];//插入数据后，数组需要增加1个长度，故新建数组
        int i = arr.length - 1;
        while (insertNumber < arr[i]) //定位插入位置i+1
        {
            i--;
            if (i == -1) {
                break;//下标为-1时，代表插入位置应为下标0
            }
        }
        for (int j = arr.length; j - 1 > i; j--) {
            tmp[j] = arr[j - 1]; //将i+1和之后的arr数组元素后移一个位置，移动到tmp中
        }
        tmp[i + 1] = insertNumber; //令i+1位置为新元素
        //若插入位置位下标0位置，则无需进行i位置之前元素的移动。
        if (i != -1) {
            for (int j = i; j >= 0; j--) {
                tmp[j] = arr[j]; //将i及之前的arr数组元素移动到tmp中
            }
        }
        for (int j = 0; j < tmp.length; j++) {
            System.out.print(tmp[j] + "\t");//输出数组tmp的值
        }
    }
}
