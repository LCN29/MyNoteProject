package com.lcn.test;

import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 02:45
 */
public class MultipleThreadsTest {

    /** invocationCount 指定调用的次数为3次 */
    @Test(invocationCount = 3)
    public void loadTestThisWebsite() {
        System.out.println("你好");
    }

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void testThreadPools() {
        System.out.printf("线程Id : %s%n", Thread.currentThread().getId());
    }
}
