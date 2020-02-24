package com.lcn.test;

import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 01:46
 */
public class DependenceTest {

    @Test
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(dependsOnMethods = { "method1" })
    public void method2() {
        System.out.println("This is method 2");
    }

}
