package com.eigpay.test;

import org.testng.annotations.Test;

/**
 * Description: 超时测试
 *
 * @Author LCN
 * @Date 2018-04-08 上午 11:04
 */
public class TimeoutTest {

    @Test(timeOut = 5000)
    public void noTimeoutTest() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 300)
    public void timeoutTest() {
        while (true){
            // do nothing
        }
    }


}
