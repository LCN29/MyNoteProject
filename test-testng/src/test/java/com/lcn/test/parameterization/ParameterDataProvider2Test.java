package com.lcn.test.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 02:14
 */
public class ParameterDataProvider2Test {

    @Test(dataProvider = "dbconfig")
    public void testConnection(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }
    }

    @DataProvider(name = "dbconfig")
    public Object[] provideDbConfig() {
        Map<String, String> map = new HashMap<>(16);
        map.put("a", "123");
        map.put("b", "234");
        return new Object[]{ map };
    }

}
