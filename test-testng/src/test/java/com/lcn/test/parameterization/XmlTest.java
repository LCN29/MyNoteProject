package com.lcn.test.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 01:53
 */
public class XmlTest {

    @Test
    @Parameters({ "dbconfig", "poolsize" })
    public void createConnection(String dbconfig, int poolsize) {
        System.out.println("数据库配置文件 : " + dbconfig);
        System.out.println("连接池的数量 : " + poolsize);

        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\"+dbconfig;
        System.out.println("数据库配置文件的地址 ："+path);
    }

}
