package com.kaoyan.Exercise_35;


public class Exercise35 {
    public static void main(String[] args) {
        //分析：当一位时，显然有4个奇数
        //当2位数时，除了个位，十位的可能：A(7,1)-A(6,0)个排列，数量为【A(7,1)-A(6,0)】*4
        //当3位数时，除了个位，十位和百位的可能：A(7,2)-A(6,1)个排列，数量为【A(7,2)-A(6,1)】*4
        // ----------------A（7,2）是个位和十位数的排列个数，A（6,1）是百位0时，十位数字的个数，故要减去
        //.................................................
        //当为i位数时，数量为【A(7,i-1)-A(6,i-2)】*4
        int sum = 4;//统计奇数个数,初始值为一位数时，奇数的个数
        int temp1;//用于保存A(7,i-1)
        int temp2;//用于保存A(6,i-2)
        for (int i = 2; i <= 8; i++) {
            temp1 = 1;
            temp2 = 1;//每次循环重置
            int m = 7;
            int n = 6;
            for (int j = 0; j < i - 1; j++) {
                temp1 *= (m--); //1*7,1*7*6, 1*7*6*5....
            }
            if (i - 2 == 0)
                temp2 = 1;  //A(6,0)=0
            for (int k = 0; k < i - 2; k++) {
                temp2 *= (n--);//1*6,1*6*5,1*6*5*4...
            }
            //System.out.printf("%d,%10d\\\\\\", temp1, temp2);
            sum += (temp1 - temp2) * 4;
        }
        System.out.println("0-7所能组成的奇数个数为：" + sum);
    }
}
