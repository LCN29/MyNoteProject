package com.eigpay.service.impl;

import com.eigpay.dao.AccountDao;
import com.eigpay.service.AccountService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-03-31 下午 08:57
 */

@Transactional(propagation = Propagation.REQUIRED )
public class AnnotationAccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(String outAcct, String inAcct, Double money) {
        accountDao.decreaseMoney(outAcct, money);
        int num = 10/0;
        accountDao.increaseMoney(inAcct, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
