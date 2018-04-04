package com.eigpay;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-04 上午 08:33
 */
public class Test {

    private int a = 123;

    public void test() {
        System.out.println("Test");
        InnerClass classs = new InnerClass();
        classs.show();
    }

    class InnerClass{
        public void show() {
            System.out.println(a+"个");
        }
    }

}
