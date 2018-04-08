package com.eigpay.test.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 02:09
 */
public class ParameterDataProviderTest {

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        return new Object[][] { { 10, 20 }, { 100, 110 }, { 200, 210 } };
    }

    @Test(dataProvider = "provideNumbers")
    public void test(int number, int expected) {
        System.out.println("Number: "+ number + "  Number: "+ expected);
    }

}
