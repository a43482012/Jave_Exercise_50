package com.kaoyan.Exercise46;

public class Exercise46 {
    public static void main(String[] args) {
        int n = 5;  //n=1,2,3,4,5依次代表每个人
        System.out.println("第五个人的年龄为：" + fun(n));
    }

    public static int fun(int n) {
        if (n == 1) {
            return 10;
        } else {
            return fun(n - 1) + 2;  //f(n)=f(n-1)+2;
        }
    }
}
