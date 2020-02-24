package com.lcn.one.lambda;

/**
 * description: lambda表达式
 *
 * @author LCN
 * @date 2018-02-22 上午 11:54
 */
public class Main {

    public static void main(String[] args) {
        Base base = new Base();
        base.initLambadInterface1();
        base.initLambadInterface2();

        base.saySomeWord(str -> {
            System.out.println("我能说什么吗？呵呵...\n这时候只要"+str);
        },"大喊666");

    }

}
