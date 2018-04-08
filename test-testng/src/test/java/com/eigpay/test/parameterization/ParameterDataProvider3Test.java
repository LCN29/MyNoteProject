package com.eigpay.test.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 02:23
 */
public class ParameterDataProvider3Test {

    /** 如果dataProvider没有指定对应的name属性，默认为方法名 */
    @DataProvider(name = "provideNumbers")
    public Object[][] provideNumbers(Method method) {
        Object[][] result = null;
        if (method.getName().equals("two")) {
            result = new Object[][] { new Object[] { 2 }};
        }
        else if (method.getName().equals("three")) {
            result = new Object[][] { new Object[] { 3 }};
        }
        return result;
    }

    @Test(dataProvider = "provideNumbers")
    public void two(int param) {
        System.out.println("Two received: " + param);
    }

    @Test(dataProvider = "provideNumbers")
    public void three(int param) {
        System.out.println("Three received: " + param);
    }

}
