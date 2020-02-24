package com.lcn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 03:12
 */

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class SpringTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private SpringInterface springInterface;

    @Test
    public void testSaySpring() {
        String str = springInterface.saySpring();
        System.out.println(str);
        Assert.assertEquals(str, "Spring");
    }

}
