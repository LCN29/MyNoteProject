package com.eigpay.test;

import org.testng.annotations.Test;

/**
 * Description: 异常通过测试
 *
 * @Author LCN
 * @Date 2018-04-08 上午 10:53
 */
public class ExceptionPassTest {

    @Test(expectedExceptions = {ArithmeticException.class, UnsupportedOperationException.class})
    public void testException() {
        int a = 10 / 0;
        System.out.println(a+"多少");
    }

}
