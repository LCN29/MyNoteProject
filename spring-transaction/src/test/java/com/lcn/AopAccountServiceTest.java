package com.lcn;

import com.lcn.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-03-31 下午 02:32
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class AopAccountServiceTest {

    /** 此处应该注入代理类, 只有代理类才进行了增强，如果注入了还是实现类，无法达到事务的作用 */
    @Resource(name = "transactionProxyFactory")
    private AccountService accountService;

    private String inAcct = "aaa";
    private String outAcct = "bbb";
    private Double money = 10D;

    @Test(expected = ArithmeticException.class)
    public void transferTest() {
        accountService.transfer(inAcct, outAcct, money);
    }

}
