package com.eigpay;

import com.eigpay.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-01 下午 01:35
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-code.xml")
public class CodeAccountServiceTest {

    @Resource
    private AccountService accountService;

    private String inAcct = "aaa";
    private String outAcct = "bbb";
    private Double money = 10D;

    @Test(expected = ArithmeticException.class)
    public void transferTest() {
        accountService.transfer(inAcct, outAcct, money);
    }

}
