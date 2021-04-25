package com.kaoyan.Exercise50;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
//如果是正数，则绝对值为其本身，若为负数，则为-2147483648,则绝对值无法用int类型表示，需要使用long，
// 若大于-2147483648，则可以根据补码表示的规则，进行包括符号位取反，加1.
//System.out.println(Integer.MIN_VALUE);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.println(x);
        } else if (x == -2147483648) {
            System.out.println(2147483648L);
        } else {
            System.out.println(~x + 1);
        }
    }
}

//
//    Scanner sc = new Scanner(System.in);
//    int intValue = sc.nextInt();
//        if (intValue == -2147483648) {
//                System.out.println(2147483648L);
//                } else {
//                int abs = (intValue ^ (intValue >> 31)) - (intValue >> 31);
//                System.out.println(abs);
//                }
///*如果intValue是正数
// *右移31位之后，变为0x00000000，即0，与intValue异或是intValue，减0后还是本身
// *如果intValue是负数
// * 右移31位，变为0xffffffff，即-1，与intValue异或后，变为连同符号位一起取反。-（-1）即+1，
// * 故变为-intValue
// * 若intValue为-2147483648，则0x7fffffff+1,结果出错，应单独判断。
// * */