package com.eigpay.test;

import org.testng.annotations.Test;

/**
 * Description: 忽略某个测试方法
 *
 * @Author LCN
 * @Date 2018-04-08 上午 11:00
 */
public class IngoreTest {

    @Test(enabled = false)
    public void test01() {
        System.out.println("test01");
    }

    @Test
    public void test02() {
        System.out.println("test02");
    }


}
