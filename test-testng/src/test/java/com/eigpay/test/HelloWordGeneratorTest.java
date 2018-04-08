package com.eigpay.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Description: hello word入门程序
 *
 * @Author LCN
 * @Date 2018-04-08 上午 08:29
 */
public class HelloWordGeneratorTest {

    @Test
    public void testGenerateEmail() {
        HelloWordGenerator generator = new HelloWordGenerator();
        String str = generator.generateHelloWord();
        // 不为空判断
        Assert.assertNotNull(str);
        // 相同判断
        Assert.assertEquals(str, "Hello Word !");
    }

}
