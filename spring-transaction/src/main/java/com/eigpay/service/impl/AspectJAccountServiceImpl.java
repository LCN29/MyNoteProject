package com.eigpay.service.impl;

import com.eigpay.dao.AccountDao;
import com.eigpay.service.AccountService;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-03-31 下午 07:32
 */
public class AspectJAccountServiceImpl implements AccountService {

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
