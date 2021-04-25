package com.kaoyan.Exercise44;

public class Exercise44 {
    public static void main(String[] args) {
        //可以令a，b，c为字符变量，令'x','y','z'为字符常量，将其根据条件赋值给a,b,c，最后结果即为比赛名单
        //可以采用三层循环，取得符合条件的赋值剔除，便得到结果
        char a, b, c;
        for (a = 'x'; a <= 'z'; a++) {
            for (b = 'x'; b <= 'z'; b++) {
                if (a != b) //避免a，b匹配重复
                {
                    for (c = 'x'; c <= 'z'; c++) {
                        if (a != c && b != c) //避免a，c和b，c匹配重复
                        {
                            if (a != 'x' && c != 'x' && c != 'z') {
                                System.out.println("比赛名单为：" + 'a' + "对" + a);
                                System.out.println("比赛名单为：" + 'b' + "对" + b);
                                System.out.println("比赛名单为：" + 'c' + "对" + c);
                            }
                        }
                    }
                }

            }
        }
    }
}
