package com.kaoyan;

import java.util.Scanner;

public class ZuoYiYouYi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if ((number & (number - 1)) == 0) {//若为2的次幂，则二进制表示中间只含有一个1,
            //number-1后1变为0,1之后的位置变为1，number&（nubmer-1)为0
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
