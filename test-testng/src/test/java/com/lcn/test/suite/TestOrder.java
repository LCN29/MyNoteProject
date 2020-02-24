package com.lcn.test.suite;

import org.testng.annotations.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 上午 11:46
 */
public class TestOrder {

    @Test(groups={"orderBo", "save"})
    public void testMakeOrder() {
        System.out.println("testMakeOrder()");
    }

    @Test(groups={"orderBo", "save"})
    public void testMakeEmptyOrder() {
        System.out.println("testMakeEmptyOrder()");
    }

    @Test(groups="orderBo")
    public void testUpdateOrder() {
        System.out.println("testUpdateOrder()");
    }

    @Test(groups="orderBo")
    public void testFindOrder() {
        System.out.println("testFindOrder()");
    }

}
