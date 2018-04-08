package com.eigpay.test.parameterization;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 02:28
 */
public class ParameterDataProvider4Test {

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(ITestContext context) {
        Object[][] result = null;
        for (String group : context.getIncludedGroups()) {
            System.out.println("group : " + group);
            if ("groupA".equals(group)) {
                result = new Object[][] { { 1 } };
                break;
            }
        }
        if (result == null) {
            result = new Object[][] { { 2 } };
        }
        return result;
    }

    @Test(dataProvider = "dataProvider", groups = {"groupA"})
    public void test1(int number) {
        System.out.println(number+"");
    }

    @Test(dataProvider = "dataProvider", groups = "groupB")
    public void test2(int number) {
        System.out.println(number+"");
    }

}
