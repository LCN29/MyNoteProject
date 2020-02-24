package com.lcn.test;

import org.testng.annotations.*;

/**
 * Description: TestNG 注解的生命周期
 *
 * @Author LCN
 * @Date 2018-04-08 上午 08:42
 */
@Test(groups = "base-group")
public class AnnotaionLifeCycleTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite执行了");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest执行了");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass执行了");
    }

    /** 如果想要使 group相关的注解起作用，需要指定groups属性 */
    @BeforeGroups(groups = "base-group")
    public void beforeGroups() {
        System.out.println("@BeforeGroups执行了");
    }

    /** method相关的注解比较特殊，其他的注解只在整个测试过程运行一次，但是method会在每个test方式执行都执行一次 */
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod执行了");
    }

    @Test
    public void test01() {
        System.out.println("@Test01执行了");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod执行了");
    }

    @AfterGroups(groups = "base-group")
    public void afterGroups() {
        System.out.println("@AfterGroups执行了");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass执行了");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest执行了");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite执行了");
    }

}
