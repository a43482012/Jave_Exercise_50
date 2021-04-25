package com.kaoyan.Exercise43;

public class Exercise43 {
    public static void main(String[] args) {
        //采用数组，arr[9]=1,    arr[8]=(1+1)*2=4,  arr[7]=(4+1)*2=10......
        int arr[] = new int[10];
        arr[9] = 1;
        for (int i = 8; i >= 0; i--) {
            arr[i] = (arr[i + 1] + 1) * 2;
        }
        System.out.println("第一天共摘了：" + arr[0] + "个桃子");
    }
}
