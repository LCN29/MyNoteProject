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
 * @Date 2018-03-31 下午 09:00
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-annotation.xml")
public class AnnotationAccountServiceTest {

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
