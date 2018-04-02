package com.eigpay.service.impl;

import com.eigpay.dao.AccountDao;
import com.eigpay.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-01 下午 01:29
 */
public class CodeAccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    /** 注入事务管理的模板 */
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String outAcct, String inAcct, Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                // 业务逻辑
                accountDao.decreaseMoney(outAcct, money);
                // 这里出现异常了
                int num = 1 / 0;
                accountDao.increaseMoney(inAcct, money);
            }
        });
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

}
