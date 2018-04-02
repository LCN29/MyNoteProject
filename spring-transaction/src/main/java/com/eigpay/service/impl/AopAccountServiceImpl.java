package com.eigpay.service.impl;

import com.eigpay.dao.AccountDao;
import com.eigpay.service.AccountService;
import org.springframework.stereotype.Service;


/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-03-31 下午 04:43
 */

public class AopAccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    /**
     * 转账方法
     * @param outAcct 转出账户
     * @param inAcct 转入账户
     * @param money 转账金额
     */
    @Override
    public void transfer(String outAcct, String inAcct, Double money){
        accountDao.decreaseMoney(outAcct, money);
        int num = 1 / 0;
        accountDao.increaseMoney(inAcct, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
