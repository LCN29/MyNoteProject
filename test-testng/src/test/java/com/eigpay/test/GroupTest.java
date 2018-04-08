package com.eigpay.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Description: 分组测试
 *
 * @Author LCN
 * @Date 2018-04-08 上午 11:09
 */
public class GroupTest {

    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    @Test(groups = "transcation")
    public void runTransaction() {
        System.out.println("transcation");
    }

    @Test(groups = "transcation")
    public void runTransaction01() {
        System.out.println("transcation01");
    }

    @Test(groups = "database")
    public void testConnectDB() {
        System.out.println("testConnectDB");
    }

    @Test(groups = "database")
    public void testUseSQL() {
        System.out.println("testUserSQL");
    }

    @Test(dependsOnGroups = { "database", "transcation" })
    public void runFinal() {
        System.out.println("runFinal");
    }

}
