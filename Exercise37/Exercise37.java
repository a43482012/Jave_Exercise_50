package com.kaoyan.Exercise37;

public class Exercise37 {
    public static void main(String[] args) {
        //分析：可以20元先用于买完饮料，可以买6瓶，剩余2元，用瓶子换回6元，则共有8元
        //8元用于买2瓶饮料，剩余2元，用瓶子换回2元，则共4元，还可以买一瓶,再次瓶子换回后，共2元，不可以买饮料
        int sum = 0;//用于统计饮料瓶数
        int money = 20;
        while (money >= 3) {
            sum += money / 3;
            money = money % 3 + money / 3;
        }
        System.out.println("最多可以喝到：" + sum + "瓶饮料。");
    }
}
